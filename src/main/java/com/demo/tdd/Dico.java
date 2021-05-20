package com.demo.tdd;

import java.util.ArrayList;
import java.util.List;

public class Dico {
    
    List<String> dicoList;
    
    public Dico() {
        this.dicoList = new ArrayList<>();
    }

    public int size() {
        return dicoList.size();
    }

    public void insertWord(String word) {
        dicoList.add(word);
    }

    public String get(int i) {
        return dicoList.get(i);
    }
}
