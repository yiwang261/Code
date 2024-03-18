<template>
  <table class="tt">
    <thead>
      <tr>
        <td>序号</td>
        <td>品牌名称</td>
        <td>企业名称</td>
        <td>品牌介绍</td>
        <td>排序</td>
        <td>状态</td>
        <td>操作</td>
      </tr>
    </thead>
    <tbody>
      <tr v-for="brand in brands" :key="brand.id" >
        <td>{{brand.id}}</td>
        <td>{{brand.brandName}}</td>
        <td>{{brand.companyName}}</td>
        <td>{{brand.description}}</td>
        <td>{{brand.ordered}}</td>
        <td>{{brand.status}}</td>
        <td><button @click="deleteBrand(brand.id)">删除</button></td>
      </tr>
    </tbody>
  </table>

<!--    <router-link :to="{-->
<!--      name:'addBrand',-->
<!--      path:'/Home/addBrand'-->
<!--    }">addBrand</router-link>-->

  <router-link :to="{
    name:'addBrand',
    // path:'/addBrand'
  }">addBrand</router-link>
  <router-view @update="getBrand"></router-view>

</template>

<script>
  import axios from 'axios'
  export default {
    name:'Brand',
    data(){
      return{
        brands:[
          {
            'id':'',
            'brandName':'',
            'companyName':'',
            'ordered':'',
            'description':'',
            'status':''
          }
        ],
        deleteId:''
      }
    },
    methods:{
      deleteBrand(id){
       this.brands= this.brands.filter((brand)=>{
          return brand.id!==id
        })
      },
      getBrand(){
        axios.get('http://localhost:8080/BrandDemo/SelectAll').then(
            response=>{
              this.brands=response.data
            },
            error=>{
              console.log(error,error.m)
            }
        )
      }
    },
   beforeMount() {
      this.getBrand()
     // setInterval(()=>{
     //   this.getBrand(),30000
     // })
      // axios.post('http://localhost:8080/BrandDemo/SelectAll').then(resp=>{
      //   this.brands=resp
      // }).catch(error=>{
      //   console.log(error)
      // })
      // axios({
      //   method:"POST",
      //   url:"http://localhost:8090/BrandDemo/SelectAll"
      // }).then(resp=>{
      //   this.brands = resp.date;
      // })
    },
    watch:{
      brands(){
        this.getBrand()
      }
    }


  }
</script>

<style>
.tt{
  text-align: center;
  border: 1px solid #000;
  border-collapse: collapse;
}
thead td{
  text-align: center;
  border: 1px solid #000;
  border-collapse: collapse;
}
tbody td{
  text-align: center;
  border: 1px solid #000;
  border-collapse: collapse;
}
</style>