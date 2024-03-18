<template>
  <el-container class="layout-container-demo" style="height: 100vh">
    <el-aside width="auto"  >
      <el-scrollbar>
        <el-menu
            class="el-menu-vertical-demo"
            :collapse="useIsCollapse().isCollapse"
        >
          <Tree :menuList="menuList"/>
        </el-menu>
      </el-scrollbar>
    </el-aside>

    <el-container>
      <el-header style="text-align: right; font-size: 12px; border-bottom: 1px solid #ccc">
        <el-button @click="changeArrow()" style="float: left; margin-top: 15px;width: 30px;height: 25px;">
          <el-icon size="40px" style="float: left; margin-top: 12px;height: 20px;width: 20px;margin-bottom: 10px">
              <component :is="arrow"/>
          </el-icon>
        </el-button>

        <div class="toolbar">
          <el-dropdown>
            <el-icon style="margin-right: 8px; margin-top: 1px"
            ><setting
            /></el-icon>
            <template #dropdown>
              <el-dropdown-menu>
                <el-dropdown-item>View</el-dropdown-item>
                <el-dropdown-item>Add</el-dropdown-item>
                <el-dropdown-item>Delete</el-dropdown-item>
              </el-dropdown-menu>
            </template>
          </el-dropdown>
          <span>Tom</span>
        </div>
      </el-header>

      <el-main>
        <el-scrollbar>
          <el-table :data="tableData">
            <el-table-column prop="date" label="Date" width="140" />
            <el-table-column prop="name" label="Name" width="120" />
            <el-table-column prop="address" label="Address" />
          </el-table>
        </el-scrollbar>
      </el-main>
    </el-container>
  </el-container>
</template>

<script lang="ts" setup>
import {computed, reactive, ref, shallowReactive, shallowRef, watch} from 'vue'

import Tree from "@/components/Tree.vue";
import {useIsCollapse} from "@/stores/isCollapse";
import {ArrowLeftBold, ArrowRightBold, Setting} from "@element-plus/icons-vue";

let isCollapse = ref<boolean>();

let arrow = shallowRef<any>(ArrowLeftBold);
function changeArrow():void {
    useIsCollapse().changeCollapse();
    arrow.value = useIsCollapse().isCollapse ?  ArrowRightBold : ArrowLeftBold;
}
const item = {
  date: '2016-05-02',
  name: 'Tom',
  address: 'No. 189, Grove St, Los Angeles',
}
const tableData = ref(Array.from({ length: 20 }).fill(item))

const menuList = reactive([
  {
    name:"首页",
    icon:"Home",
    path:"/dashboard",
  },
  {
    name:"用户管理",
    icon:"User",
    path:"/user",
    children:[
      {
        name:"用户列表",
        icon:"User",
        path:"/user/list",
        children:[
          {
            name:"aaa",
            icon:"Home",
            path:"/aaa",
            children:[
                {
                  name:"ccc",
                  icon:"Home",
                  path:"/ccc",
                },
                {
                  name:"ddd",
                  icon:"Home",
                  path:"/ddd",
                },
            ]
          },
          {
            name:"bbb",
            icon:"Home",
            path:"/ccc",
          },
        ]
      },
      {
        name:"用户添加",
        icon:"UserAdd",
        path:"/user/add",
      },
      {
        name:"用户删除",
        icon:"UserDelete",
        path:"/user/delete",
      },
    ]
  },
  {
    name:"角色管理",
    icon:"Role",
    path:"/role",
    children:[
      {
        name:"角色列表",
        icon:"Role",
        path:"/role/list",
      },
      {
        name:"角色添加",
        icon:"RoleAdd",
        path:"/role/add",
      },
      {
        name:"角色删除",
        icon:"RoleDelete",
        path:"/role/delete",
      },
    ]
  },
  {
    name:"权限管理",
    icon:"Permission",
    path:"/permission",
    children:[
      {
        name:"权限列表",
        icon:"Permission",
        path:"/permission/list",
      },
      {
        name:"权限添加",
        icon:"PermissionAdd",
        path:"/permission/add",
      }
    ]
  },
  {
    name:"菜单管理",
    icon:"Menu",
    path:"/menu",
  },
  {
    name:"部门管理",
    icon:"Department",
    path:"/department",
  }

])

</script>

<style scoped>
.el-header {
  position: relative;
  background-color: var(--el-color-primary-light-7);
  color: var(--el-text-color-primary);
}
.toolbar {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  height: 100%;
  right: 20px;
}
</style>
