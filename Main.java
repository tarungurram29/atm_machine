package ATM_MACHINE_OOPS;

import java.util.Scanner;

class ATM{
    Scanner sc= new Scanner(System.in);
    public int Pin;
    public float Balance=0;

    public ATM(){
        System.out.println("Enter your pin :");
        Pin = sc.nextInt();
        if(Pin==1234){
            menu();
        } else {
            System.out.println("Enter valid pin");
            new ATM();
        }
    }
    public void menu(){
        System.out.println("Enter 1 for SavingAcc");
        System.out.println("Enter 2 for CurrentAcc");
        int option = sc.nextInt();
        if(option == 1){
            menu1();
        } else if (option == 2) {
            menu1();
        } else{
            System.out.println("Enter valid option");
            menu();
        }
    }
    public void menu1(){
        System.out.println("Enter 1 for CheckBalance");
        System.out.println("Enter 2 for DepositMoney");
        System.out.println("Enter 3 for WithDrawMoney");
        System.out.println("Enter 4 for Exit");
        System.out.println("Enter your choice : ");
        int option1 = sc.nextInt();

        if(option1 == 1){
            chkbalance();
        } else if (option1 == 2) {
            deposit();
        } else if (option1 == 3) {
            withdraw();
        } else if(option1 == 4){
            exit();
        } else{
            System.out.println("Enter valid choice");
        }
    }

    public void chkbalance(){
        System.out.println("Total Balance = "+Balance);
        menu1();
    }
    public void deposit(){
        System.out.println("Enter Amount to deposit :");
        float depositamt = sc.nextFloat();
        Balance = Balance + depositamt;
        System.out.println("Deposit Done!!!");
        menu1();
    }
    public void withdraw() {
        System.out.println("Enter Amount to withdraw :");
        float withdrawamt = sc.nextFloat();
        if (withdrawamt > Balance) {
            System.out.println("Withdraw Cancel!!!");
            System.out.println("Your actual balance=" + Balance);
            System.out.println("And withdraw Amount=" + withdrawamt);
            menu1();
        }
        Balance = Balance - withdrawamt;
        System.out.println("Total withdraw = " + withdrawamt);
        System.out.println("After withdraw Balance = " + Balance);
        System.out.println("Withdraw Done!!!");
        menu1();
    }
    public void exit(){
        new ATM();
    }
}

public class Main{
    public static void main(String[] args) {
        new ATM();
    }
}