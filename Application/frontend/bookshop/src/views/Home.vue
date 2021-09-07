<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HomeMenu msg="Welcome to The Menu page"/>
    <h1>Hello BookStore</h1>
  </div>
</template>

<script>
// @ is an alias to /src
import HomeMenu from '@/components/HomeMenu.vue'

export default {
  name: 'Home',
  components: {
    HomeMenu
  }
}
</script>
