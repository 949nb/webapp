<template>
    <h2>ログイン</h2>
    <div>
        {{ usernameAndPasswordMsg }}
        <div>
            <label for="username">名前：</label>
            <input type="text" id="username" name="username" v-model="username">
        </div>
        <div>
            <label for="password">パスワード：</label>
            <input type="password" @keydown.enter="loginHandler" id="password" name="password" v-model="password">
        </div>
        <div>
            <button @click="loginHandler">ログイン</button>
        </div>
        <div>
            <button @click="RegisterHandler">登録へ</button>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Login",
        data() {
            return {
                username: "",
                password: "",
                usernameAndPasswordMsg: ""
            }
        },
        created() {},
        computed: {
            usernameAndPasswordIsBland() {
                return this.username && this.password;
            }
        },
        methods: {
            loginHandler() {
                if (this.usernameAndPasswordIsBland) {
                    fetch('http://localhost:8080/api/login', {
                        method: 'POST',
                        body: JSON.stringify({
                            username: this.username,
                            password: this.password
                        }),
                        headers: {
                            "Content-Type": "application/json",
                            // 'Content-Type': 'application/x-www-form-urlencoded',
                        },
                    })
                    .then((response) => {
                        if (!response.ok) {
                            throw new Error("req is faild!")
                        }
                        return response.json();
                    })
                    .then((res) => {
                        window.alert(res[0])
                        if (res[1] === "0") {
                            console.log("/login to /")
                            this.$router.push({ path:'/'})
                        }
                    })
                    .catch(err => {
                        window.alert(err.message)
                    })
                } else {
                    window.alert("username or password is not bland")
                }
            },
            RegisterHandler() {
                this.$router.push("/register")
            }
        }
    }
</script>
