package org.example.Concepts;


class SuperKeyWords{

    String name = "Super Class";

    SuperKeyWords() {
    }

    SuperKeyWords(String text) {
        System.out.println("In SuperKey Words" + text);
    }
}


public class KeyWords extends SuperKeyWords{

    String name = "Keyword class";

    static{
        System.out.println("in static block");
    }

    // this() -> calls the current class constructor , must be the first line in the constructor
    // super() -> calls the immediate super class constructor

    // this -> can be used anywhere which refers to current class members
    // super -> can be used anywhere which refers to immediate super class members

    KeyWords(){
       super("text");
    }

    KeyWords(String text){
        System.out.println("Text "+ text);
    }

    void show(){
        System.out.println(super.name);
        System.out.println(this.name);

    }

    public static void main(String[] args) throws ClassNotFoundException {

        KeyWords keyWords = new KeyWords();
        keyWords.show();


    }
}
