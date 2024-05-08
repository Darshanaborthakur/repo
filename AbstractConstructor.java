abstract class Base {
    Base()
       {
        System.out.println("Base Constructor called.");
       }

    abstract void fun();
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Constructor called.");
    }

    void fun() {
        System.out.println("Derived fun");
    }
}

class AbstractConstructor {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.fun();
    }
}