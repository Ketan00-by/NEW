package Homework.Variable;
//display
    class AA {
        void display1()

        {
            System.out.println("this class 1");
        }
    }
        class BB {
            void display2()

            {
                System.out.println("this class 2");
            }
        }
         class CC{
        void display3(){
                 System.out.println("this class 3");
        }
    }
class mainAssignment2{
    public static void main(String[] args) {
        AA obj1=new AA();
        BB obj2=new BB();
        CC obj3=new CC();
        obj1.display1();
        obj2.display2();
        obj3.display3();
    }
}