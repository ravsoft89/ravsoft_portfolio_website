package com.example.filedemo;

import com.example.filedemo.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
FileStorageProperties.class
})
public class FiledemoApplication {

public static void main(String[] args) {
SpringApplication.run(FiledemoApplication.class, args);
}
}