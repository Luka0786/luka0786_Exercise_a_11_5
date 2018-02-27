package Kap11Exercise5;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Opgave5
{
    /*
    Write a method called sortAndRemoveDuplicates that accepts a list of integers
    as its parameter and rearranges the list’s elements into sorted ascending order,
    as well as removing all duplicate values from the list. For example, the list
    [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become
    [–9, –5, 4, 7, 8, 11, 15, 27, 32] after a call to your method.
    Use a Set as part of your solution.
    */

    public static void main(String[] args)
    {
        List<Integer> theList = new LinkedList<>();
        theList.add(0, -2);
        theList.add(1, 3);
        theList.add(2, -77);
        theList.add(3, -16);
        theList.add(4, 0);
        theList.add(5, 13);
        theList.add(6, 29);
        theList.add(7, 9);
        theList.add(8, 77);
        theList.add(9, 13);
        theList.add(10, 5);
        theList.add(11, 10);
        theList.add(12, -8);
        theList.add(13, -2);
        theList.add(14, 9);
        theList.add(15, 77);
        theList.add(16, 0);

        System.out.println(sortAndRemoveDuplicates(theList));

    }

    public static Set<Integer> sortAndRemoveDuplicates(List<Integer> listOfIntegers)
    {
        Set<Integer> treeSet = new TreeSet<>(listOfIntegers);
        for (int i = 0; i < listOfIntegers.size(); i++)
        {
            treeSet.add(i);
        }
        return treeSet;
    }
}
