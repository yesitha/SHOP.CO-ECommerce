package com.shopco;
import com.shopco.util.BootMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InventoryMain {
    public static void main(String[] args) {

        BootMain.main(args);
        SpringApplication.run(InventoryMain.class);
    }
}