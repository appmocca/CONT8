<template>
  <div class="login">
    <img alt="Vue logo" src="../assets/User_Login_Icon.png" width="300px" height="300px">
    <LoginComponent msg="Welcome to Book Store App"/>
  </div>

</template>

<script>
import LoginComponent from '@/components/LoginComponent.vue'


  export default {
    name: 'Login',
    data () {
      return {
        loginForm: {
          loginName: '',
          password: ''
        },
        responseResult: []
      }
    },
    methods: {
      login () {
        this.$axios
          .post('/login', {
            loginName: this.loginForm.loginName,
            password: this.loginForm.password
          })
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              this.$router.replace({path: '/'})
            }
          })
          .catch(failResponse => {
          })
      }
    },
    
    components: {
    LoginComponent
  }
  }
</script>