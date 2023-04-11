package fileIO;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) throws IOException {
        //Path; Paths; File; Files

        //"absolute" vs "relative" path [do you need step-by-step directions from A to B, or do you need directions from current working directory/context root/root folder to B]


        //java.io or java.nio libraries
        //'Path' interface lets us defines a Path-type object representing a file path to a file
        //Combines with 'Paths' class < Paths let us obtain objects implementing 'Path' interface
        Path myFirstPathObject = Paths.get("exampleFile.txt");

        System.out.println(Files.exists(myFirstPathObject));

        Path fileToReadMe = Paths.get("./README.md");

        System.out.println("Files.exists(fileToReadMe) = " + Files.exists(fileToReadMe));

        Path ourLectureClass = Paths.get("src/fileIO/FileIOLecture.java");

        System.out.println("Files.exists(ourLectureClass) = " + Files.exists(ourLectureClass));
        //'File' class lets us create File-type objects representing a file
        //"Files" class has static methods to manipulate / work with Files

        //Examples:
        //Path myPath = Paths.get(String filename); Paths.get(String directory, String filename); Paths.get(String parentDir, String childDir, String filename) ['Java, can you go get the file path to this file and return it as a Path object?']

        String newDirectory = "oneLittleBabyDirectory";
        String newDirectories = "dataExperiment/Hi/Azeban/MoreDirectories";

//        Files.createDirectory(Paths.get(newDirectory)); //First experiment: Just passing a path object of "/data"

//        Files.createDirectories(Path.of(newDirectories));

        //Okay - we saw the difference between those two methods, let's make a data folder in the lecture area

        //Path Files.createDirectories(Path pathVariable); Path Files.creatDirectory(Path pathVariable) ['Java, can you create this or these directories down this path?']

        String myNewDirectory = "src/fileIO/data";

        Path pathToNewDirectory = Paths.get(myNewDirectory);


        //Files.exists(filePath) / Files.notExists(filePath) ['Java, can you tell me true/false something exists down this path?']
        if(Files.notExists(pathToNewDirectory)) {
            //We will hit checked exceptions when creating files/directories - we cannot create something that is already there

            //We can use .exists or .notExists to make a "path" to create if needed ("Java, go see if this exists - if it doesn't, can you make it?")
            Files.createDirectory(pathToNewDirectory);
        }

        //Path createdFile = Files.createFile(Path pathVariable) ['Java, can you go create a file at the end of this path?']

        String myDataTextFile = "data.txt";
        Path directoryAndFile = Paths.get(myNewDirectory, myDataTextFile);

        System.out.println("What does this new combined path look like?");
        System.out.println("directoryAndFile = " + directoryAndFile);

//        Files.createFile(directoryAndFile);

        //Pt 2: Working with the file itself
        //Example: Files.write(Path pathVariable, List<String> listOfStrings[, StandardOpenOption chooseAnOption]) ['Java, can you (over)write into this file at this path these strings with this as an option (if I specified an option)?]

//        This method also provides a convenient way to create a fixed-size list initialized to contain several elements:
// List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        List<String> myData = Arrays.asList("username:davidBanker", "100 main ave, 12345", "enjoys food");

//        System.out.println(myData);

        Files.write(directoryAndFile, myData);

        //Yikes - when I updated the 'myData' list and ran the code again, it REPLACED all of my information

        //Example: StandardOpenOption.APPEND (added to end of Files.write as option) ['Java, when you write to this file, can you add things to the end of it instead of overwriting the contents?']

        myData = Arrays.asList("username:kencool", "8646 sunny goats 78250", "also eats food");

        Files.write(directoryAndFile, myData, StandardOpenOption.APPEND);

        Files.write(directoryAndFile, Arrays.asList("username:davidRen", "555 disco drive", "can eat food if needed"), StandardOpenOption.APPEND);


        //Example: Files.readAllLines(Path pathVariable) ['Java, can you go read that file and transform what you find into this List of. . Strings? Ints? Etc.']

        System.out.println("Here's all the information in our file");
        System.out.println(Files.readAllLines(directoryAndFile));

        List<String> currentFileInfo = Files.readAllLines(directoryAndFile);

        for (String oneLine : currentFileInfo) {
//            System.out.println("Here's something from our file:");

            System.out.printf("---- %n %s %n",oneLine);
        }

//        How could we go about retrieving something specific from each one? Like only the usernames or only the addresses

        //What works well:
        // contactName | contactNumber
        //oneLine.split(" | ") array of: array[0]=contactName; array[1]=contactNumber


    }
}
