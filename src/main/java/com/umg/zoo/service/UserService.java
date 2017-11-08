package com.umg.zoo.service;

import com.umg.zoo.model.User;

/**
 * Created by Cristian Ramírez on 8/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
public interface UserService {

    void save(User user);

    User findByUserName(String userName);

}
