import java.util.*;

class Student
    {
        int roll;
        String name;

        Student(int r,String n)
        {
            roll=r;
            name=n;
        }



        @Override
        //will get called when printing objects
        public String toString()
        {
            return roll+"-"+name;
        }


    }

    //here original class is not changed
   class SortByName implements Comparator
   {
       //here only one method is implemented , because SortByName extends Object , which has equals method

       @Override
       public int compare(Object o1, Object o2) {
           Student s1=(Student) o1;
           Student s2=(Student) o2;

           return s1.name.compareTo(s2.name);

       }
   }

class SortByRoll implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;

        Integer i1=new Integer(s1.roll);
        Integer i2=new Integer(s2.roll);



        return i1.compareTo(i2);

    }
}

    public class Comparator_Class
    {

        public static void main(String[] args)
        {
            Student s1=new Student(29,"Karan");
            Student s2=new Student(30,"Tejus");
            Student s3=new Student(31,"Nikhil");
            Student s4=new Student(32,"Deepesh");
            Student s5=new Student(33,"Tarun");

        TreeSet<Student> ts=new TreeSet<>(  new SortByName());
        ts.add(s1); ts.add(s2); ts.add(s3); ts.add(s4); ts.add(s5);

            TreeSet<Student> ts2=new TreeSet<>(  new SortByRoll());
            ts2.add(s1); ts2.add(s2); ts2.add(s3); ts2.add(s4); ts2.add(s5);

//        for(Student s:ts)
//        System.out.println(s.name +","+s.roll);

            //with toString() method no need to use for loop
            System.out.println(ts);
            System.out.println(ts2);

//            ArrayList<Student> al=new ArrayList<>();
//            al.add(s1); al.add(s2); al.add(s3); al.add(s4); al.add(s5);
//
//            Collections.sort(al);
//            System.out.println(al);






        }

    }


