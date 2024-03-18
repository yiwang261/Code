<template>
    <div class="category">
      <h3>{{ title }}</h3>
      <slot></slot>
    </div>
</template>

<script >
export default {
  name:'Category',
  data(){
    return{

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
    width: 200px;
    height: 200px;
  }
  h3{
    text-align: center;
    background: orange;
  }
</style>