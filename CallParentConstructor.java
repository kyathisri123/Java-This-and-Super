package ThisandSuper;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class CallParentConstructor extends Parent {
    CallParentConstructor() {
        super(); // Calls Parent class constructor
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new CallParentConstructor();
    }
}
