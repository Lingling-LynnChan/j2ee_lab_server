import {createApp} from 'vue'
import ElementPlus from 'element-plus'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import {createRouter, createWebHistory} from 'vue-router'
import zhCn from 'element-plus/dist/locale/zh-cn.mjs'
import 'element-plus/dist/index.css'
import App from './App.vue'
import Home from "./components/Home.vue";
import Business from "./components/Business.vue";

const app = createApp(App)
app.use(ElementPlus, {
    locale: zhCn
})
const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: Home,
        },
        {
            path: '/business',
            component: Business
        }
    ]
})
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(router)
app.mount('#app')
