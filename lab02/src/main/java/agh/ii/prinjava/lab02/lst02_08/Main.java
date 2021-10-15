package agh.ii.prinjava.lab02.lst02_08;



/**
 * An example of a tight coupling. In most cases a VERY bad design decision <br>
 * (interfaces, as contracts, should be used instead -> loose coupling)
 */


/**
 * Refactoring of the above (<a href="https://www.baeldung.com/solid-principles">see SOLID principles</a>)
 */









public class Main {

    private static void demo1() {
        System.out.println("demo1...");
        C7 c7 = new C7();
        c7.doC7Stuff();
    }

    private static void demo2() {
        System.out.println("demo2...");

        //After refactoring
        C9[] c9s = {
                new C9(new C8Impl1()),
                new C9(new C8Impl2()),
                new C9(new C8Impl3())
        };

        for (var c9 : c9s) {
            c9.doC9Stuff();
        }
    }

    public static void main(String[] args) {
        demo1();
        System.out.println();

        demo2();
    }
}
