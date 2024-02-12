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
    },
    methods: {}
  };
</script>


<style scoped>
</style>
