package review;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArr = scanner.nextLine().split(" ");
        String command = textArr[0];

        Map<String, List<Double>> vensty = new LinkedHashMap<>();
        List<Double> commandList = new ArrayList<>();

        while (!command.equals("buy")){

            double price = Double.parseDouble(textArr[1]);
            int quantity = Integer.parseInt(textArr[2]);

            if(vensty.get(command)==null){
                commandList = new ArrayList<>();
                commandList.add(price);
                commandList.add((double) quantity);
            }else {
                //commandList.set(0,price);
                //Double aDouble = vensty.get(command).get(1);
                //commandList.set(1,quantity+vensty.get(command).get(1));

                commandList.add(price);
                commandList.add(quantity+vensty.get(command).get(1));
            }


            vensty.put(command,commandList);


            textArr = scanner.nextLine().split(" ");
            command = textArr[0];
            commandList = new ArrayList<>();
        }

        for (Map.Entry<String, List<Double>> entry : vensty.entrySet()) {

            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue().get(0)*entry.getValue().get(1));
        }

    }
}
