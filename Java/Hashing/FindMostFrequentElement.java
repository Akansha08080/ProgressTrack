// Given an array, find the most frequent element in it. If there are multiple elements that appear a maximum number of times then print any one of them.
import java.util.*;
public class FindMostFrequentElement {

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,3,5,4,4,4,6,7,8};
        Map<Integer, Integer>freq= new HashMap<>();
        for(int el: arr)
        {
            if(!freq.containsKey(el))
            {
                freq.put(el,1);
            }
            else
            {
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frequency map");
        System.out.println(freq.entrySet());
        int maxfreq=0, anskey=-1;

        for(var e:  freq.entrySet())
        {
            if(e.getValue()>maxfreq)
            {
                maxfreq=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.println(anskey);
    }
    
}
