package com.kaka.blog;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class BlogApplicationTests {


    public static void main(String[] args) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encode = passwordEncoder.encode("aa");
        System.out.println(encode);
    }
    }



