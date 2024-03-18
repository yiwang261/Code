<script setup lang="ts">
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting, ArrowRightBold, ArrowLeftBold,
} from '@element-plus/icons-vue'
import {useRouter,useRoute} from "vue-router";



const list= defineProps(['menuList'])

const pushRouter = (path:string)=>{
    useRouter().push({
      path:path,
    })
}


</script>

<template>

  <template v-for="item in list.menuList">
    <template v-if="item.children">
      <el-sub-menu :index="item.path" style="overflow: hidden">
        <template #title>
          <el-icon><location /></el-icon>
          <span>{{item.name}}</span>
        </template>
        <Tree :menuList="item.children" />
      </el-sub-menu>
    </template>

    <template v-else>
      <el-menu-item :index=item.path @click="pushRouter(item.path)">
        <el-icon><icon-menu /></el-icon>
        <span>{{ item.name }}</span>
      </el-menu-item>
    </template>

  </template>


</template>

<style scoped>

</style>