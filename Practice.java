import java.util.Scanner;

class Employeee{
    String id;
    String name;
    String address;
    Scanner sc = new Scanner(System.in);

    void getData(){
        System.out.print("Enter Id: ");
        this.id = sc.nextLine();
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Address: ");
        this.address = sc.nextLine();
    }
    void showData(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
    }
}

public class Practice {
    public static void main(String[] args) {
        Employeee e = new Employeee();
        e.getData();
        e.showData();
    }
}