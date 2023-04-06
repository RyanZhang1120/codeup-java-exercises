package collections_lectures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsLecture {


    public static void main(String[] args) {
        //Collections: a library that is part of the standard Java libraries (meaning not third party)
        //Collections is built very well with OOP - look at https://en.wikipedia.org/wiki/Java_collections_framework#/media/File:Java.util.Collection_hierarchy.svg

        // ArrayLists - words that come to mind: flexible, resizable, cleaner, accessible
        //Remind us of working with arrays in JavaScript (that means as little and as much as I stated)

        //Wrapper classes - ArrayLists are similar to a 'wrapper' for Arrays, and we NEED to know about wrapper classes since ArrayLists do NOT allow primitives
        ArrayList<Integer> myNums = new ArrayList<>();

        //Before: We combined ARRAY the class with ARRAYS the helper class
        //Arrays (plural) had methods to help us work with arrays (Arrays.toString())
        //Array: base definition in Java
//
//        String[] myStrings = {"strings", "here", "for", "sale"};
//
//        Arrays.copyOf(... do some stuff)

        //Now: ArrayList the class has all of those methods built into it we are going to use

        ArrayList<String> myFavoriteColors = new ArrayList<>();

        //.add < add(thingHere) to arraylist
        myFavoriteColors.add("Purple");
        myFavoriteColors.add("Green");
        myFavoriteColors.add("Red");

        //.add nums < to show toString

        myNums.add(222);
        myNums.add(13);
        myNums.add(7);
        myNums.add(21);

        System.out.println(myFavoriteColors);

        //before: Arrays.toString(myNums) to get a good result imo

        System.out.println(myNums);

        //before: .length, now: .size

        System.out.printf("myNums is size %d; myFavoriteColors is size %d%n", myNums.size(), myFavoriteColors.size());

        //indexOf is back! *airhorn*
        System.out.println("myFavoriteColors.indexOf(\"Purple\") = " + myFavoriteColors.indexOf("Purple"));

        System.out.println("myFavoriteColors.indexOf(\"Pink\") = " + myFavoriteColors.indexOf("Pink"));

        //.contains; .lastIndexOf; .isEmpty; .remove

        System.out.println("myFavoriteColors.contains(\"Rebecca Purple\") = " + myFavoriteColors.contains("Rebecca Purple"));

        System.out.println("myFavoriteColors.contains(\"Purple\") = " + myFavoriteColors.contains("Purple"));

        myNums.add(222);

        System.out.printf("%n Here's an example of indexOf and lastIndexof %n indexOf '222': %d; lastIndexOf '222': %d %n", myNums.indexOf(222), myNums.lastIndexOf(222));

        //.remove is overloaded as well
        //We have two '222' Integer values in myNums.. first, we'll remove the last 222 with a specific index

        System.out.println();
        System.out.println(myNums);

        myNums.remove(myNums.lastIndexOf(222)); //FIND lastIndexOf 222 and RETURN NUM of INDEX, numOfIndex passes to .remove, .remove targets the incoming index and deletes it

        System.out.println(myNums);

        myNums.add(222);

        myNums.remove((Integer) 222); //find the FIRST left to right search match and remove

        System.out.println(myNums);

        System.out.println("~ ~ ~ ~ hash maps ~ ~ ~ ~");

        //HashMap - Weezer
        //Key:Value pairs ("student":"kenny"; "student": "david"; "student":"genesis"; "student":"riley");

        //Syntax: HashMap<DataTypeKey, DataTypeValue> variablename = new HashMap<>();
        HashMap <String, String> studentCohort = new HashMap<>();

        //.put things inside of our hashmap

        studentCohort.put("Kenneth Howell", "Deimos");
        studentCohort.put("Austin Joiner", "Azeban");
        studentCohort.put("Nathan Adcock", "Marco");
        studentCohort.put("Delayne LaBove", "Bash");

        System.out.println(studentCohort);

        //What about mixing datatypes?

        HashMap <String, Integer> customerHashMap = new HashMap<>();

        customerHashMap.put("Kenneth Howell", 2103153119);

        customerHashMap.put("Kevin Powell", 2106843248);

        customerHashMap.put("Keith Lowell", 2106808000);

        System.out.println(customerHashMap);


        //.get things outside of our hashmap (with the key)

        System.out.println("Kenneth Howell's number : " + customerHashMap.get("Kenneth Howell"));

        System.out.println(customerHashMap.get("Thomas Mescall"));
        //. . . .getOrDefault (go get it or use this default)
        System.out.println(customerHashMap.getOrDefault("Thomas Mescall", 555555555));


        //boolean methods: .containsKey (t/f); .containsValue (t/f)
        System.out.println("Did customerHashMap have the key of 'Thomas Mescall'? " + customerHashMap.containsKey("Thomas Mescall"));
        System.out.println("Did customerHashMap have the key of 'Kenneth Howell'? " + customerHashMap.containsKey("Kenneth Howell"));

        System.out.println("Did the customerHashMap have the value of 8675309? " + customerHashMap.containsValue(8675309));
        System.out.println("Did the customerHashMap have the value of 2103153119? " + customerHashMap.containsValue(2103153119));

    }
}
