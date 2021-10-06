//package com.cont.controller;
//
//import com.cont.pojo.User;
//import com.cont.service.UserService;
//import com.cont.vo.ErrorResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//
//    @RequestMapping("/list")
//    public ErrorResult getUserList(@RequestBody Map<String,String> param){
//        //selet *
//        //list (book)
//        String username = param.get("loginName");
//        List<User> userList = this.userService.getUserList(username);
//        if (userList.isEmpty()){
//            ErrorResult errorResult = ErrorResult.builder().code("401").msg("No User information").build();
//            return errorResult;
//        }
//            return   ErrorResult.builder().data(userList).code("200").msg("success").build();
//
//    }
//    @RequestMapping("/list")
//    public ErrorResult userAdd(@RequestBody Map<String,String> param){
//        String username = param.get("loginName");
//        String password = param.get("password");
//
//
//    }
//}
