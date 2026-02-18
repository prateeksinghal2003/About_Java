
@FunctionalInterface
interface Default_Methods_Interface  {
    //make default for implementing a function
    //here default is  a keyword which can make a method concrete
    default void fun()
    {
        System.out.println("I am from default method interface");
    }

       void fun2();

}

class Default_Methods implements Default_Methods_Interface
{

    //can provide its own implementation

     public void fun()
    {
        System.out.println("I am from default method implemented class");
    }

    public void fun2()
    {

    }
}