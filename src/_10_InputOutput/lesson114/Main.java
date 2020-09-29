package _10_InputOutput.lesson114;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //Path, Paths, File, Files
        String pathToDir = "C:\\data";
        Path p = Paths.get(pathToDir);
        //check if file of dir exists
        System.out.println(Files.exists(p));
        //create directory
        try {
            Files.createDirectories(p);
        } catch (IOException e) {
            System.out.println("Cound not create dir");
        }
        //second way to create dir
        File f2 = new File(pathToDir+2);
        f2.mkdir();
        //f2.mkdirs();

        //create file as object
        File f = new File("C:/data/input.txt");
        try {
            //create file on disk
            f.createNewFile();
        }catch (IOException e){
            System.out.println("Could not create file");
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
            pw.print("lesson 114 input output");
        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }finally {
            pw.flush();
            pw.close();
        }

        //check fie length
        System.out.println(f.length());

        f.renameTo(new File("C:/data/inputNew.txt"));

        f.renameTo(new File("C:/data2/input.txt"));



    }
}
