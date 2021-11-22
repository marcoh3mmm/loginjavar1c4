/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclocuatro.proyectociclo4.repository;

import java.util.List;
import java.util.Optional;

import com.ciclocuatro.proyectociclo4.model.User;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marco Moreno
 */
public interface UserCrudRepository extends CrudRepository<User,Long>{
    
    public Optional<User> findByEmail(String email);

    public List<User> findByEmailAndPassword(String email,String password);
    
}
