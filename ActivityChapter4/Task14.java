public class Task14 {

    abstract class abstractClass {
        abstract void abstractMethod();
        void concreteMethod() { // concrete methods are still allowed in abstract classes
            System.out.println("This is a concrete method.");
        }
    }

    class B extends abstractClass {
        void abstractMethod() {
            System.out.println("B's implementation of abstractMethod.");
        }
    }

    class C extends abstractClass {
        // Your code goes here - IMPLEMENTATION ADDED
        void abstractMethod() {
            System.out.println("C's implementation of abstractMethod.");
        }
    }

    public static void main(String args[]) {
        // Create an instance of the outer class to access the inner classes
        Task14 task = new Task14();
        
        // B object execution
        Task14.B b = task.new B();
        b.abstractMethod();   // Output: B's implementation of abstractMethod.
        b.concreteMethod();   // Output: This is a concrete method.
        
        // C object execution
        Task14.C c = task.new C();
        c.abstractMethod();   // Output: C's implementation of abstractMethod.
        c.concreteMethod();   // Output: This is a concrete method.
    }
}
