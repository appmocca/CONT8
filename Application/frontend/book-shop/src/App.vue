<template>
<div id="app">
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="UserbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            User
          </a>
          <ul class="dropdown-menu" aria-labelledby="UserbarDropdown">
            <li><a class="dropdown-item" href="#">Create Users</a></li>
            <li><a class="dropdown-item" href="#">Update Users</a></li>
            <li><a class="dropdown-item" href="#">Delete Users</a></li>
          </ul>
        </li>

        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="BookbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Book
          </a>
          <ul class="dropdown-menu" aria-labelledby="BookbarDropdown">
            <li><a class="dropdown-item" href="#">Create Books</a></li>
            <li><a class="dropdown-item" href="#">Update Books</a></li>
            <li><a class="dropdown-item" href="#">Delete Books</a></li>
          </ul>
        </li>
      </ul>


      <div class="navbar-nav d-inline-flex p-1">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Shopping Cart</a>
          </li>
        
          <li class="nav-item">
            <button class="btn btn-primary" type="submit">Login</button>
          </li>
      </div>
    </div>
  </div>
</nav>
<router-view></router-view>
</div>



</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  font-size: 17px;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
