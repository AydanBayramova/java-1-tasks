package FinalExam.StudentApp;

import java.io.*;

public class BufferedWriter {
    private static final String RESOURCE_FOLDER="C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\FinalExam\\StudentApp\\resources";

    public static void main(String[] args) {
        File file = new File(RESOURCE_FOLDER+"hello1.txt");
        try {
            FileWriter fileWriter1 = new FileWriter(file);
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter1);
          bufferedWriter.write("hhhhiiiii");
             bufferedWriter.close();
            fileWriter1.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String s="";
            while((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();

        }

    }
}
