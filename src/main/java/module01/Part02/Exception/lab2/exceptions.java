package module01.Part02.Exception.lab2;

public class exceptions {
    public static void main(String[] args){
      try {
          throwException();
      }
     catch (Exception e){
          System.out.println("BASINI BURAXXXXX!!!");
      }
        finally {
          System.out.println("AKULALAR HEMISE OYAQDIRRRR");
      }
    }

    public  static void throwException() throws  Exception{
        try {
            throw  new ArithmeticException("Heyat zordur qaqaaa!");
        }
        finally {
            System.out.println("BU NE HEYATDI EE,BU NEDI EE");
        }
    }
}
