import java.util.Scanner;

public class Tugas {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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
                    System.out.print("building : ");
                    String building = input.nextLine();

                    System.out.print("Addres : ");
                    String Addres = input.nextLine();

                    System.out.print("Floor : ");
                    String Floor = input.nextLine();

                    System.out.println("\n=========================================");
                    System.out.println("Building data");
                    System.out.println("Building: " + building);
                    System.out.println("Adrees: " + Addres);
                    System.out.println("Floor: " + Floor);
                    System.out.println("=========================================");
                    System.out.println("sucsess to add");

                    break;

                case 2:
                    System.out.println("coming soon");
                    break;

                case 3:
                    System.out.println("the end");
                    break;

                default:
                    System.out.println("invalid option");
            }
        }
    }
}