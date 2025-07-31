package org.example.Concepts;

// Superclass
class SuperKeyWords {
    String name = "Super Class";

    SuperKeyWords() {
        // Default constructor
    }

    SuperKeyWords(String text) {
        System.out.println("In SuperKeyWords: " + text);
    }
}

// Subclass
public class KeyWords extends SuperKeyWords {

    String name = "Keyword class";

    final int a =5 ;

    final String finalName = "Final String";


    // Static block executes when the class is loaded
    static {
        System.out.println("In static block");
    }

    // Default constructor - calls super class constructor explicitly
    KeyWords() {

        super("text");
        
    }

    // Overloaded constructor
    KeyWords(String text) {
        System.out.println("Text: " + text);
    }

    // Display method
    void show() {
        System.out.println(super.name);  // Access superclass variable
        System.out.println(this.name);   // Access current class variable
    }

    public static void main(String[] args) {
        KeyWords keyWords = new KeyWords();
        keyWords.show();
    }
}