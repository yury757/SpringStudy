package org.yuyr757.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.yuyr757.pojo.Address;
import org.yuyr757.pojo.User;

@Configuration
@Import(MyConfig2.class)
public class MyConfig {
    @Bean
    public Address address(){
        return new Address("1");
    }

    @Bean
    public Address address2(){
        return new Address("2");
    }

    @Bean
    public User getUser(){
        return new User();
    }
}
