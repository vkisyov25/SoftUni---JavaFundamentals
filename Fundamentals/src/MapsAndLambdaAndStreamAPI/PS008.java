package MapsAndLambdaAndStreamAPI;

import java.util.*;

public class PS008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employmens = new LinkedHashMap<>();

        String line = scanner.nextLine();

        boolean isHave = true;
        while (!line.equals("End")){
            String[] arr = line.split("->");

            String companyName = arr[0];
            String ID = arr[1];

            if(employmens.get(companyName)==null){
                employmens.put(companyName,new ArrayList<>());
            }
            for (int i=0; i<employmens.get(companyName).size(); i++){
                String vvv =employmens.get(companyName).get(i);
                if(true){
                    boolean isHaveSameId = true;
                    if(!employmens.get(companyName).get(i).equals(ID)){
                        isHave = false;
                        employmens.get(companyName).add(ID);
                        isHaveSameId = false;
                    }
                    if(isHaveSameId){
                        isHave=false;
                        break;
                    }

                }

            }
            if(isHave){
                employmens.get(companyName).add(ID);
            }



            line = scanner.nextLine();
            isHave = true;
        }

        for (Map.Entry<String, List<String>> entry : employmens.entrySet()) {
            System.out.println(entry.getKey());
            for (int i=0; i<employmens.get(entry.getKey()).size(); i++){
                System.out.printf("--%s%n",entry.getValue().get(i));
            }
        }

    }

}
