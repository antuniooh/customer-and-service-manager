package io.github.antuniooh;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // pode ser field caso seja um campo
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("development")
public @interface Development{

}