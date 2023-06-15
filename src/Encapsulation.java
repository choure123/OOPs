public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Arti");
        s1.setRollNo(1);
        System.out.println(s1);
    }
}
    class Student{
        private String name;
        private int rollNo;

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "name:  " +  name + "  " + "roll: " + rollNo ;
            //custom output of a class
        }
    }
