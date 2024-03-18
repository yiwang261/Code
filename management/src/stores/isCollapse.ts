import {computed, ref} from "vue";
import {defineStore} from "pinia";

export const useIsCollapse = defineStore("isCollapse",()=>{
    const isCollapse = ref(false);

    const Collapse = computed(()=>{
        return !isCollapse.value
    })

    const changeCollapse = ()=>{
        isCollapse.value = !isCollapse.value
    }

    return{isCollapse,changeCollapse}
})