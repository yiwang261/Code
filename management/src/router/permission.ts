import router from "@/router/index";

router.beforeEach((to, from, next) => {
    // console.log(1111111)
    console.log(to.path)
    // if(to.path!="/login"){
    //     console.log(222)
    //     if(localStorage.getItem("token")!==null){
    //         next();
    //     }else {
    //         next("/login");
    //     }
    // }
})