package module01.Part02.Exception;

import java.io.IOException;

public class ExceptionExcamples {
    public static void main(String[] args) throws IOException  {
        fall(1);
        var e=new RuntimeException("sjshhs");
       throw e;
    }
    static void  fall(int distance)throws IOException{
        try {
            if (distance>10)
                throw new IOException();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}