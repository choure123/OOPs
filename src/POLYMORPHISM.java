public class POLYMORPHISM {
    static int add (int a , int b){
        return a + b;
    }
    static double add (double a, double b){
        return a + b;
    }
    //resolving of the functions is done during compile time that is why it is called compile time polymorphism
    public static void main(String[] args) {
        double a = 10;
        double b = 40;
        System.out.println(add(a,b));
    }
}

class A {
    void add() {
        int a = 10;
        int b = 20, c;
        c = a * b;
        System.out.println(c);

    }

    void add(int x, int y) {
        int c;
        c = x * y;
        System.out.println(c);
    }

    void add(int x, double y) {
        double c;
        c = x * y;
        System.out.println(c);

    }

    public static void main(String[] args) {
        A r=new A();
        r.add (); r.add(100,200); r.add ( 50,45.22);
    }
}
