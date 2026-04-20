package main;

import Tugas_2.Buliding;
import Tugas_3.Apartemen;
import Tugas_3.Cinema;
import Tugas_3.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Buliding buliding = null;
        List<Buliding> bulidings = new ArrayList<>();
        while (true) {
            System.out.println("\n=========================================");
            System.out.println("Welcome to Smart City Management System : ");
            System.out.println("1. Add New Building.");
            System.out.println("2. View All Building");
            System.out.println("3. Exit.");
            System.out.println("=========================================");
            System.out.print("Pilih menu :  ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n=========================================");
                    System.out.print("Name Building : ");
                    String Name = input.nextLine();

                    System.out.print("Addres : ");
                    String Addres = input.nextLine();

                    System.out.print("Floor : ");
                    String Floor = input.nextLine();

                    System.out.println("====================================");
                    System.out.println("Select type : ");
                    System.out.println("1. Hospital");
                    System.out.println("2. Apartemen");
                    System.out.println("3. Cinema");
                    System.out.println("====================================");
                    System.out.print("Pilih : ");
                    int opsi = input.nextInt();
                    input.nextLine();


                    switch (opsi){
                        case 1:
                            System.out.print("Sum Bed : ");
                            int beds = input.nextInt();
                            input.nextLine();
                            buliding = new Hospital(Name, Addres, Floor, beds);

                            break;

                        case 2:
                            System.out.print("Sum Room : ");
                            int room = input.nextInt();
                            input.nextLine();
                            buliding = new Apartemen(Name, Addres, Floor, room);

                            break;

                        case 3:
                            System.out.print("Sum Chair : ");
                            int chair = input.nextInt();
                            input.nextLine();
                            buliding = new Cinema(Name, Addres, Floor, chair);

                            break;

                        default:
                            System.out.println("Tidak ada di Pilihan : ");

                            break;



                    }

                    bulidings.add(buliding);


                    buliding = new Buliding(Name, Addres, Floor);

                    System.out.println("\n=========================================");
                    System.out.println("Building data");
                    System.out.println("Name Building: " + Name);
                    System.out.println("Adrees: " + Addres);
                    System.out.println("Floor: " + Floor);
                    System.out.println("sucsess to add");

                    break;

                case 2:
                    if (bulidings.isEmpty()){
                        System.out.println("=================================");
                        System.out.println("TIDAK ADA DATA");
                        System.out.println("=================================");
                    } else {
                        for (Buliding b : bulidings){
                            b.displayBuildInfo();
                        }

                    }
                    break;

                case 3:
                    System.out.println("the end");
                    return;

                default:
                    System.out.println("invalid option");

            }
        }
    }
}