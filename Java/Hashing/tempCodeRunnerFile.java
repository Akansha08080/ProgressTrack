import java.util.*;
class CreateHashmap
{
    static void hashmapMethod()
    {

        Map<String, Integer>mp= new HashMap<>(); 

    //Adding elements into hashmap
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Harry",18);

    //Getting values of key from hashmap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul")); // here null will be returned because there is no key named "rahul"
        

    //Changing/ Updating the value of key in the hashmap
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));
    //Remove a pair from hashmap

    mp.remove("Akash");
    System.out.println(mp.get("Akash"));
    System.out.println(mp.get("Yash"));
    System.out.println(mp.remove("Yash"));

    //Check if the key is present in the Hashmap or not

    System.out.println(mp.containsKey("Akash"));
    System.out.println(mp.containsKey("Lav"));
    //Check if the values are present in the Hashmap or not

    System.out.println(mp.containsValue(21));
    System.out.println(mp.containsValue(17));

    //Adding a new entry only if the new key doesn't exist already
    mp.putIfAbsent("Yashika",30);
    mp.putIfAbsent("Yash",30);
    System.out.println(mp.get("Yash"));

    //Get all keys in the HashMap
    System.out.println(mp.KeySet());
    }
    public static void main(String args[])
    {

        hashmapMethod();
    }
}