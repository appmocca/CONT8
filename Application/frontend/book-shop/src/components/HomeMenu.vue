<!--
 * @Author: your name
 * @Date: 2021-08-25 22:30:39
 * @LastEditTime: 2021-08-25 23:13:46
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \bookshop\HomeMenu.vue
-->
<template>
  <div class="home_menu">
    <h1>{{ msg }}</h1>
    
  </div>
</template>

<script>
export default {
  name: 'HomeMenu',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>