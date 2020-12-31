package io.github.antuniooh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    /*@Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de vendas";
    }*/

    /*@Autowired
    @Qualifier()
    */  //instancia e define qual bean será herados


    //execute when it started
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("AAAAa");
        };
    }
}
