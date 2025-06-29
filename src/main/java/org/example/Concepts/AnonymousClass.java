package org.example.Concepts;


interface Human{
    void speak();
}


// Simplifies the interface implements way without creating a class and implementing directly implement the method and use it
public class AnonymousClass {
    public static void main(String[] args) {
        Human human = new Human() {
            @Override
            public void speak() {
                System.out.println("hello");
            }
    };

        human.speak();

}


}
