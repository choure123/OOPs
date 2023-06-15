public class ABstract {
    public static void main(String[] args) {
        Animal10 a1 = new Dog10();
        a1.eat();
        a1.sleep();
    }
}
//abstraction ?: we just want to tell what it does not how it is done
//abstract class is always have other concrete methods abstraction is not 100 percent
interface Animal10{
    public void eat();
    public void sleep();
}
class Dog10 implements Animal10{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

