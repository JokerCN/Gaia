package com.winchampion.foo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by super on 2016/6/3.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired(required = true)
    public TextEditor(SpellChecker s,String name) {
        this.name = name;
        this.spellChecker = s;
        System.err.println("Inside TextEditor Constructor");
    }

    public TextEditor() {
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        System.out.println("name:"+this.getName());
        spellChecker.checkSpelling();
    }
}
