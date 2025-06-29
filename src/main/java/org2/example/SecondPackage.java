package org2.example;


import org.example.Concepts.AccessModifiers;

public class SecondPackage extends AccessModifiers{
    public static void main(String[] args) {

        // protectedShow() method can be accessed since
        SecondPackage secondPackage = new SecondPackage();
        secondPackage.protectedShow();




        // name can't be accessed since it's default and can be accessed only in the respective package
        //        secondPackage.name = "hello";


    }
}
