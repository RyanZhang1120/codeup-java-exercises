package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PoemTextCreate {

    public static void main(String[] args) throws IOException {

        //I would like to set up a file to write some poems in - can you help?
        //I'd like for it to be in: [workingDirectory]/src/fileIO/poem/

        //And I'd like for it to be titled springPoems.txt

        //How can we set up the directories and that particular file?

        //Name of the directory itself
        String myPoemDirectory = "src/fileIO/poem";

        //Path to the directory
        //Path.of Paths.get
        Path myPathToPoemDirectory = Path.of(myPoemDirectory);

        System.out.println("myPathToPoemDirectory = " + myPathToPoemDirectory);
        //Create directory

        if(Files.notExists(myPathToPoemDirectory)){
            Files.createDirectory(myPathToPoemDirectory);
        }

        //name of the file itself
        String rosesAreRedPoem = "springPoems.txt";

        Path directoryAndFile = Path.of(myPoemDirectory, rosesAreRedPoem);

        //Path to the file combined with directory
        System.out.println("Is our combined file path okay?");
        System.out.println("directoryAndFile = " + directoryAndFile);

        //Create file
        if(Files.notExists(directoryAndFile)){
            Files.createFile(directoryAndFile);
        }




    }

}
