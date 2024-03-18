<template>
    <div class="category">
      <h3>{{ title }}</h3>

      <slot name="center"></slot>
      <br>
      <slot name="footer"></slot>
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
    width: 300px;
    height: 400px;

  }
  h3{
    text-align: center;
    background: blue;
  }
</style>