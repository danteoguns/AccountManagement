package com.qa.accountmanagement;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "../")
public class App 
{
	public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
       
    }
}
