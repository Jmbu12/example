package Tugas_3;

import Tugas_2.Buliding;

public class Hospital extends Buliding {
    int NumberOfBeds;

            public Hospital(String Name, String Addres, String Floor, int NumberOfBeds){
                super(Name, Addres, Floor);
                this.NumberOfBeds = NumberOfBeds;

            }

            @Override
            public void displayBuildInfo(){
                super.displayBuildInfo();
                System.out.print("Sum bed : " + NumberOfBeds);
                System.out.println("\n===================================");

            }

}
