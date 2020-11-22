package Assignment5;
import java.util.Scanner;
public class StudentLoan {
    public static void main(String[] args) {
        int initialPayoff;

        Scanner in = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("Enter your first and last name: ");
        stu.setFname(in.nextLine());
        stu.setLname(in.nextLine());
        System.out.println("Enter your id #: ");
        stu.setId(in.next());
        System.out.println("Enter your major: ");
        stu.setMajor(in.next());
        System.out.println("Enter 'R' if you are a resident of NYC:\t Enter 'N' if you are not a resident of NYC:");
        stu.setStatus(in.next().charAt(0));
        if (stu.isRes() == true){
            System.out.println("You are a Resident.\t Enter the amount of credits you are taking: ");
            stu.setCredit(in.nextInt());

            if (stu.credit >= 12){
                System.out.println("You are a full-time student\n");
              stu.StudentTime="full";
            }
            else{
                System.out.println("You are a part-time student\n");
                stu.StudentTime="part";
            }

        }
        if (stu.nonRes() == true){
            System.out.println("You are a not a Resident.\t Enter the amount of credits you are taking: ");
            stu.setCredit(in.nextInt());

            if (stu.credit >= 12){
                System.out.println("You are a full-time student\n");
                stu.StudentTime="full";
            }
            else{
                System.out.println("You are a part-time student\n");
                stu.StudentTime="part";
            }

        }

        System.out.println(stu.getFname()+","+" you currently owe: "+stu.calcTuition()+"\n Enter the amount you would like to pay off: ");
        initialPayoff = in.nextInt();
        //int Tuition = stu.getTuition();
        int remainingBalance= (stu.calcTuition() - initialPayoff);
        System.out.println("Your current remaining balance due is: "+remainingBalance);
        if (remainingBalance > 0){
            Loan lo = new Loan();
            lo.setLoanAmount(remainingBalance);
            System.out.println("You will need a loan to pay off the remaining balance.\n Enter the number of years you were given to pay off this loan:  ");
            lo.setNumofYears(in.nextInt());
            System.out.println("Enter the annual interest rate of loan you received: ");
            lo.setAnnualInterestRate(in.nextDouble());
            System.out.println("You owe a monthly payment of: "+lo.getMonthlyPayment()+"\n In total, you owe: "+lo.getTotalPayment()+"\n\n"+stu.toString());

        }
        else{
            System.out.println(stu.getFname()+" "+stu.getLname()+", You have completely paid off your tuition. "+"\n\n"+stu.toString());
        }




    }
}