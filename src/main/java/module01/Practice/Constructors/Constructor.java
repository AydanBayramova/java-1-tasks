package module01.Practice.Constructors;

public class Constructor {
  int m_x,m_n;
  Constructor(int a, int b){
      m_x=a;
      m_n=b;
  }
  Constructor(){
      System.out.println("hi");
  }
  public int getM_x(){
      return  m_x;
  }
  public  int getM_n(){
      return m_n;
  }

}
