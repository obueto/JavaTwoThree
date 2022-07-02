package chapterSixteen;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;


public class CountingLetters {

   private static void letterCount(String sentence){
sentence = sentence.toLowerCase();
 Map<Character,Integer> characterCount = new HashMap<>();
   //for ( :) {
//            String letter = token.toLowerCase();
//            if (map.containsKey(letter)){
//                int count = map.get(letter);
//                map.put(letter,count + 1);
//            }
//            else
//                map.put(letter, 1);
//        }
//
//    }

}
public static void main(String[] args) {
    SecureRandom secureRandom = new SecureRandom();
    System.out.println(secureRandom.ints(100,1,25)
                        .sum());

}


}

