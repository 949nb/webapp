import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginVue from '@/views/Login.vue'
import RegisterVue from '@/views/Register.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/login',
      name: 'Login',
      component: LoginVue
    },
    {
      path: '/register',
      name: 'Register',
      component: RegisterVue
    }
  ]
})

export default router
