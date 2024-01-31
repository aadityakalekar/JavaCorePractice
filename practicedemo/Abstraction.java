package practicedemo;

abstract class Vehicle {
    public abstract void run();

    public void m1() {
        System.out.println("Concrete method of abstract class");
    }
}

interface Account {
    int num = 10;

    void withdraw();

    default void m1() {
        System.out.println("Concrete method of interface");
    }

    static void m2() {
        System.out.println("Concrete method of interface");
    }

    default void deposit() {
        System.out.println("Default method: Deposit");
    }
}

class Acc implements Account {
    @Override
    public void withdraw() {
        System.out.println("Override Method");
    }

    @Override
    public void m1() {
        Account.super.m1();
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println(Account.num);

        // The following line will result in a compilation error
        // Account.num = 22;

        Acc acc = new Acc();
        acc.withdraw();
        acc.m1();
        acc.deposit();

        // Static method of interface can be called using interface name
        Account.m2();
    }
}
