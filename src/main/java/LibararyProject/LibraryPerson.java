package LibararyProject;

import java.util.Date;

public abstract class LibraryPerson {
    private String name;
   private String surname;
    private Date date;

    @Override
    public String toString() {
        return "LibraryPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                '}';
    }

}
