package CollectionInDepth;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        //Collection values=new ArrayList();
        List<Integer> values=new ArrayList<Integer>();
        //values.add("Biswajit");
        values.add(882);
        values.add(244);
        values.add(186);
        values.add(741);
        values.add(699);
        values.add(105);
       // values.add("Kulabahal");

        // Lamda Number indexing sort, like we want to sort in last digit of the number
        Collections.sort(values,(s1,s2)->{

            return s1%10>s2%10?1:s1%10<s2%10?-1:0;
        });

        for (int i: values){

            System.out.println(i);
        }

        //adding 99 at the index 2. works only for List But will not works for Collection.
        values.add(2,99);

        //Sorting the elements. Only List has the sort feature in collection.
        Collections.sort(values);
        //If we use Collection then we can't add values in right index / particular index But list has the features.

        //Stream API: Lamda Expression ...
        values.forEach(System.out::println);

        /* Iterator*/
       // Iterator i=values.iterator();

        /*while(i.hasNext()){

            System.out.println(i.next());
        }*/

        // Enhance For Loop
        for (Object i: values){

            System.out.println(i);
        }


    }


}
