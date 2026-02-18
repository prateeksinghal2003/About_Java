import java.util.*;
import java.util.stream.Collectors;

public class Stream_Interface_Ques
{
    public static  void main(String[] args)
    {
        //WAP to print all the numbers which are greater than 30
        //WAP to get minimum and maximum
        //WAP to print the sum of all even numbers
        ArrayList<Integer> al=new ArrayList<>();


        al.add(10);
        al.add(26);
        al.add(33);
        al.add(40);
        al.add(50);

        List<Integer> grt=al.stream().filter(e->e>30).collect(Collectors.toList());
        System.out.println(grt);

        int min;
        min=al.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum element is "+min);

        int max;
        max=al.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Maximum element is "+max);


        int sum=0;
        List<Integer> sum_ev=al.stream().filter(e->e%2==0).collect(Collectors.toList());

        for(Integer i:sum_ev)
        {
            sum+=i;

        }

        System.out.println("Sum of even elements are "+sum);








        //WAP to print all the words first letter
        //WAP to replace 'a' character with 'z'
        ArrayList<String> words=new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("deepak");
        words.add("pranit");



        List<Character> fir_lett=words.stream().map(e->e.charAt(0)).collect(Collectors.toList());
        System.out.println(fir_lett);


        List<String> rep_list=words.stream().map(e->e.replace('a','z')).collect(Collectors.toList());
        System.out.println(rep_list);



    }
}
