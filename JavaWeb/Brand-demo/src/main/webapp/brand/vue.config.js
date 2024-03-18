
const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false,
  devServer: {
    proxy:'http://localhost:8080'
  }
  // devServer: {
  //   proxy: {
  //     url:'http://lochost:8090'
  //     '/api': {
  //       target: 'http://lochost:8090',
  //       pathReWrite:{'^/api':''},
  //       ws: true,
  //       changeOrigin: true
  //     }
  //   }
  // }
})

