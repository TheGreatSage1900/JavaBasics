package org.example.Concepts;



// outer Class can have only public and default access modifiers


// inner class can have all the access modifiers



//| Modifier    | Same Class | Same Package | Subclass (anywhere) | Other Classes |
//        | ----------- | ---------- | ------------ | ------------------- | ------------- |
//        | `private`   | ✅ Yes      | ❌ No         | ❌ No                | ❌ No          |
//        | *(default)* | ✅ Yes      | ✅ Yes        | ❌ No                | ❌ No          |
//        | `protected` | ✅ Yes      | ✅ Yes        | ✅ Yes               | ❌ No          |
//        | `public`    | ✅ Yes      | ✅ Yes        | ✅ Yes               | ✅ Yes         |



class TopAccessModifier{
    // Can be accessed only in this class
    private String name;

    // this method can't be accessed from any other class
    void show(){
        System.out.println(name);



        InnerAccessModifier innerAccessModifier = new InnerAccessModifier();
        innerAccessModifier.age = 5;
    }

    // This class can be accessed only from the outer class
    private class InnerAccessModifier{
        private int age;
    }

    // this class can be accessed withing the package
    class InnerDefaultClass{}

    // this class can be accessed additionally by the subclass of any package
    class InnerProtectedClass{}


}



 public class AccessModifiers extends TopAccessModifier{

     // protected can be accessed from subclass irrespective of the package
     protected void protectedShow(){
         System.out.println("In Protected show method");
     }
    // default access modifier can be accessed only with this package org.example. ( example in 2nd package org2.example)
     String name;

     public static void main(String[] args) {

         TopAccessModifier topAccessModifier = new TopAccessModifier();
         topAccessModifier.show();


     }

     // this class can be accessed additionally by the subclass of any package
      class InnerProtectedClass{}

}
