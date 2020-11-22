package Assignment5;

public class Person {
    private String fname;
    private String lname;
    private String id;

    Person(){

    }
    Person(String f, String l,String id){
        fname= f;
        lname=l;
        this.id=id;
    }
    public String getFname(){ return fname;}
    public String getLname(){return lname;}
    public String getId(){return id;}

    public void setId(String i) {
        id = i;
    }

    public void setLname(String l) {
        lname = l;
    }

    public void setFname(String f) {
        fname = f;
    }
public String toString(){
        String s;
        s=lname+","+fname;
        return s;
}



}
class Student extends Person {
    public int credit;
    private String major;
    private char status;
    public String StudentTime;
    public int Tuition;

    Student() {
    }

    Student(int c, String m, char s, String st, int t) {
        credit = c;
        major = m;
        status = s;
        StudentTime=st;
        Tuition=t;
    }

    public int getCredit() {
        return credit;
    }

    public String getMajor() {
        return major;
    }

    public char getStatus() {
        return status;
    }

    public int getTuition() {
        return Tuition;
    }
    public String getStudentTime(){
        return StudentTime;
    }

    public void setCredit(int c) {
        credit = c;
    }

    public void setMajor(String m) {
        major = m;
    }

    public void setStatus(char s) {
        status = s;
    }
    boolean isRes() {
        if (status == 'R') {
            return true;
        } else {
            return false;
        }
    }
    boolean nonRes() {
        if (status == 'N') {
            return true;
        } else {
            return false;
        }
    }
    public int calcTuition() {
        int Tuition = 0;
        if (isRes() == true) {


            if (StudentTime == "full") {
                Tuition = 6930;
            }
            if (StudentTime == "part") {
                Tuition = (305 * credit);
            }
        }

        if (nonRes() == true) {
            if (StudentTime == "full") {
                Tuition = (620 * credit);
            } else if (StudentTime == "part") {
                Tuition = (620 * credit);
            }
        }
        return Tuition;
    }

    public String toString(){
        String s;
        s = super.toString() + " Credits: " + getCredit() + "\tMajor: " + getMajor() +
                "Status: " + getStatus();
        return s;
    }


}
class Loan {
    private double annualInterestRate;
    private double loanAmount;
    private int numofYears;

    public Loan() {
        annualInterestRate = 2.5;
        loanAmount = 1000;
        numofYears = 1;
    }

    public Loan(double aIntRate, double lAmt, int numYears) {
        numYears = numofYears;
        lAmt = loanAmount;
        annualInterestRate = aIntRate;

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumofYears() {
        return numofYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }


    public double getTotalPayment() {
        double pay;
        double t1;
        t1 = (loanAmount * (1 + annualInterestRate / 12));
        //pay = Math.pow(t1, numofYears*12);
        return t1;
    }

    public double getMonthlyPayment() {
        double pay;
        double t1;
        t1 = loanAmount * (1 + annualInterestRate / 12);
        //pay = Math.pow(t1, numofYears * 12);
        return (t1 / numofYears);
        //return (pay/ numofYears * 12);
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumofYears(int numofYears) {
        this.numofYears = numofYears;
    }
}



