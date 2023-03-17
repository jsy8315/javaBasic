package com.javaApplication14homework;
// i번째 글자가 모음인지 알려주는 isVowel() 메서드를 완성하시오
import java.util.*;
import java.util.Arrays;

public class Word {
    private String letters;
    
    public Word(String letters) {
        this.letters = letters;
    }
    // 모음 a,e,i,o,u, A, E, I, O, U
    public boolean isVowel(int i) {
        HashSet<String> gather = new HashSet<String>(Arrays.asList("a", "e", "i", "o", "u"));
        gather.add(letters.substring(i, i + 1));
            return gather.size() == 10;          
    }
}
