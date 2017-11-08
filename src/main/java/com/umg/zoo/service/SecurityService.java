package com.umg.zoo.service;

/**
 * Created by Cristian Ramírez on 8/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
public interface SecurityService {
    String findLoggedInUserName();

    void autoLogin(String userName, String password);
}
