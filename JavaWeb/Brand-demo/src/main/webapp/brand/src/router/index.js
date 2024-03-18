import {createRouter,createWebHistory} from 'vue-router'
import Brand from "../components/Brand.vue";
import addBrand from "../components/addBrand.vue";
import app from "@/App.vue";

const routes = [
    // {
    //     path: '/',
    //     // component: app
    //     // redirect:'/',
    // },
    // {
    //     name:'Home',
    //     path: '/Home',
    //     component: Brand,
    //     children:[
    //         {
    //             name:'addBrand',
    //             path:'/Home/addBrand',
    //             component:addBrand
    //         }
    //     ]
    // },
    {
        name:'addBrand',
        path:'/addBrand',
        component:addBrand
    }

]

const router = createRouter({
    history: createWebHistory(),
    routes,
})
// router.beforeEach((to,from,next)=>{
//     console.log('from:'+from.path)
//     console.log('to:'+to.path)
//     next()
// })



export default router