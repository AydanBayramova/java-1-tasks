package module01.Practice;

import java.time.LocalDate;
import java.time.ZoneId;

public  class immutablete {
    public static void main(String[] args) {
       learn p1=new learn("Aydan",20,new double[]{100,99,98});
        System.out.println(p1.getAge());
      //  p1.getAge()=22;
        p1.getGrade()[2]=96;
        System.out.println(p1);
        p1.getName().toCharArray()[0]='a';
        System.out.println(LocalDate.now());
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalDate.ofEpochDay(40));
        System.out.println(LocalDate.now(ZoneId.of(ZoneId.SHORT_IDS.get("NET"))));
        System.out.println(LocalDate.now().plusDays(-2));
    }
}
