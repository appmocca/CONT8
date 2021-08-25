<template>
  <div class="login">
    <img alt="Vue logo" src="../assets/User_Login_Icon.png">
    <LoginComponent msg="Welcome to Book Store App"/>
  </div>
</template>

<script>
import LoginComponent from '@/components/LoginComponent.vue'

export default {
  name: 'Login',
  components: {
    LoginComponent
  }
}
</script>
