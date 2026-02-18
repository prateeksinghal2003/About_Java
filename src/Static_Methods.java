interface  Static_Methods_Interface
{

    static void fun()
    {
         System.out.println("I am from static method interface");
    }

}

public class Static_Methods implements Static_Methods_Interface
{

//    This class is not implementing interface method
//    it just defines another independent static method with the same name.

//    static void fun()
//    {
//        System.out.println("I am from static method implemented class");
//    }
}
