package com.pluralsight;
import java.util.Scanner;
public class VehicleInventoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        int command = 0;

        while (command != 5) {
            System.out.println();
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Quit");
            System.out.println("Enter a command: ");

            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1 -> listAllVehicles(vehicles);
                case 2 -> findVehiclesByMakeModel(vehicles, scanner);
                case 3 -> findVechiclesByPriceRange(vehicles, scanner);
                case 4 -> findVechiclesByColor(vehicles, scanner);
                case 5 -> System.out.println("Goodbye!");
                case 6 -> System.out.println("Invalid Command.");
            }
        }


    }

    public static void listAllVehicles(Vehicle[] vehicles) {
        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle != null) {
                System.out.println(currentVehicle);
            }
        }
    }

    public static void findVehiclesByMakeModel(Vehicle[] vehicles, Scanner scanner) {
        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        boolean found = false;
        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle != null && currentVehicle.getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.println(currentVehicle);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found.");
        }
    }

    public static void findVechiclesByColor(Vehicle[] vehicles, Scanner scanner) {
        System.out.println("Enter the color: ");
        String color = scanner.nextLine();

        boolean found = false;
        for (Vehicle currentVehicle : vehicles)  {
            if (currentVehicle != null && currentVehicle.getColor().equalsIgnoreCase(color))  {
                System.out.println(currentVehicle);
                found = true;
            }
        }
        if (!found)  {
            System.out.println("No vehicles found.");
        }
    }

    public static void findVechiclesByPriceRange(Vehicle[] vehicles, Scanner scanner) {
        System.out.print("Enter the minimum price: ");
        double min = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the maximum price: ");
        double max = scanner.nextDouble();
        scanner.nextLine();

        boolean found = false;
        for (Vehicle currentVehicle : vehicles) {
            if (currentVehicle != null && currentVehicle.getPrice() >= min && currentVehicle.getPrice() <= max) {
                System.out.println(currentVehicle);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found.");
        }
    }


    

}
