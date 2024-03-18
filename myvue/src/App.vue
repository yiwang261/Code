<template>
<!--  <span>{{num}}</span>-->
<!--  <MyCom  ref="aaa"/>-->
  <div class="container">

    <Category  :title="'游戏'"  >
      <template #center="slotProps">
        <ul>
          <li v-for="game in slotProps.games" >{{game}}</li>
        </ul>
      </template>

      <template #footer="xxx">
          <a :href="xxx.link">aaa</a>
      </template>
    </Category>

    <Category  :title="'游戏'"  >
      <template v-slot="aaaa">
        <ol>
          <li v-for="game in aaaa.games" >{{game}}</li>
        </ol>
      </template>
    </Category>

    <Category  :title="'游戏'"  >
      <template v-slot:center="bbbb">
        <h4>
          <li v-for="game in bbbb.games" >{{game}}</li>
        </h4>
      </template>
    </Category>


  </div>


</template>

<script>
  // import MyCom from "@/components/MyCom.vue";
  import Category from "/src/components/Category.vue"
export default {
  name: 'App',
  components: {
    // MyCom,
    Category
  },
  data(){
    return{
      foods:['火锅','烧烤','辣条','牛排'],
      // games:['穿越火线','英雄联盟','荒野大镖客','超级玛丽'],
      films:['《教父》','《火影忍者》','《迪迦奥特曼》','拆弹专家'],
    }
  },
  mounted() {
  },
  methods:{
    // add(n){
    //   this.num+=n
    // }
  }
}
</script>

<style scoped>
  .container{
    display: flex;
    justify-content: space-around;
  }
  img{
    width: 100%;
    height: 50%;
  }
</style>
