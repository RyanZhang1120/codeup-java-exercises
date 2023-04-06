package collections_lectures;

import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {

        //arrays - ["look", "like", "this", "still"]
        //Java has some rules - some specifics it is looking for
        //In JavaScript. . our arrays were flexible, fluid - could store all kinds of primitives and complex objects
        //in JS the arrays had an self-increasing size - you add a thing, the array gets bigger; you remove a thing, the array gets smaller

        //Java asks: WHAT DATA GOES IN THIS ARRAY
        //Then: WHAT AMOUNT/LENGTH OF ARRAY DO YOU NEED
//        int[] myNums = new int[3];
//        double[] myDoubles = new double[2];
//        String[] myStrings = new String[2]; //Init and declare an array without defining any elements [Java fills in with the default]

        //If: we create an array of a specific length with specific data types (as required) but do NOT add 'values' to the elements.. Java fills up our array with default values

//        System.out.println("myNums[0] = " + myNums[0]);
//        System.out.println("myDoubles[0] = " + myDoubles[0]);
//        System.out.println("myStrings[0] = " + myStrings[0]);
//
//        myNums[0] = 222;
//
//        System.out.println("myNums[0] = " + myNums[0]);
//
//        String[] myCats = {"Peanut", "Pinch", "Pumpkin"}; //Array initializer syntax - sets up the proper length AND puts the elements in the position indicated

//        for(int i = 0; i < myCats.length; i++){
//            System.out.println(myCats[i]);
//        }

        //for (ElementDatatype variableName : arrayName) { do some stuff }
//        for (String oneOfMyCats : myCats) { //Go get that array 'myCats' and inside these brackets I'm going to refer to one element as 'oneOfMyCats'
//
//            System.out.printf("Here's a cat I own - the cat's name is %s %n", oneOfMyCats);
//
//        }

        int[] ourFavoriteNumbers = {13, 47, 1738, 21, 1000, 27, 16};
//
//        for (int aNumber : ourFavoriteNumbers){
//            System.out.printf("Here's a number we love: %d %n", aNumber);
//        }
        // System.out.println("myCats[3] = " + myCats[3]); //BZZT - arrayouttabounds < < R T E

        //Well - what if I want to . . DO STUFF with my array?
        //Check if an array is equal to another?
        //Make a copy of an array?
        //Can I cast an array 'toString' with a method?
        //To do the above. . we need to go get a class to work with [Arrays class < full of STATIC methods I can use with my arrays]

        //.sort()
        Arrays.sort(ourFavoriteNumbers);
//
//        System.out.println();
//        for (int aNumber : ourFavoriteNumbers){
//            System.out.printf("Here's a number we love: %d %n", aNumber);
//        }

        //toString - our arrays will usually have a 'memory reference' [String representation of the object in memory]

//        String stringArrayNums = Arrays.toString(ourFavoriteNumbers);
//        System.out.println("stringArrayNums = " + stringArrayNums);

        //copyOf() < lets us make a copy with a new length (added length or subtracted length

//        String[] citiesWeHaveBeenTo = new String[4];
//
//        Arrays.fill(citiesWeHaveBeenTo, "San Antonio");
//
//        for (String s : citiesWeHaveBeenTo) {
//            System.out.println(s);
//        }
//
//        System.out.println("~~~~");
//        String[] citiesWeHaveBeenToShorter = Arrays.copyOf(citiesWeHaveBeenTo, 1);
//
//        for (String s : citiesWeHaveBeenToShorter) {
//            System.out.println(s);
//        }
//
//        String[] testStringArray = new String[0];
//
//        System.out.println("testStringArray.length = " + testStringArray.length);
////        System.out.println(testStringArray[0]);
//
//        System.out.println("~~~~");
//        System.out.println(Arrays.equals(citiesWeHaveBeenTo, citiesWeHaveBeenToShorter));
//        System.out.println("~~~~");
//        String[] copyOfCitiesWeHaveBeenTo = Arrays.copyOf(citiesWeHaveBeenTo, 4);
//        System.out.println(Arrays.equals(citiesWeHaveBeenTo, copyOfCitiesWeHaveBeenTo));

        //When back from lunch: example of sort with String numerics vs primitive numeric literals
        String[] numsAsStringsSortExample = {"13", "47", "1738", "21", "1000", "27", "16"};

        Arrays.sort(numsAsStringsSortExample);

        System.out.println(Arrays.toString(numsAsStringsSortExample));

        System.out.println(Arrays.toString(ourFavoriteNumbers));

        //Enter the Matrix. . .
        //arrays of arrays
        //{ {arr1..}, {arr2}, {arr3}
        // }

        String[][] mySurpriseMatrix = { //container array
                {"racecar toy", "trading card", "cat figurine"}, //nested arr1(containerArray[0])
                {"challenge coin", "pokemon figurine", "temp. tattoo"}, //nested arr2(containerArray[1])
                {"dragonball figurine", "hello kitty doll", "lucky cat card"} //nested arr3(containerArray[2])
        };

        int rand1 = (int)(Math.random() * 3);
        int rand2 = (int)(Math.random() * 3);

        System.out.println("If I want the pokemon figurine specifically: " + mySurpriseMatrix[1][1]);

        System.out.printf("rand1: %d; rand2: %d %n", rand1, rand2);
        System.out.println("Here's the surprise you got: " + mySurpriseMatrix[rand1][rand2]);

        System.out.println(" - ~ - ~ - ");

        for(int i = 0; i < mySurpriseMatrix.length; i++){
            //Outer loop print:
            System.out.println("Here's one of our interior / nested arrays:");
            System.out.println(Arrays.toString(mySurpriseMatrix[i]));

            System.out.println(" - | - | - ");
            System.out.println("Here's what inside the nested array: ");
            //Talking to the inner array with an inner loop
            for(int j = 0; j < mySurpriseMatrix[i].length; j++){
                System.out.println(mySurpriseMatrix[i][j]);
            }

        }
    }


}