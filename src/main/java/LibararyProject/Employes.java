package LibararyProject;

import javax.swing.*;
import java.util.Date;


public class Employes  {
    private String name;
    private String surname;
    private Date date;
    private  double salary;
    private  double experience;
    private boolean isRetried=false;

    public Employes(String name, String surname, Date date, double salary, double experience) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.salary = salary;
        this.experience = experience;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
       if (experience>=20){
           this.experience = experience;
          double salary1=this.salary+(this.salary/100)*30;
           System.out.println("you experience is more 15 years and get more salary 10%  your experience: "+experience+" your salary is:  "+salary1);

       }
       else {
           this.experience = experience;
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date=date;
        if (date.getYear() - date.getYear() >= 50) {
            isRetried = true;
            JOptionPane.showMessageDialog(null, "Your Happy Birthday and today you become retired!");
        }
    }

    public boolean isRetired() {
        return isRetried;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                ", experience=" + experience +
                ", isRetried=" + isRetried +
                '}';
    }

    public static void main(String[] args) {
        Employes employee1 = new Employes("Jane", "Bill", new Date(1970, 6, 8), 22000.0, 25.0);
        employee1.getExperience();
        System.out.println(employee1);
    }
}
