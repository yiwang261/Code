<template>
  <form >
    <span style="font-weight: bolder">添加品牌</span><br>
    品牌名称:<input type="text" v-model="brand.brandName"><br>
    企业名称:<input type="text" v-model="brand.companyName"><br>
    排序:<input type="text" v-model="brand.sort"><br>
    介绍:<textarea v-model="brand.description"/><br>
    状态:<input type="radio" name="status" value="0" v-model="brand.status">禁用<input type="radio" name="status" value="1" v-model="brand.status">启用<br>
    <button @click.prevent="toSubmit">提交</button>
  </form>


</template>

<script>
  import axios from "axios";

  export default {
    name:'addBrand',
    data(){
      return{
        brand:{
          brandName:'',
          companyName:'',
          sort:'',
          description:'',
          status:'',
          id:''
        }
      }
    },
    methods:{
        toSubmit(){

          let brand = this.brand
          axios({
            method:"POST",
            url:'http://localhost:8080/BrandDemo/addBrand',
            data: brand,
          })
          this.$emit('update')
          // axios.get('http://localhost:8080/BrandDemo/addBrand', {data:brand}
          // ).then(resp=>{
          //   // console.log(resp)
          // }).catch(error=>{
          //   // console.log(error)
          // })
        }
    }
  }

</script>

<style>

</style>