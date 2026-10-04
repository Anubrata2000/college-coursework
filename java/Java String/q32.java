import java.util.*;

public class q32 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        int k = 2; // Specify the Kth character (index starts from 0)

        sortListByKthCharacterFrequency(stringList, k);

        System.out.println("Sorted list by Kth character frequency:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static void sortListByKthCharacterFrequency(List<String> list, int k) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int freq1 = getCharacterFrequency(str1, k);
                int freq2 = getCharacterFrequency(str2, k);

                return Integer.compare(freq1, freq2);
            }
        });
    }

    public static int getCharacterFrequency(String str, int k) {
        if (k >= str.length()) {
            return 0;
        }

        char targetChar = str.charAt(k);
        int frequency = 0;

        for (char c : str.toCharArray()) {
            if (c == targetChar) {
                frequency++;
            }
        }

        return frequency;
    }
}
