<template>
    <h1>404page</h1>
    <div>
        <button @click="indexBackHandler">戻る</button>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data() {
            return {}
        },
        created() {},
        computed: {
        },
        methods: {
            indexBackHandler() {
                // TODO 获取用户登录状态 登录 ？ / ： login
                this.$router.push("/")
            },
        }
    }
</script>
