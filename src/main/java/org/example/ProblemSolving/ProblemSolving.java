package org.example.ProblemSolving;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemSolving {

    static boolean checkPallindrome(String input){
        String reverseString = reverseString(input,1);
        return input.toLowerCase().equalsIgnoreCase(reverseString);
    }

    static Map<Character,Long> frequencyCount(String input){
        return input.toLowerCase().chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(cha->cha,Collectors.counting()));
    }

    static Map<String, Integer> countConsonantsVowels(String input, int method) {
        return switch (method) {
            case 1 -> {
                input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                int consonantsCount = input.replaceAll("[aeiou]", "").length();
                int vowelsCount = input.length() - consonantsCount;
                yield Map.of("ConsonantsCount", consonantsCount, "VowelsCount", vowelsCount);
            }
            case 2 -> {
                int consonants = 0;
                int vowels = 0;
                List<Character> vowelsList = List.of('a', 'e', 'i', 'o', 'u');
                input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
                for (int i = 0; i < input.length(); i++) {
                    if (vowelsList.contains(input.charAt(i))) vowels++;
                    else consonants++;
                }
                yield Map.of("ConsonantsCount", consonants, "VowelsCount", vowels);
            }
            default -> Map.of(); // return empty map instead of null
        };
    }


    static String reverseString(String input, int method) {
        return switch (method) {
            case 1 -> {
                System.out.println("Interation Way");
                StringBuilder res = new StringBuilder();
                for (int i = input.length() - 1; i >= 0; i--) {
                    res.append(input.charAt(i));
                }
                yield res.toString();
            }
            case 2->{
                System.out.println("Easy StringBuilder way");
                yield new StringBuilder(input).reverse().toString();
            }
            case 3->{
                System.out.println("Two pointer way");
                char[] charArray = new char[input.length()];
                for(int i =0;i<input.length();i++){
                    charArray[i] = input.charAt(i);
                }
                int left = 0;
                int right = input.length()-1;
                char temp;
                while(left<right){
                    temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;right--;
                }
                yield new String(charArray);
            }
            default -> "";
        };
    }

    public static void main(String[] args) {
        System.out.println(frequencyCount("Malayalam"));

    }
}
