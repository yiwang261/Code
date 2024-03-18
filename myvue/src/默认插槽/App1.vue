<template>
<!--  <span>{{num}}</span>-->
<!--  <MyCom  ref="aaa"/>-->
  <div class="container">
    <Category  :title="'美食'"  :list="foods">
      <img src="../assets/luo.webp" alt="error"/>
    </Category>

    <Category  :title="'游戏'"  :list="games">
            <ul>
                <li v-for="game in games" >{{game}}</li>
            </ul>
    </Category>
    <Category  :title="'电影'"  :list="films">
      <img src="../assets/logo.png" alt="error"/>
    </Category>
  </div>


</template>

<script>
  // import MyCom from "@/components/MyCom.vue";
  import Category from "@/默认插槽/Category.vue";
export default {
  name: 'App',
  components: {
    // MyCom,
    Category
  },
  data(){
    return{
      foods:['火锅','烧烤','辣条','牛排'],
      games:['穿越火线','英雄联盟','荒野大镖客','超级玛丽'],
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

<style>
  .container{
    display: flex;
    justify-content: space-around;
  }
  img{
    width: 100%;
  }
</style>
