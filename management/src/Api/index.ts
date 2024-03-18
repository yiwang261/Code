import axios from "axios";

export const instance = axios.create({
    baseURL:"http://localhost:8080/wang",
    timeout:1000,
})