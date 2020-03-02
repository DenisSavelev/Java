package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    public final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.findAll());
        return "usersList";
    }
    @PostMapping("/userW")
    public String getByName(@RequestParam("russian") String russian, Model model){
        model.addAttribute("user", userService.getByRussian(russian));
        return "showUser";
    }
    @GetMapping("/addUser")
    public String createUserPage(){
        return "createUser";
    }


    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/users";
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user)
    {
        userService.update(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/users";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getById(id));
        return "editUser";
    }
}