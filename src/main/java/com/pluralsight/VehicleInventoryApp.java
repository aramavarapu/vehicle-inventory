package com.pluralsight;
import java.util.Scanner;
public class VehicleInventoryApp {
    public static void main(String[] args) {
        Vehicle vechicle1 = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Vehicle vechicle2 = new Vehicle(101121, "Honda Civic", "Blue", 3200, 11200);

        System.out.println(vechicle1);
        System.out.println(vechicle2);

        vechicle1.setPrice(300000);
        System.out.println(vechicle1);

    }
    

}
