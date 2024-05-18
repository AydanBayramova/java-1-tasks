package FinalExam.oop;

public class fam1 extends fam implements fam2{
    public fam1(String name) {
        super(name);
    }

    @Override
    public int num() {
        return 0;
    }

    @Override
    public String surname() {
        return null;
    }

    @Override
    public void getinfo() {
        fam2.super.getinfo();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
