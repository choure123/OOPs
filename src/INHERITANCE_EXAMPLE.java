

// Base class or superclass
class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Derived class or subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String color, int numDoors) {
        super(brand, color);
        this.numDoors = numDoors;
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    // Additional methods specific to Car

    // Getters and setters
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}

public class INHERITANCE_EXAMPLE {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red", 4);
        car.start();
        car.drive();
        car.stop();

        System.out.println("Car brand: " + car.getBrand());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Number of doors: " + car.getNumDoors());
    }
}


// Base class or superclass
class Contact1 {
    private String name;
    private String phoneNumber;

    public Contact1(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

// Derived class or subclass
class Person extends Contact1 {
    private String address;

    public Person(String name, String phoneNumber, String address) {
        super(name, phoneNumber);
        this.address = address;
    }

    @Override
    public void displayContact() {
        super.displayContact();
        System.out.println("Address: " + address);
    }

    // Additional methods specific to Person

    // Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Derived class or subclass
class Business extends Contact1 {
    private String organization;

    public Business(String name, String phoneNumber, String organization) {
        super(name, phoneNumber);
        this.organization = organization;
    }

    @Override
    public void displayContact() {
        super.displayContact();
        System.out.println("Organization: " + organization);
    }

    // Additional methods specific to Business

    // Getters and setters
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}

class ADDRESS {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "1234567890", "123 Main St");
        Business business = new Business("Acme Corp", "9876543210", "Software Solutions");

        System.out.println("Person Contact:");
        person.displayContact();

        System.out.println("\nBusiness Contact:");
        business.displayContact();
    }
}

//daimond problem
interface Animal1 {
    void speak();
}

class Dog implements Animal1 {
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal1 {
    public void speak() {
        System.out.println("Cat meows");
    }
}


/*class DogCat implements Dog, Cat
    public static void main(String[] args) {
        DogCat dogCat = new DogCat();
        dogCat.speak();
    }

    class DogCat implements Dog, Cat {
        public void speak() {
            System.out.println("DogCat meows and barks");
        }

        public static void main(String[] args) {
            DogCat dogCat = new DogCat();
            dogCat.speak();
        }

    }

 */
class A1
{
    public void display()
    {
        System.out.println("class A display() method called");
    }
}
class B1 extends A1
{

    public void display()
    {
        System.out.println("class B display() method called");
    }
}
class C extends A1
{
    public void display()
    {
        System.out.println("class C display() method called");
    }
}
//not supported in Java
 class D extends A1
{
    public static void main(String args[])
    {
        D d = new D();
//creates ambiguity which display() method to call
        d.display();
    }
}
interface Animal11 {
    void speak();
}

class Dog1 implements Animal11{
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat1 implements Animal11 {
    public void speak() {
        System.out.println("Cat meows");
    }
//}

//class Dog1Cat1  extends Dog1 implements Cat1 {
   // public static void main(String[] args) {
      //  Dog1Cat1 dogCat = new Dog1Cat1();
      //  dogCat.speak();
  //  }
//}
//class DogCat implements Dog, Cat {
  //  public void speak() {
    //    System.out.println("DogCat meows and barks");
//    }

   // public static void main(String[] args) {
       // DogCat dogCat = new DogCat();
    //    dogCat.speak();
   // }
}
