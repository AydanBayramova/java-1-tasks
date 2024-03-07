package module01.interfacesTasks;

public class SavingAccount implements Account {
    private double interest;
    private  double interestRating;

    public SavingAccount(double interest, double interestRating) {
        this.interest = interest;
        this.interestRating = interestRating;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterestRating() {
        return interestRating;
    }

    public void setInterestRating(double interestRating) {
        this.interestRating = interestRating;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withDraw(double amount) {

    }

    @Override
    public void calculate() {

    }

    @Override
    public void viewDeposit() {

    }
}
