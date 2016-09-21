package com.mfrondon.filemanager.services.security;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/15.
 */
@Service("userDetailsService")
public class SpringSecUserDetailsServiceImpl implements UserDetailsService {
    
     private EncryptionService encryptionService;

    @Autowired
    public void setEncryptionService(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username: "+username);
        UserDetailsImpl userDetailsImpl = new UserDetailsImpl();
        userDetailsImpl.setUsername(username);
        userDetailsImpl.setPassword(encryptionService.encryptString("mfrondon"));
        
        System.out.println("FIN");
        return userDetailsImpl;
    }
}
