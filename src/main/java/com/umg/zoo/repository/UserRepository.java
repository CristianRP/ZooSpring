package com.umg.zoo.repository;

import com.umg.zoo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristian Ramírez on 8/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
