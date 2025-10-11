package org.example.ProblemSolving;

public class ProblemSolving {

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
            default -> null;
        };
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hellofadsfsadfas sdfasdfasdf",3));
    }
}
