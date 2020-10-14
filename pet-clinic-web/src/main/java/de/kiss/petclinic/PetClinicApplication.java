package de.kiss.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) throws MalformedURLException {
        URL test = new URL("https://test.de");
        System.out.println(test.getProtocol());


    }

}
