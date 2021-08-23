package AbstractMethod;


/* if a class has at least one pure virtual function, '
   then the class becomes abstract. */

/*in Java, an instance of an abstract class cannot be created,
 * we can have references to abstract class type though.
 * this means we have to use the class which extends the abstract class to
 * create an instance of the abstract class
 * that is !
 */

/*
 * In Java, we can have an abstract class without any abstract method.
 * This allows us to create classes that cannot be instantiated but can only be inherited.
 */

/* * Similar to the interface we can define static methods in an abstract class that can be called independently without an object. */
abstract class Base {
    int color;

    /*an abstract class can contain constructors in Java.
    And a constructor of abstract class is called when an instance of an inherited class is created.*/
    Base() {
        System.out.println("Base Constructor Called");
    }

    void hero() {
        System.out.println("hero");
    }

    final void testFinal(){
        System.out.println(" test final !");
    }

    /* so an abstract class have so much freedom oh ha?
    *  1 the abstract class can have or no abstract method
    *  2 the abstract class can have the normal method which can be used by extends --- instance and use the method
    *    no override !.
    *  3 the abstract class can have the final method which can't be overwritten  */

    abstract void fun();
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived fun() called");
    }

}


class Main {
    public static void main(String[] args) {

        Base b = new Derived();
        b.fun();
        b.hero();
        b.testFinal();

        /*an abstract class can contain constructors in Java.
        And a constructor of abstract class is called when an instance of an inherited class is created.*/
        Derived d = new Derived();
        Party.doParty();
    }
}

abstract class Party {
    static void doParty()
    {
        System.out.println("Lets have some fun!!");
    }
}

