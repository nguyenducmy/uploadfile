package com.example.demo.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class UploadFile {
    private final String path = "src/main/resources/dest/";
    public void UploadFile() throws IOException {

        ClassPathResource source = new ClassPathResource("source/LICENSE");
        File file = new File(path + "file" +  UUID.randomUUID());
        Files.copy(source.getFile().toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
