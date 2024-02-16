package module01.Practice.Constructors;

public class Personal {
    private String name;
    private String surname;
    private String email;
    private long idCardNum;
    public  void setName(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public  String getSurname(){
        if (surname!=null && surname.length()>0){
            StringBuilder personinfo=new StringBuilder();
            personinfo.append(surname.substring(0,2));
            for (int i = 0; i < surname.length(); i++) {
                personinfo.append("*");
            }
            return personinfo.toString();
        }
        return "";

    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
       if (email!=null && email.length()>0){
           StringBuilder personinfo=new StringBuilder();
           personinfo.append(email.substring(0,3));
           for (int i = 0; i < email.length(); i++) {
               personinfo.append("*");
           }
           return personinfo.toString();
       }
        return "";
    }
    public void setIdCardNum(int idCardNum){
        this.idCardNum=idCardNum;
    }
    public String getIdCardNum(){
        String idCardString=String.valueOf(idCardNum);
   if (idCardString!=null && idCardString.length()>0){
       StringBuilder person=new StringBuilder();
       person.append(idCardString.substring(0,3));
       for (int i = 0; i < idCardString.length(); i++) {
           person.append("#");
       }
       return person.toString();
   }

        return " ";
    }
}
