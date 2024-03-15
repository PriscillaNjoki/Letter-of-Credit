package com.emt.TradeFinance.User8;

import com.emt.TradeFinance.utils.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class User8Service {


        @Autowired
        private User8Repository user8Repository;


//CREATING USERS

        public ResponseEntity<Object> saveUser8(User8 user8) {
            ApiResponse response = new ApiResponse();
            try {
                User8 savedUser = user8Repository.save(user8);

                response.setMessage("Created");
                response.setStatusCode(HttpStatus.CREATED.value());
                response.setEntity(savedUser);

                return new ResponseEntity<>(response, HttpStatus.OK);
            } catch (Exception e) {
                response.setMessage("Error occurred: " + e.getMessage());
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        //FIND USER BY FULL NAME
        public ResponseEntity<Object> fetchUserByFullName(String fullName) {
            ApiResponse response = new ApiResponse();

            try {
                Optional<User8> user8Optional = user8Repository.findByFullName(fullName);

                if (user8Optional.isPresent()) {
                    User8 user3 = user8Optional.get();
                    response.setMessage("User3 retrieved successfully");
                    response.setStatusCode(HttpStatus.OK.value());
                    response.setEntity(user3);
                    return new ResponseEntity<>(response, HttpStatus.OK);
                } else {
                    response.setMessage("User3 not found for full name: " + fullName);
                    response.setStatusCode(HttpStatus.NOT_FOUND.value());
                    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
                }
            } catch (Exception e) {
                response.setMessage("Error occurred while processing request");
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        //DELETING USER BY ID
        public ResponseEntity<Object> deleteUser(Long id) {
            ApiResponse response = new ApiResponse();
            try {
                Optional<User8> optionalUser8 = user8Repository.findById(id);

                if (optionalUser8.isPresent()) {
                    User8 user8 = optionalUser8.get();

                    user8Repository.delete(user8);

                    response.setMessage("User deleted successfully");
                    response.setStatusCode(HttpStatus.OK.value());

                    return new ResponseEntity<>(response, HttpStatus.OK);
                } else {
                    response.setMessage("User not found for id: " + id);
                    response.setStatusCode(HttpStatus.NOT_FOUND.value());
                    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
                }
            } catch (Exception e) {
                response.setMessage("Error occurred: " + e.getMessage());
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        //GETTING USER BY ID
        public ResponseEntity<Object> getUsersById(Long id) {
            ApiResponse response = new ApiResponse();
            try {
                Optional<User8> optionalUser8 = user8Repository.findById(id);

                if (optionalUser8.isPresent()) {
                    User8 user8 = optionalUser8.get();
                    response.setMessage("User retrieved successfully");
                    response.setStatusCode(HttpStatus.OK.value());
                    response.setEntity(user8);
                    return new ResponseEntity<>(response, HttpStatus.OK);
                } else {
                    response.setMessage("User not found for id: " + id);
                    response.setStatusCode(HttpStatus.NOT_FOUND.value());
                    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
                }
            } catch (Exception e) {
                response.setMessage("Error occurred: " + e.getMessage());
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        //UPDATING USER
        public ResponseEntity<Object> updateUser(Long id, User8 userDetails) {
            ApiResponse response = new ApiResponse();
            try {
                Optional<User8> optionalUser8 = user8Repository.findById(id);

                if (optionalUser8.isPresent()) {
                    User8 user = optionalUser8.get();

                    // Update user details based on userDetails
                    if (userDetails.getFullName() != null) {
                        user.setFullName(userDetails.getFullName());
                    }
                    if (userDetails.getEmailAddress() != null) {
                        user.setEmailAddress(userDetails.getEmailAddress());
                    }
                    if (userDetails.getGender() != null) {
                        user.setGender(userDetails.getGender());
                    }


                    User8 updatedUser8 = user8Repository.save(user);

                    response.setMessage("User updated successfully");
                    response.setStatusCode(HttpStatus.OK.value());
                    response.setEntity(updatedUser8);

                    return new ResponseEntity<>(response, HttpStatus.OK);
                } else {
                    response.setMessage("User not found for id: " + id);
                    response.setStatusCode(HttpStatus.NOT_FOUND.value());
                    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
                }
            } catch (Exception e) {
                response.setMessage("Error occurred: " + e.getMessage());
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
//FETCHING ALL USERS

        public ResponseEntity<Object> fetchUsers() {
            ApiResponse response = new ApiResponse();
            try {
                List<User8> user8 = user8Repository.findAll();

                response.setMessage("Found");
                response.setStatusCode(HttpStatus.FOUND.value());
                response.setEntity(user8);

                return new ResponseEntity<>(response, HttpStatus.OK);
            } catch (Exception e) {
                response.setMessage("Error occurred: " + e.getMessage());
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }

