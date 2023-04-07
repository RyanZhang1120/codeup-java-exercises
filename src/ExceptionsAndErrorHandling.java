public class ExceptionsAndErrorHandling {

    public static void main(String[] args) {

        //Exceptions in Java have a hierarchy
        //Errors < not really something we can 'handle' (think: running out of memory, critical bug in the virtual machine running the bytecode, etc.)
        //Exceptions < something we CAN attempt to handle (and sometimes Java will FORCE us to handle)

        //"Proper" definitions:
        //  Error: An Error indicates a serious problem that a reasonable application should not try to catch.
        //  Exception: Exception indicates conditions that a reasonable application might try to catch.

        //Checked (preflight) exceptions
        //Stop compilation - won't run
//        throw new Exception("Put in a message about the exception");

        //Unchecked (during flight) exceptions
        //Can compile and run - will hit you in the middle of runing your app
//        int[] myNums = {7, 222, 13};
//
//        System.out.println(myNums[4]);

        //Okay - so we've seen examples of both live, what do I do?

        //A. "Throws" < different than 'throw', little tricky. . .

        //If you 'throw' (think: throwing a flag on the play, or calling a timeout) an exception you are CAUSING that exception to happen

        //If you add 'throws' into a method signature, you're kicking the can down the road - you're basically saying to Java "I know this can cause XYZ Exception, but I am not handling that possibility right here"

        //We saw: Adding 'throws' into the public static void main as an example

        //B. Try - Catch block

        // try { //code to attempt }
        // catch (ExceptionYouAreWorriedAbout variableName) { things to do if that exception happens)
        // catch (ExceptionYouAreWorriedAbout2 variableName2) { things to do if that second  exception happens)
        //.. you can add in an optional 'finally' block finally { this will always happen }

        int[] yourNums = {13, 21, 9001, 453453, 25};

//        try {
//            int x = yourNums[2]; //Current experiment: Fix the 'array out of bounds'; throw a different exception
//
//            //throw new Exception("This is a generic one!");
//
//            throw new ArrayIndexOutOfBoundsException("Here's us throwing an 'ArrayIndexOutofBounds' manually");

//        } catch (ArrayIndexOutOfBoundsException exceptionObject){
//            System.out.println("Here's us talking to the incoming argument with the getMessage method:");
//            System.out.println(exceptionObject.getMessage());
//            System.out.println("getStackTrace():");
//            System.out.println(exceptionObject.getStackTrace());
//            System.out.println("printStackTrace():");
//            exceptionObject.printStackTrace();
//        } catch (Exception genericExceptionObject){
//            System.out.println("Exception caught! (generic)");
//            genericExceptionObject.printStackTrace();
//        } finally {
//            //Finally - will always execute one way or the other
//            System.out.println("This is in the finally block");
//        }


        try {
            Integer  parsedInt =  Integer.valueOf("55");




        } catch (NumberFormatException exception){
            exception.printStackTrace();
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            System.out.println("Finally block reporting in!");
        }


    }

}
