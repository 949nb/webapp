<template>
    <h2>Login Form</h2>
    <div>
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
        </div>
        <div>
            <button @click="loginHandler">Login</button>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Login",
        data() {
            return {
                username: "",
                password: ""
            }
        },
        methods: {
            loginHandler() {
                console.log("/login to /")
                this.$router.push({ path:'/'})
            }
        }
    }
</script>
