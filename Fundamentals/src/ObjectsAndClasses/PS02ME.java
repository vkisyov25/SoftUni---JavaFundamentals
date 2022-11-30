package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS02ME {
    static class Car{
        String model;
        int engineSpeed;
        int enginePower;
        int cargoWeight;
        String cargoType;
        double tire1Pressure;
        int tire1Age;
        double tire2Pressure;
        int tire2Age;
        double tire3Pressure;
        int tire3Age;
        double tire4Pressure;
        int tire4Age;

        public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
            this.model = model;
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
            this.tire1Pressure = tire1Pressure;
            this.tire1Age = tire1Age;
            this.tire2Pressure = tire2Pressure;
            this.tire2Age = tire2Age;
            this.tire3Pressure = tire3Pressure;
            this.tire3Age = tire3Age;
            this.tire4Pressure = tire4Pressure;
            this.tire4Age = tire4Age;
        }

        public double getTire1Pressure() {
            return tire1Pressure;
        }

        public double getTire2Pressure() {
            return tire2Pressure;
        }

        public double getTire3Pressure() {
            return tire3Pressure;
        }

        public double getTire4Pressure() {
            return tire4Pressure;
        }

        public int getEnginePower() {
            return enginePower;
        }

        public String getCargoType() {
            return cargoType;
        }

        public String getModel() {
            return model;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();

        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");
            Car c = new Car(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],Double.parseDouble(arr[5]),Integer.parseInt(arr[6]),Double.parseDouble(arr[7]),Integer.parseInt(arr[8]),Double.parseDouble(arr[9]),Integer.parseInt(arr[10]),Double.parseDouble(arr[11]),Integer.parseInt(arr[12]));
            carList.add(c);

        }
        String command = scanner.nextLine();

        for (int j=0; j<carList.size(); j++){
            if(carList.get(j).getCargoType().equals("fragile") && command.equals("fragile")){
                if(carList.get(j).getTire1Pressure()<1 || carList.get(j).getTire2Pressure()<1 || carList.get(j).getTire3Pressure()<1 ||carList.get(j).getTire4Pressure()<1){
                    System.out.println(carList.get(j).getModel());
                }
            }
            if (carList.get(j).getCargoType().equals("flamable") && command.equals("flamable")){
                if(carList.get(j).getEnginePower()>250){
                    System.out.println(carList.get(j).getModel());
                }
            }
        }
    }
}
