package Tugas_3;

import Tugas_2.Buliding;

public class Apartemen extends Buliding {
    int NumberOfRoom;

    public Apartemen (String Name, String Addres, String Floor, int NumberOfRoom){
        super(Name, Addres, Floor);
        this.NumberOfRoom = NumberOfRoom;
    }

    @Override
    public void displayBuildInfo(){
        super.displayBuildInfo();
        System.out.print("Sum Room : " + NumberOfRoom);
        System.out.println("\n===================================");
    }
}
