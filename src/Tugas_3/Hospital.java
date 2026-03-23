package Tugas_3;

import Tugas_2.Building;

public class Hospital extends Building {
    int NumberOfBeds;

            public Hospital(String Name, String Addres, int Floor, int NumberOfBeds){
                super(Name, Addres, Floor);
                this.NumberOfBeds = NumberOfBeds;

            }
}
