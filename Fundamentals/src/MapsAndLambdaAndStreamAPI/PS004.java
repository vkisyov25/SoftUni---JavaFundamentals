package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<Double>> product = new LinkedHashMap<>();


        //double sum = 0.0;

        double price = 0.0;
        double quantity = 0.0;

        while (!command.equals("buy")){
            List<Double> list =new ArrayList<>();
            String[] productInfo = command.split(" ");
            String nameProduct = productInfo[0];
            double priceProduct = Double.parseDouble(productInfo[1]);
            double quantityProduct = Double.parseDouble(productInfo[2]);
            //sum = Double.parseDouble(productInfo[1]) * Double.parseDouble(productInfo[2]);
            //List<Double> vv = product.get(nameProduct);

            if(product.get(nameProduct) == null){
                //price = 0.0;
                quantity = 0.0;
            }else {
                quantity = product.get(nameProduct).get(1);
            }
            list.add(priceProduct);
            list.add(quantity +quantityProduct);

            product.put(productInfo[0],list);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : product.entrySet()) {
            double sum = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n",entry.getKey(),sum);
        }


    }
}
