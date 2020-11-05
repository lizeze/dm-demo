package com.example.demo.api;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lzz
 * @BelongsProject: com.example.demo.api
 * @date ：Created in 2020/11/5
 * @description ：
 * @modified By：
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public ResponseEntity getAll() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.list());
    }
}
