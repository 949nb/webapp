<script setup>
</script>

<template>
  <div>
    <span> TheWelcome </span>
    <button @click="logoutHandler">登出</button>
  </div>
</template>

<script>
    export default {
        name: "TheWelcome",
        data() {
           return {}
        },
        methods: {
            logoutHandler() {
                console.log("/ to /login")
                this.$router.push({ path:'/login'})
            }
        }
    }
</script>
