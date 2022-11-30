package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS006 {
    static class Vehicle {
        String type;
        String model;
        String color;
        String horsePower;

        public Vehicle(String type, String model, String color, String horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public String getHorsePower() {
            return horsePower;
        }

        public void setType(String type) {
            this.type = type;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] arr = command.split(" ");
            Vehicle v = new Vehicle(arr[0],arr[1],arr[2],arr[3]);
            if(v.getType().equals("car")){
                v.setType("Car");
            } else if (v.getType().equals("truck")) {
                v.setType("Truck");
            }
            vehicleList.add(v);

            command = scanner.nextLine();
        }
        String model = scanner.nextLine();

        printedModel(scanner, vehicleList, model);

        averageHorsePower(vehicleList);
    }

    private static void averageHorsePower(List<Vehicle> vehicleList) {
        double carHorse =0;
        double truckHorse=0;
        double carCount =0;
        double truckCount=0;
        for (int j = 0; j< vehicleList.size(); j++){
            if(vehicleList.get(j).getType().equals("Car")){
                carCount++;
                carHorse += Double.parseDouble(vehicleList.get(j).getHorsePower());
            }else {
                truckCount++;
                truckHorse += Double.parseDouble(vehicleList.get(j).getHorsePower());
            }
        }
        double avgCar = carHorse/carCount;
        double avgTruck = truckHorse/truckCount;
        if(carCount==0){
            avgCar=0.00;
        } else if (truckCount==0) {
            avgTruck=0.00;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",avgCar);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",avgTruck);
    }

    private static void printedModel(Scanner scanner, List<Vehicle> vehicleList, String model) {
        while(!model.equals("Close the Catalogue")){

            for (int i = 0; i< vehicleList.size(); i++){
                if(model.equals(vehicleList.get(i).getModel())){
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s%n", vehicleList.get(i).getType(), vehicleList.get(i).getModel(), vehicleList.get(i).getColor(), vehicleList.get(i).getHorsePower());
                }
            }

            model = scanner.nextLine();
        }
    }
}
