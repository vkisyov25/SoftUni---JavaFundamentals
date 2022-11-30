package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        Map<String,Integer> keyMaterial = new TreeMap<>();
        Map<String,Integer> junkMaterial = new TreeMap<>();

        keyMaterial.put("shards",0);
        keyMaterial.put("fragments",0);
        keyMaterial.put("motes",0);

        for (int i=0; i<arr.length; i +=2){
            int value = Integer.parseInt(arr[i]);
            String word = arr[i+1].toLowerCase();

            if(word.equals("shards")||word.equals("fragments")||(word.equals("motes"))){
                Integer num = keyMaterial.get(word);
                if (num == null){
                    num=0;
                }
                keyMaterial.put(word,num+value);

                if(keyMaterial.get(word)>=250){
                    if(word.equals("shards")){
                        System.out.println("Shadowmourne obtained!");
                    } else if (word.equals("fragments")) {
                        System.out.println("Valanyr obtained!");
                    } else if (word.equals("motes")) {
                        System.out.println("Dragonwrath obtained!");
                    }
                    Integer count = keyMaterial.get(word) - 250;
                    keyMaterial.put(word,count);
                    break;
                }
            }else {
                Integer numm = junkMaterial.get(word);
                if(numm == null){
                    numm =0;
                }
                junkMaterial.put(word,numm + value);
            }

        }
        keyMaterial.entrySet().stream().sorted((f,s) ->{
            int result = s.getValue().compareTo(f.getValue());
            if(result ==0){
                result =f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(e ->System.out.println(e.getKey()+": "+e.getValue()));


        junkMaterial.forEach((k,v) ->System.out.println(k+": "+v));

        /*for (Map.Entry<String, Integer> entry : keyMaterial.entrySet()) {
            if(entry.getKey().equals("shards")){
                System.out.println(entry.getKey()+": "+entry.getValue());
            } else if (entry.getKey().equals("fragments")){
                System.out.println(entry.getKey()+": "+entry.getValue());
            } else if (entry.getKey().equals("motes")){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }

        for (Map.Entry<String, Integer> entry : keyMaterial.entrySet()) {
            if (!(entry.getKey().equals("shards")) && !(entry.getKey().equals("fragments")) && !(entry.getKey().equals("motes"))){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
        }*/


    }
}
