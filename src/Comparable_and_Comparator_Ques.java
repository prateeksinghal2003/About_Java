import java.util.Comparator;
import java.util.TreeSet;


class MySorting implements Comparator
{

    public int compare(Object o1,Object o2)

    {
        String s1=o1.toString();
        String s2=o2.toString();

        int len1=s1.length();
        int len2=s2.length();

        if(len1>len2)
            return 1;

        else if(len2>len1)
            return -1;

        else
            //return 0;
          return s1.compareTo(s2);
    }

}
public class Comparable_and_Comparator_Ques
{



    public static void main (String[] args)
    {
        TreeSet ts=new TreeSet(new MySorting());
        ts.add("AAAA");
        ts.add("BB");
        ts.add("A");
        ts.add("BBB");
        ts.add("AA");
        ts.add("AAA");
        ts.add("B");

        //sorting on the basis of alphabetical order without passing MySorting object
        System.out.println(ts);

        //after passing MySorting object
        //it gives   A   ,  BB,BBB,AAAA
        //sorting on the basis of length
        //string of same length is ignored since returning zero

    }
}
