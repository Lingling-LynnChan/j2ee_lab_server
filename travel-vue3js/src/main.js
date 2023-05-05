import {createApp} from 'vue'
import ElementPlus from 'element-plus'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import {createRouter, createWebHashHistory} from 'vue-router'
import zhCn from 'element-plus/dist/locale/zh-cn.mjs'
import 'element-plus/dist/index.css'
import App from './App.vue'
import Home from "./components/Main.vue";

const app = createApp(App)
app.use(ElementPlus, {
    locale: zhCn
})
const router = createRouter({
    history: createWebHashHistory(),
    routes: [
        {
            path: '/',
            component: App,
            children: [
                {
                    path: '',
                    component: Home
                }
            ]
        },
    ]
})
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(router)
app.mount('#app')
