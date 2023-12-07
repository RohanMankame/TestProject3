package com.rohan.maintanencemanagementsystem;

import com.rohan.maintanencemanagementsystem.repository.TenentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaintanenceManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MaintanenceManagementSystemApplication.class, args);
    }

    @Autowired
    private TenentRepository tenentRepository;
    @Override
    public void run(String... args) throws Exception {
/*
        Tenent tenent1 =new Tenent("Roro", 343L,"kitchen","sink broken","December15 7pm","pending");
        tenentRepository.save(tenent1);

        Tenent tenent2 =new Tenent("Adi", 772L,"bath","flooding","December9 7pm","pending");
        tenentRepository.save(tenent2);

 */
    }
}
