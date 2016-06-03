package com.winchampion.foo.congifuration;

import com.winchampion.foo.TextEditor;
import com.winchampion.foo.annotation.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by super on 2016/6/3.
 */
@Configuration
@Import(ConfigB.class)
public class ConfigA {
    @Bean
    public Student abcd(){
        return new Student();
    }
}
