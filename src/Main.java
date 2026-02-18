public class Main
{
    public static void main (String[] args)
    {
        Static_Methods sm=new Static_Methods();

        //cannot override cannot static methods
        //sm.fun();

        //to call static methods
        Static_Methods_Interface.fun();

//        Default_Methods dm=new Default_Methods();
//        dm.fun();
    }
}
