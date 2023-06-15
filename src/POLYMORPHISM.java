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

