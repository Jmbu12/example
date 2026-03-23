package Tugas_3;

import Tugas_2.Building;

public class Apartemen extends Building{
    int NumberOfRoom;

    public Apartemen (String Name, String Addres, int Floor, int NumberOfRoom){
        super(Name, Addres, Floor);
        this.NumberOfRoom = NumberOfRoom;
    }
}
