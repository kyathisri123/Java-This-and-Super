package ThisandSuper;

class PrintCurrentClassFields {
    int a = 10;
    String name = "Java";

    void display() {
        System.out.println("a = " + this.a);
        System.out.println("name = " + this.name);
    }

    public static void main(String[] args) {
        new PrintCurrentClassFields().display();
    }
}
