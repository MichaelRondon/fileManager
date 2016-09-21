/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfrondon.filemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Felipe
 */
@SpringBootApplication
public class FileManagerApplication {
     public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FileManagerApplication.class, args);
    }
}
