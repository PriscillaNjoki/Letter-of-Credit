//package com.emt.TradeFinance.auth;
//
//import com.encode.fresh.utils.Response.ApiResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("api/v1/users")
//public class UsersController {
//
////    @Autowired
////    UsersService usersService;
//
//    @Autowired
//    com.emt.TradeFinance.auth.UserRepository usersRepository;
//
//    public UsersController(){
//
//    }
//
//    @PostMapping("add")
//    public ResponseEntity<Object> saveUser(@RequestBody Users users){
//        ApiResponse response = new ApiResponse();
//        try {
//            Users savedUser = usersRepository.save(users);
//
//
//            response.setMessage("Created");
//            response.setStatusCode(HttpStatus.CREATED.value());
//            response.setEntity(savedUser);
//
//            return new  ResponseEntity<>(response, HttpStatus.OK);
//        }catch (Exception e){
//            System.out.println("Error occurred "+ e);
//            return  null;
//        }
//
//    }
//
//    @GetMapping("/fetch")
//    public ResponseEntity<Object> fetchUsers(){
//        ApiResponse response = new ApiResponse();
//        try {
//            List<com.emt.TradeFinance.auth.Users> users = usersRepository.findAll();
//
//
//            response.setMessage("Found");
//            response.setStatusCode(HttpStatus.FOUND.value());
//            response.setEntity(users);
//
//            return new  ResponseEntity<>(response, HttpStatus.OK);
//        }catch (Exception e){
//            System.out.println("Error occurred "+ e);
//            return  null;
//        }
//
//    }
////    @PutMapping("/{id}")
////    public ResponseEntity<Object> updateUser(@PathVariable Long id, @RequestBody Users user) {
////        try {
////            Users updatedUser = usersRepository.updateUser(id, user);
////            return ResponseEntity.ok(updatedUser);
////        } catch (ResourceNotFoundException ex) {
////            return ResponseEntity.notFound().build();
////        } catch (Exception ex) {
////            // Log exception details excluding sensitive information
////            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
////        }
////    }
////    @DeleteMapping("/{id}")
////    public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
////        try {
////            usersRepository.deleteUser(id);
////            return ResponseEntity.noContent().build(); // No content to return
////        } catch (ResourceNotFoundException ex) {
////            return ResponseEntity.notFound().build();
////        } catch (Exception ex) {
////            // Log exception details excluding sensitive information
////            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
////        }
////    }
//
//
//
//
//}
