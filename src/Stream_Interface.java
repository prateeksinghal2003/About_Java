import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//how to get stream instance
public class Stream_Interface
{


    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(90);
        al.add(33);
        al.add(7);
        al.add(20);

        //1st way to get stream instance
        //Stream means:
        //A flow of data on which we can perform operations (filter, map, sort, print etc.)
       // Stream<Integer> s1=al.stream();
        //here elements goes inside the stream
        //use forEach loop to print
        //s1.forEach(e->System.out.println(e));

        //2nd method to get stream instance
       // Stream s2=Stream.of(al);
        //here the whole list is itself an element
      //  s2.forEach(e->System.out.println(e));

        //3rd way to get stream instance
       // Stream s3=Stream.of(100,200,300,"deep");
       // s3.forEach(e->System.out.println(e));

        //4th way to get stream instance
       // int[] arr={1,2,3};
       // IntStream s4=Arrays.stream(arr);
       // s4.forEach(e->System.out.println(e));

        //creating empty stream instance
       // Stream s5=Stream.empty();


        //------------------Filter Method

        Stream<Integer> s=al.stream();
        /*Stream without <Integer> means:
        Java does NOT know the type of e
        So compiler treats e as Object*/

        List l= s.filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(l);

//            What is Collectors in Java?
//            Collectors is a utility class (helper class) in the Stream API.

        //Purpose :
        /*It converts the result of a Stream into a final form like List, Set, Map
        String, count, sum, etc.

        Common Collectors (Important) ::
        1. toList()
             Convert stream → List
            .collect(Collectors.toList());

         2.toSet()
             Convert stream → Set (removes duplicates)
            .collect(Collectors.toSet());

         3.toMap()
            Convert stream → Map
            .collect(Collectors.toMap(
                    e -> e,        // key
                    e -> e * e     // value
            ));

        4.joining() (for Strings)
            Combine elements into one String
            .collect(Collectors.joining(", "));

        5.counting()
        Count number of elements
        long count = al.stream().collect(Collectors.counting());*/


        /*collect() is a terminal operation of Stream.
        It takes the processed stream elements and converts them into a final result
        (List, Set, Map, String, etc.)*/

        /*stream() → creates stream
        filter()/map() → process stream
        collect() → consumes stream and returns data*/

        //to reduce LOC
        al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
        List li=al.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(li);

        //count even numbers
        Long count=al.stream().filter(e->e%2==0).count();
        System.out.println(count);


     //-------------------Map method
        // print square of each number

        List sq=al.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(sq);

        //convert each word to uppercase
        ArrayList<String> words=new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("i am not freecharge");

        words.stream().map(word->word.toUpperCase()).forEach(e->System.out.println(e));

         //---------------Sorted method
        List sort=al.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

         //in descending order
        List sort_rev=al.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
        System.out.println(sort_rev);






    }
}
