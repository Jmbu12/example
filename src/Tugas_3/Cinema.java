package Tugas_3;

import Tugas_2.Buliding;

public class Cinema extends Buliding {
    int NumberOfChair;

    public Cinema (String Name, String Addres, String Floor, int NumberOfChair){
        super(Name, Addres, Floor);
        this.NumberOfChair = NumberOfChair;
    }

    @Override
    public void displayBuildInfo(){
        super.displayBuildInfo();
        System.out.print("Sum Chair : " + NumberOfChair);
        System.out.println("\n===================================");
    }
}
