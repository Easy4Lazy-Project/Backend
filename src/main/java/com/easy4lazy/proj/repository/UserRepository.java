package com.easy4lazy.proj.repository;

import com.easy4lazy.proj.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmailAndPassword(String email, String pwd);
}
