package com.emt.TradeFinance.User8;

import com.emt.TradeFinance.utils.Response.ApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user8")
public class User8Controller {

        @Autowired
        private User8Service user8Service;

        public User8Controller() {

        }

        //CREATING USERS
        @PostMapping("/NewUser")
        public ResponseEntity<Object> saveUser(@RequestBody User8 user) {
            return user8Service.saveUser8(user);
        }

        //FETCHING USERS
        @GetMapping("/FindAllUsers")
        public ResponseEntity<Object> fetchUsers() {
            return user8Service.fetchUsers();
        }

        //GETTING USER BY ID
        @GetMapping("/FindUser/{id}")
        public ResponseEntity<Object> getUsersById(@PathVariable Long id) {

            return user8Service.getUsersById(id);
        }

        //UPDATING USER BY ID
        @PutMapping("/UpdateUser/{id}")
        public ResponseEntity<Object> updateUser(
                @PathVariable Long id, @RequestBody User8 userDetails) {
            return user8Service.updateUser(id, userDetails);
        }

        //DELETE USER BY ID
        @DeleteMapping("/DeleteUser/{id}")
        public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
            return user8Service.deleteUser(id);
        }

        //FIND BY NAME
        @GetMapping("/byFullName/{fullName}")
        public ResponseEntity<Object> fetchUserByFullName(@PathVariable String fullName) {
            return user8Service.fetchUserByFullName(fullName);
        }
    }
