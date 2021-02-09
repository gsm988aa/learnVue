// import Vue from 'vue'
// import './plugins/axios.js'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

// Vue.prototype.axios = axios

// new Vue({
//     router,
//     store,
//     render: h => h(App)
// }).$mount('#app')
// //
createApp(App).use(store).use(router).mount('#app')
