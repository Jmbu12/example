package Tugas_2;

public class Building {
    String building;
    String Addres;
    int Floor;

    public Building(String building, String Addres, int Floor){
        this.building = building;
        this.Addres = Addres;
        this.Floor = Floor;

        displayBuildInfo();

        System.out.println("==============================");
        System.out.println("Building Added Succesfully");
    }

    private void displayBuildInfo() {
        System.out.println("==================================");
        System.out.println("------ Building Information ------");
        System.out.println("Name of the building : " + building);
        System.out.println("Addres of the building : " + Addres);
        System.out.println("Number Floor of the building : " + Floor);
        System.out.println("===================================");
    }

    String getbuilding(){
        return this.building;
    }
    String getAddres(){
        return this.Addres;
    }
    int getNumberFloor(){
        return this.Floor;
    }
}
