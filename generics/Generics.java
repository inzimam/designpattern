package generics;

import structural.adapter.AdapterPatternDemo;

public class Generics {
    public static void main(String[] args) {
        MyGeneric<String, Integer> myGeneric = new MyGeneric<>("India", 13);
        System.out.println("First " + myGeneric.getObj1() + " " + myGeneric.getObj2());
        myGeneric.printObj();
        MyGeneric<Integer, Boolean> myGenericInt = new MyGeneric<>(2, true);
        System.out.println("First " + myGenericInt.getObj1() + " " + myGenericInt.getObj2());
        myGenericInt.printObj();
        doWork("I love generics");
        doWork(23);
        doWork(true);
        doWork(new AdapterPatternDemo());
    }

    static <T> void doWork(T element) {
        System.out.println(element.getClass().getName() + " : " + element);
    }
}

class MyGeneric<T, U> {
    T obj1;
    U obj2;

    public MyGeneric(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void printObj() {
        System.out.println("Sec " + obj1 + " " + obj2);
    }

    T getObj1() {
        return obj1;
    }

    U getObj2() {
        return obj2;
    }
}

