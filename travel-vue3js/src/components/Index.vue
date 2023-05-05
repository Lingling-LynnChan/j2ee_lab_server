<template>
    <el-container>
        <el-header>
            <el-container>
                <el-aside style="width: 80%">
                    <el-menu
                            router
                            :default-active="$router.path"
                            mode="horizontal"
                            @select="titleSelect">
                        <el-menu-item index="/">主页</el-menu-item>
                        <el-sub-menu index="/traffic">
                            <template #title>交通</template>
                            <el-menu-item index="/traffic/map">导航</el-menu-item>
                            <el-menu-item index="/traffic/car">打车</el-menu-item>
                            <el-sub-menu index="/traffic/ticket">
                                <template #title>订票</template>
                                <el-menu-item index="/traffic/ticket/train">火车票</el-menu-item>
                                <el-menu-item index="/traffic/ticket/plane">飞机票</el-menu-item>
                            </el-sub-menu>
                        </el-sub-menu>
                        <el-menu-item index="/delicacy">美食</el-menu-item>
                        <el-menu-item index="/business">购物</el-menu-item>
                        <el-menu-item index="/attraction">景点</el-menu-item>
                        <el-menu-item index="/lodging">住宿</el-menu-item>
                        <el-menu-item index="/chat">AI问答</el-menu-item>
                    </el-menu>
                </el-aside>
                <el-main class="flex" style="width: 20%;right: auto;text-align: right">
                    <el-button class="ml-2">我的</el-button>
                    <el-button type="primary">
                        设置&nbsp;
                        <el-icon>
                            <Setting/>
                        </el-icon>
                    </el-button>
                </el-main>
            </el-container>
        </el-header>
        <el-main>
            <router-view>
            </router-view>
        </el-main>
    </el-container>

</template>

<script setup>
import {Setting} from "@element-plus/icons-vue";

const titleSelect = (key) => {
    console.log('key: ' + key)
}
</script>

<style scoped>

</style>