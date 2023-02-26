package contacts;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;


public class ContactTest {
    public static void readFileAndOutput (Path pathToFile){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(pathToFile);
        } catch (IOException iox){
            iox.printStackTrace();
        }
        for (String line: lines){
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//
//        Path pathToThisFile = Paths.get("src/file_io", "FileIOLecture.java");
//        System.out.println(pathToThisFile);

//        Path dataDir = Paths.get("src/data");
//        try {
//            if (Files.notExists(dataDir)){
//                Files.createDirectories(dataDir);
//            } else {
//                System.out.println("That directory already exists");
//            }
//        } catch (IOException iox){
//            iox.printStackTrace();
//        }

        Path pathToMyList = Paths.get("src/data/list.txt");
//        try {
//            if (Files.notExists(pathToMyList)){
//                Files.createFile(pathToMyList);
//            } else {
//                System.out.println("That file already exists!");
//            }
//        } catch (IOException iox){
//            System.out.println("Couldn't create the file!");
//            iox.printStackTrace();
//        }

        List<String> spices = Arrays.asList("cardamom", "ginger", "saffron", "nutmeg", "black pepper", "salt");

        Path pathToOtherFile = Paths.get("src/data/doesntExist.txt");

//        try {
//            Files.write(pathToOtherFile, spices);
//        } catch (IOException iox){
//            iox.printStackTrace();
//        }

//        List<String> currentList = new ArrayList<>();
//        try {
//            currentList = Files.readAllLines(pathToMyList);
//        } catch (IOException iox){
//            iox.printStackTrace();
//        }
//
//        for (String spice : currentList){
//            System.out.println(spice);
//        }
//
//        readFileAndOutput(pathToMyList);
//        System.out.println("------------");
//
        try {
            Files.writeString(pathToMyList, "cumin\n", StandardOpenOption.APPEND);
        } catch (IOException iox){
            iox.printStackTrace();
        }
//
//        readFileAndOutput(pathToMyList);
//
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToOtherFile);
        } catch (IOException iox){
            iox.printStackTrace();
        }
        Iterator<String> listIterator = currentList.iterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            if (item.equals("ginger")){
                listIterator.remove();
            }
        }
//        currentList.removeIf(item -> item.equals("ginger"));
        try {
            Files.write(pathToMyList, currentList);
        } catch (IOException iox) {
            iox.printStackTrace();
        }
        System.out.println("-----------");
        readFileAndOutput(pathToOtherFile);
    }
}
