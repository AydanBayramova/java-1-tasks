package module01.Part02.filesWriter;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

public class FilesApp {
    private static  final String RESOURCES_FOLDER="src\\main\\java\\module01\\Part02\\filesWriter\\resources";

    public static void main(String[] args) {
       File file1= new File(RESOURCES_FOLDER+"hello.txt");
      try {
          FileWriter fileWriter=new FileWriter(file1);
         BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
          fileWriter.write("Hello ,World");
          bufferedWriter.close();
          fileWriter.close();

      }catch (IOException e){
          e.printStackTrace();
      }
  try {
      FileReader fileReader=new FileReader(file1);
      int c;
      StringBuilder stringBuilder = new StringBuilder();
      while ((c=fileReader.read())!=-1){
          stringBuilder.append((char)c);

      }
      System.out.println(stringBuilder);

  }catch (FileNotFoundException e){
      System.out.println("File not found");
      e.printStackTrace();
  }catch (IOException e){
      System.out.println("File couldn't read");
      e.printStackTrace();
  }

    }



}
