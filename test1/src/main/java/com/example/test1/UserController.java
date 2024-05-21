package com.example.test1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getuser(){
        return "Get User is open";
    }
    @GetMapping( "/{userID}")  //path perameter, when we path perameter write down we must using "/{any_name}"
    public String getuserPath(@PathVariable String userID){
    return "Get UserID is open : "+userID;
    }
    @GetMapping("/search") //Query perameter
    public String getuser_Query(@RequestParam(value = "page")int pageno, @RequestParam(value = "limit")int limite){
    return "Get UserID page: "+pageno+"and limit: "+limite;
    }
    @PostMapping
    public String postuser(){
    return "Post User is open";
    }
    @PutMapping
    public String putuser(){
    return "Put User is open";
    }
    @DeleteMapping
    public String deleteuser(){
    return "Delete User is open";
    }
}
