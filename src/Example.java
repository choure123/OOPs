public class Example {

        public static void main(String[] args) {
            //parameter

            Animal a1 = new Animal();
            a1.breathe();
            //System.out.println(a1.l);
            //Animal2.Animal21.breathe();//
            //Animal2.Animal21 a2 = new Animal2.Animal21();
            //static the value is shared
            //System.out.println(Animal2.Animal21.l);
            //dot operator helps us to go inside the scope
            //Why does it exist and why animal requires object
        }
    }

    //blueprint -> object? by using constructor we can create an object of the specific class
//class name should be nouns
//naming words are called nouns
//class name should be uppercase case
// it doesnt exist as physcal entity -> objects in whiich space the function exist?
    class Animal{
        int l = 170;

        //how should i approach the function
        //since it doesnt gets created statically or predefined it only loads when we create an object. we can can say it only exist as an instance
        public void breathe(){

            String type;
            System.out.println("Animal 1 is breathing");
        }//where does it exist??
    }
    //when you write static it makes it exist
    class Animal2{
        class Animal21 {
            int l = 140;
            public  final void breathe() {
                l = 10;
                String type;
                System.out.println("Animal21 is breathing");
            }
            void b1(){
                l = 1;
                System.out.println(l);
            }

        }
    }


