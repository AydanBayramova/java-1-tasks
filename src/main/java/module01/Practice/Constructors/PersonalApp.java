package module01.Practice.Constructors;

public class PersonalApp {
    public static void main(String[] args) {
        Personal person1=new Personal();
        person1.setName("aydan");
        person1.setSurname("bayramova");
        person1.setEmail("bayramoffaaydan1@gmail.com");
        person1.setIdCardNum(213183);
        System.out.println(person1.getName()+" "+ person1.getSurname()+" "+person1.getEmail()+" "+person1.getIdCardNum());
    }
}
