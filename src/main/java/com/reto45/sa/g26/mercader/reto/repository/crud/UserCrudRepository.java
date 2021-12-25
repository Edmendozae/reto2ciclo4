package com.reto45.sa.g26.mercader.reto.repository.crud;


import com.reto45.sa.g26.mercader.reto.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ed Mendoza
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional <User> findByEmailAndPassword(String email,String password);
    
    
}
