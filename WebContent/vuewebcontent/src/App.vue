<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div class="wrapper">
    <nav>
      <!-- <RouterLink to="/">Home</RouterLink> -->
    </nav>
  </div>

  <RouterView />
</template>

<script>
  // 在Vue组件的methods中使用fetch
  export default { 
    name: 'App',
    mounted() {
      // this.fetchData(); // 组件挂载时获取数据
      // this.fetchData("some-endpoint")
      // this.fetchData("hello")
    },
    methods: {
      fetchData: async (url) => {
        fetch(`http://localhost:8080/api${url ? `/${url}` : ""}`)
          .then(response => {
            if (!response.ok) {
              throw new Error('Network response was not ok');
            }
            return response.json();
          })
          .then(data => {
            console.log(data);
            // 在这里处理你的数据
          })
          .catch(error => {
            console.error('There has been a problem with your fetch operation:', error);
          });
      }
    }
  };
</script>


<style scoped>
</style>
