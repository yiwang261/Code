import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/Home.vue'

const routes = [
  {
    path:'/',
    redirect:'dashboard'
  },
  {
    path: '/',
    name: 'home',
    component: HomeView,
    children:[
      {
        name:'dashboard',
        path:'/dashboard',
        component:()=>import('@/views/DashBoard.vue')
      },
      {
        name:'user',
        path:'/user',
        component:()=>import('@/views/User.vue'),
        // children:[
        //   {
        //     name:'user-list',
        //     path:'/user/list',
        //     component:()=>import('@/views/UserList.vue')
        //   }
        // ]
      }
    ]
  },
  {
    name:'login',
    path:'/login',
    component:()=>import('@/views/Login.vue')
  },
  {
    name:'403',
    path:'/403',
    component:()=>import('@/views/403.vue')
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: routes
})

router.beforeEach((to, from, next) => {
  console.log(to.path)
  let token = localStorage.getItem("token");
  if(to.path=="/login"){
    next();
  }else if(token == null){
    next("/login");
  }
})

export default router;
