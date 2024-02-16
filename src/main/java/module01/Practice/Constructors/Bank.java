package module01.Practice.Constructors;

public class Bank {
    private String name;
    private String surname;
    private long salary;
    private int cardNum;
    public Bank(String name,String surname,int Cardnum,long salary){
        this.cardNum=cardNum;
        this.surname=surname;
        this.name=name;
        if (salary>0){
            this.salary=salary;
        }
        else {
            this.salary=0;
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public  String getName(){
        if (name!=null && name.length()>0){
            StringBuilder person1=new StringBuilder();
            person1.append(name.substring(0,2));
            for (int i = 0; i < name.length()-2; i++) {
                person1.append("*");
            }
            return person1.toString();
        }
        return " ";
    }
    public long getSalary(){
        return  salary;
    }
    public void setCardNum(int cardNum){
        this.cardNum=cardNum;
    }
    public String getCardNum(){
        String cardNumString = String.valueOf(cardNum);
        if (cardNumString != null && cardNumString.length() >= 3) {
            StringBuilder person1 = new StringBuilder();
            person1.append(cardNumString.substring(0, 3));
            for (int i = 0; i < cardNumString.length() - 3; i++) {
                person1.append("#");
            }
            return person1.toString();
        }
        return " ";
    }

    public void setSurname (String surname){
        this.surname=surname;
    }
    public String getSurname(){
        if (surname!=null && surname.length()>0){
            StringBuilder person2=new StringBuilder();
            person2.append(surname.substring(0,2));
            for (int i = 0; i < surname.length()-2; i++) {
                person2.append("*");
            }
            return person2.toString();
        }
        return " ";
    }
    public void  depo(long amount){
        salary+=amount;
    }
    public  void  withdraw(long draw){
        if (salary>0 && salary-draw>0){
            salary-=draw;
        }
    }

}
