import java.io.*;
import java.util.*;
public class q22{
   static String string_encoding(String str){
      HashMap<Character, Integer> my_map = new HashMap<>();
      String result = "";
      int i = 0;
      char ch;
      for (int j = 0; j < str.length(); j++) {
         ch = str.charAt(j);
         if (!my_map.containsKey(ch))
         my_map.put(ch, i++);
         result += my_map.get(ch);
      }
      return result;
   }
   static void match_words( String[] my_arr, String my_pattern){
      int len = my_pattern.length();
      String hash_val = string_encoding(my_pattern);
      for (String word : my_arr){
         if (word.length() == len && string_encoding(word).equals(hash_val))
         System.out.print(word + " ");
      }
   }
   public static void main(String args[]){
      String[] my_arr = { "mno", "aabb", "pqr", "xxyy", "mmnn" };
      String my_pattern = "ddcc";
      System.out.println("The patterns similar to ddcc in the array are :");
      match_words(my_arr, my_pattern);
   }
}

