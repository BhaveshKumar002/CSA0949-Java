class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("SuperClass value: " + value);
    }
}

class SubClass extends SuperClass {
    int value;

    SubClass(int superValue, int subValue) {
        super(superValue);
        this.value = subValue;
    }

    void display() {
        super.display();
        System.out.println("SubClass value: " + value);
    }
}

public class MemberHidingExample {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}
