/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclocuatro.proyectociclo4.repository;

import java.util.List;
import java.util.Optional;

import com.ciclocuatro.proyectociclo4.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marco Moreno
 */
@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository userRepo;

    public List<User> getAllUsers(){
        return (List<User>) userRepo.findAll();
    }

    public User saveUser(User userEntity){
        return userRepo.save(userEntity);
    }

    public Optional<User> findEmail(String email){
        return userRepo.findByEmail(email);
    }
    public List<User> findEmailAndPass(String email, String password){
        return userRepo.findByEmailAndPassword(email,password);
    }
    
}
