package FinalExam.StudentApp;

import java.io.*;

public class FileApp  {
    private static final String RESOURCE_FOLDER="C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\FinalExam\\StudentApp\\resources";

    public static void main(String[] args) {
        File file = new File(RESOURCE_FOLDER+"hello.txt");
     try {
         FileWriter fileWriter = new FileWriter(file);
         fileWriter.write("Hello");
         fileWriter.close();
     }catch (IOException e){
         e.printStackTrace();
     }

  try {
      FileReader fileReader = new FileReader(file);
      int c;
      StringBuilder stringBuilder = new StringBuilder();
      while ((c=fileReader.read())!=-1){
          stringBuilder.append((char) c);
     }
      System.out.println(stringBuilder);
    }catch (IOException e){
      e.printStackTrace();

  }

    }}

