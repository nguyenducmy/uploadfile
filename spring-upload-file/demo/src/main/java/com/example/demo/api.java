package com.example.demo;

import com.example.demo.service.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class api {
    @Autowired
    UploadFile uploadFile;
    @GetMapping("/")
    public void upload() throws IOException {
        uploadFile.UploadFile();
    }
}
