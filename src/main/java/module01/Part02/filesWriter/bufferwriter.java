package module01.Part02.filesWriter;

import java.io.*;

public class bufferwriter {
    private static  final String RESOURCES_FOLDER="src\\main\\java\\module01\\Part02\\filesWriter\\resources";

    public static void main(String[] args) {
        File file2 = new File(RESOURCES_FOLDER + "hello2.txt");
        try {
            FileWriter fileWriter = new FileWriter(file2,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            fileWriter.write("Hello ,World2");
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fr=new FileReader(file2);
         BufferedReader bufferedReader=new BufferedReader(fr);
          String line="a ";
          while ((line= bufferedReader.readLine())!=null){
              System.out.println(line);
          }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("File couldn't read");
            e.printStackTrace();
        }
    }
}
