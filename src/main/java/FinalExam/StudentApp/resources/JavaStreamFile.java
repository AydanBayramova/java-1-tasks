package FinalExam.StudentApp.resources;



import java.io.*;

public class JavaStreamFile {
    public static final String RESOURCE_FOLDER = "C:\\Users\\aydan\\IdeaProjects\\java-course-turing-1-classes\\src\\main\\java\\FinalExam\\StudentApp\\resources";
    public static final String HELLO_FILE = RESOURCE_FOLDER + "hello2.txt";
    public  static  final  String HELLO_STREAM_FILE=RESOURCE_FOLDER+"stream.ser";

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(HELLO_FILE));
             BufferedReader br = new BufferedReader(new FileReader(HELLO_FILE)))
        {
         bw.write("hello");
         bw.close();
         br.lines().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace(); // Consider more specific exception handling
        }
        try (FileOutputStream fos=new FileOutputStream(HELLO_STREAM_FILE);
        FileInputStream fis=new FileInputStream(HELLO_STREAM_FILE))
        {
            fos.write("hllo fos".getBytes());
            fos.close();
            System.out.println(new String(fis.readAllBytes()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
