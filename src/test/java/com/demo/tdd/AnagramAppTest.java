package com.demo.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramAppTest {
    
    @Test
    public void initializeDictionary() {
        Dico dico = new Dico();
        dico.insertWord("hello");
        dico.insertWord("world");
        assertEquals(2, dico.size());
        assertEquals("hello", dico.get(0));
        assertEquals("world", dico.get(1));
    }

    @Test
    public void findAnagramForWord() {
        Dico dico = new Dico();
        dico.insertWord("dirty");
        dico.insertWord("word");
        AnagramFinder.dico = dico;
        String result = AnagramFinder.findAnagramFor("dormitory");
        assertEquals("dormitory", result);
    }

    @Test
    public void accessPositionOutOfBounds() {
        Dico dico = new Dico();
        try {
            String s = dico.get(0);
        } catch (Exception e) {
            assertEquals("Index 0 out of bounds for length 0", e.getMessage());
        }
    }
}
