package io.github.antuniooh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//importar outros pacotes que estão fora do escopo local
/*@ComponentScan(
        basePackages = {
                "io.github.antuniooh.repository",
                "io.github.antuniooh.service"}
        )*/
@RestController
public class VendasApplication {

    /*@Autowired
    @Qualifier("applicationName")*/
    //get value from configuration
    @Value("${application.name}")
    private String applicationName;

    @Dog
    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
            this.animal.sound();
        };
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
