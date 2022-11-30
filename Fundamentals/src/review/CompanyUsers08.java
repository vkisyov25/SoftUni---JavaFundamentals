package review;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> ventsy = new LinkedHashMap<>();
        List<String> IDList = new ArrayList<>();

        while (!command.equals("End")){

            String[] arr = command.split(" -> ");
            String company = arr[0];
            String IDNum  = arr[1];

            if(ventsy.get(company)==null){
                IDList = new ArrayList<>();
                if(IDList.contains(IDNum)){

                }else {
                    IDList.add(IDNum);
                    ventsy.put(company,IDList);
                }

            }else {
                for (int i=0; i<ventsy.get(company).size(); i++){
                    IDList.add(ventsy.get(company).get(i));
                }
                if(IDList.contains(IDNum)){

                }else {
                    IDList.add(IDNum);
                    ventsy.put(company,IDList);
                }
            }


            IDList = new ArrayList<>();
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : ventsy.entrySet()) {
            System.out.println(entry.getKey());
            for(int k=0; k<ventsy.get(entry.getKey()).size(); k++){
                System.out.printf("-- %s%n",entry.getValue().get(k));
            }
        }

    }
}
