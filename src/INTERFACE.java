//Interface_One declaration
interface Interface_One{
    void print();
}

//Interface_Two declaration; inherits from Interface_One
interface Interface_Two extends Interface_One{
    void show();
}

//multiple inheritance - DemoClass implementing  Interface_Two
/*class DemoClass implements Interface_Two
    public void print(){        //Override Interface_Two print()
        System.out.println("Democlass
    public void print() {        //Override Interface_Two print()
        System.out.println("Democlass");
        public class INTERFACE {
            public static void main(String args[]) {
                DemoClass obj = new DemoClass();  //create DemoClass object and call methods
                obj.print();
                obj.show();
            }
        }"
 */
