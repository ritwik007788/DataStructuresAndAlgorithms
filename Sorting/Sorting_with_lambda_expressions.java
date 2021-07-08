// can be used to sort HashMaps , Lists , 2Darrays(merge intervals) , Stings(Top k freq words) etc.
// general format:
//(a,b) -> (write sorting mechanism using 0,1,-1)

//LIST

import java.util.*;
  
public class Demo {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " + 
                              "before sorting : " + al);
  
        // using lambda expression in place of comparator object
        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);  // sorting in descending order
  
        System.out.println("Elements of the ArrayList after" + 
                                           " sorting : " + al);
    }
}

//MAP

//for hashmaps just create a list of key values using keySet() as follows
ArrayList<Integer> list = new ArrayList<>(map.keySet());
// sort the keys according to their values using lambda expressions
Collections.sort(list,(a,b) -> (map.get(a)>map.get(b))?1:(map.get(a)<map.get(b))?-1:0;
// the list is now sorted in ascending order
                 

//2D ARRAYS
                 // technique used in merge intervals
                 Arrays.sort(arr , (a,b) -> (a[0]>b[0])?-1:(a[0]<b[0])?1:0;
                             
//
                 
list is a list of strings like "hello" , "i" , "coding" etc;
                             Collections.sort(list,(a,b) -> a.equals(b)?a.compareTo(b): b - a; // sorts in descending order
