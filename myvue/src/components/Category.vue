<template>
    <div class="category">
      <h3>{{ title }}</h3>
      <slot name="center" :games="games"></slot>

      <slot name="footer" :link="'https://www.baidu.com'"></slot>
<!--      <slot name="center"></slot>-->
<!--      <br>-->
<!--      <slot name="footer"></slot>-->
    </div>
</template>

<script >
export default {
  name:'Category',
  data(){
    return{
      games:['穿越火线','英雄联盟','荒野大镖客','超级玛丽'],
    }
  },
  props:{
    title:''
  }
}

</script>
<style scoped>
  .category{
    background: skyblue;
    width: 300px;
    height: 400px;

  }
  h3{
    text-align: center;
    background: blue;
  }
</style>