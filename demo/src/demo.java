public class demo {
    int i;

    void display(demo param1) {
        System.out.println("i -" + param1.i);
        System.out.println("i -" + this.i);
    }

    public static void main(String[] args) {
        demo object1 = new demo(10);
        demo object2 = new demo(20);
        object1.display(object2);
        object2.display(object1);
    }

    demo(int j) {
        i = j;
    }
}
