package com.winchampion.foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by super on 2016/6/3.
 */
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker(),"yangyiwei");
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor tx = context.getBean(TextEditor.class);
        tx.spellCheck();
    }
}
