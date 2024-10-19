class Parent {
    public void print() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void print() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        parent.print();
        child.print();
        child.print();
    }
}
