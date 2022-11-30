package review;

import java.util.*;

public class LegendaryFarming07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        Map<String, List<Integer>> ventsy = new LinkedHashMap<>();
        Map<String, List<Integer>> junk = new LinkedHashMap<>();
        List<Integer> numberList = new ArrayList<>();

        String materialll ="";

        for (int i=0; i< arr.length; i=i+2){
            int quantity = Integer.parseInt(arr[i]);
            String material = arr[i+1].toLowerCase();

            if(ventsy.get(material)==null){
                numberList = new ArrayList<>();
                numberList.add(quantity);
                ventsy.put(material,numberList);
            }else {
                for(int j=0; j< ventsy.get(material).size(); j++){
                    numberList.add(ventsy.get(material).get(j));
                }
                numberList.add(quantity);
                ventsy.put(material,numberList);
            }

            int sum =0;
            for (int k=0; k<numberList.size(); k++){
                sum += numberList.get(k);

            }

            if(sum>=250){
                ventsy.remove(material);
                materialll = material;
                sum = sum - 250;
                numberList = new ArrayList<>();
                numberList.add(sum);
                ventsy.put(material,numberList);
                break;
            }

            numberList = new ArrayList<>();
        }


        String legendaryItem ="";
        if(materialll.equals("shards")){
            legendaryItem = "Shadowmourne";
        } else if (materialll.equals("fragments")) {
            legendaryItem = "Valanyr";
        } else if (materialll.equals("motes")) {
            legendaryItem = "Dragonwrath";
        }

        List<String> wordsList = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : ventsy.entrySet()) {
            if(!(entry.getKey().equals("shards") || entry.getKey().equals("fragments") || entry.getKey().equals("motes"))){
                junk.put(entry.getKey(),entry.getValue());
                wordsList.add(entry.getKey());
            }
        }

        for(int p=0; p<wordsList.size(); p++){
            ventsy.remove(wordsList.get(p));
        }




        System.out.printf("%s obtained!%n",legendaryItem);
        for (Map.Entry<String, List<Integer>> entry : ventsy.entrySet()) {
            int sum =0;
            for(int i=0; i<entry.getValue().size(); i++){
                sum += entry.getValue().get(i);
            }
            System.out.printf("%s: %d%n",entry.getKey(),sum);
        }
        for (Map.Entry<String, List<Integer>> entry : junk.entrySet()) {
            int sum =0;
            for(int i=0; i<entry.getValue().size(); i++){
                sum += entry.getValue().get(i);
            }
            System.out.printf("%s: %d%n",entry.getKey(),sum);
        }


    }
}
