interface Lambda_Interface
{
   void m1();
   //int m2(int a);
}

// public class Lambda_functions implements Lambda_Interface
//{
//    public void m1()
//    {
//        System.out.println("I am Lambda_functions implemented method");
//    }
//
//}

 class Main_Class_Lambda
{
    public static void main(String[] args)
    {
        //one way to implement abstract method in interface
        //class is created to implement methods of interface
       // Lambda_functions lf=new Lambda_functions();
        //lf.m1();

        //another way
        //It is an anonymous inner class used
        //to provide implementation of an interface without creating a separate class.

//        Lambda_Interface li=new Lambda_Interface() {
//            @Override
//            public void m1() {
//                System.out.println("I am Lambda_functions implemented method");
//            }
//
//        };
//
//        li.m1();
//
        Lambda_Interface li2=()->{
            System.out.println("I am Lambda_functions implemented method");
        };

        li2.m1();

//        Lambda_Interface li3=(a)->a;
//        System.out.println(li3.m2(10));

          //if you use curly braces , then "return" must be there




    }


}
