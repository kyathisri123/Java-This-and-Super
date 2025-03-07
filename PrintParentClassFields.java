package ThisandSuper;

class Parent {
    int x = 50;
    String msg = "Hello from Parent";
}

class PrintParentClassFields extends Parent {
    void display() {
        System.out.println("x = " + super.x);
        System.out.println("msg = " + super.msg);
    }

    public static void main(String[] args) {
        new PrintParentClassFields().display();
    }
}

