<template>
    <h2>Register Form</h2>
    <div>
        {{ usernameAndPasswordMsg }}
        <div>
            <label for="username">名前：</label>
            <input type="text" id="username" name="username" v-model="username">
        </div>
        <div>
            <label for="password">パスワード：</label>
            <input type="password" id="password" name="password" v-model="password">
        </div>
        <div>
            <label for="email">メール：</label>
            <input type="text" @keydown.enter="RegisterHandler" id="email" name="email" v-model="email">
        </div>
        <div>
            <button @click="RegisterHandler">登録する</button>
        </div>
        <div>
            <button @click="LoginBack">戻る</button>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data() {
            return {
                username: "",
                password: "",
                email: "",
                usernameAndPasswordMsg: ""
            }
        },
        created() {},
        computed: {
            usernameAndPasswordAndEmailIsBland() {
                return this.username && this.password && this.email;
            }
        },
        methods: {
            LoginBack() {
                this.$router.push("/login")
            },
            RegisterHandler() {
                console.log(123)
                if (this.usernameAndPasswordAndEmailIsBland) {
                    fetch('http://localhost:8080/register', {
                        method: 'POST',
                        body: JSON.stringify({
                            username: this.username,
                            password: this.password,
                            email: this.email
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
                            console.log("/register to /")
                            this.$router.push({ path:'/'})
                        }
                    })
                    .catch(err => {
                        window.alert(err.message)
                    })
                } else {
                    window.alert("username or password or email is not bland")
                }
            }
        }
    }
</script>
