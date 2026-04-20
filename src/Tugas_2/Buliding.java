package Tugas_2;

public class Buliding {
    String building;
    String Addres;
    String Floor;

    public Buliding(String building, String Addres, String Floor){
        this.building = building;
        this.Addres = Addres;
        this.Floor = Floor;
    }

    public  void displayBuildInfo() {
        System.out.println("==================================");
        System.out.println("------ Building Information ------");
        System.out.println("Name of the building : " + building);
        System.out.println("Addres of the building : " + Addres);
        System.out.println("Number Floor of the building : " + Floor);
    }


}
