package Tugas_3;

import Tugas_2.Building;

public class Cinema extends Building {
    int NumberOfChair;

    public Cinema (String Name, String Addres, int Floor, int NumberOfChair){
        super(Name, Addres, Floor);
        this.NumberOfChair = NumberOfChair;
    }
}
