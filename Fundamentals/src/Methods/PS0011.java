package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PS0011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(element ->Integer.parseInt(element)).toArray();
        String line = scanner.nextLine();

        int exchangeCount = 0;
        while (!line.equals("end")) {
            String[] array = line.split(" ");
            String command = array[0];


            if (command.equals("exchange")) {
                exchangeCount++;
                int countI = 0;
                int dyljina =0;
                int index = Integer.parseInt(array[1]);
                int indexxx = index;
                if (index < 0 || index > arr.length) {
                    System.out.println("Invalid index");
                } else {
                    // [1 2 3 4 5] --> [4 5 1 2 3]
                    if(exchangeCount>1){
                        for (int i = 0; i < arr.length; i++) {
                            countI++;
                            int temp = arr[i];
                            arr[i] = arr[index + 1];
                            arr[index + 1] = temp;
                            index++;
                            if(index==arr.length-1){
                                break;
                            }
                        }
                        dyljina = arr.length - countI;
                        int v = 0;
                        for (int j = countI; j< dyljina/2+1; j++ ){
                            int temp = arr[j];
                            arr[j] = arr[dyljina-v];
                            arr[dyljina-v]=temp;
                            //index++;
                            countI++;
                            if(countI+1== arr.length){
                                break;
                            }
                            v++;
                        }
                        int k =0;
                        for(int i= countI-1; i< arr.length - (countI-1); i++){
                            int temp = arr[i];
                            arr[i] = arr[arr.length-1-k];
                            arr[arr.length-1-k] = temp;
                            k++;
                        }
                    }else{
                        for (int i = 0; i < arr.length; i++) {
                            countI++;
                            int temp = arr[i];
                            arr[i] = arr[index + 1];
                            arr[index + 1] = temp;
                            index++;
                            if(index==arr.length-1){
                                break;
                            }
                        }

                        for (int j = countI; j<=arr.length - indexxx; j++ ){
                            int temp = arr[j];
                            arr[j] = arr[countI + 1];
                            arr[countI + 1] = temp;
                            //index++;
                            countI++;
                            if(countI+1== arr.length){
                                break;
                            }

                        }
                    }

                }

                if(exchangeCount>1){
                    System.out.println(Arrays.toString(arr));
                }

            } else if (command.equals("max")) {
                String evenOrOdd = array[1];
                if (evenOrOdd.equals("even")) {
                    int maxEvenNum = Integer.MIN_VALUE;
                    int maxEvenIndex = 0;
                    boolean isFound = true;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            isFound = false;
                            if (arr[i] > maxEvenNum) {
                                maxEvenNum = arr[i];
                                maxEvenIndex = i;
                            }
                        }
                    }
                    if (isFound) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(maxEvenIndex);
                    }
                } else {
                    int maxOddNum = Integer.MIN_VALUE;
                    int maxOddIndex = 0;
                    boolean isFound = true;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            isFound = false;
                            if (arr[i] > maxOddNum) {
                                maxOddNum = arr[i];
                                maxOddIndex = i;
                            }
                        }
                    }
                    if (isFound) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(maxOddIndex);
                    }
                }

            } else if (command.equals("min")) {

                String evenOrOdd = array[1];
                if (evenOrOdd.equals("even")) {
                    int minEvenNum = Integer.MAX_VALUE;
                    int minEvenIndex = 0;
                    boolean isFound = true;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            isFound = false;
                            if (arr[i] < minEvenNum) {
                                minEvenNum = arr[i];
                                minEvenIndex = i;
                            }
                        }
                    }
                    if (isFound) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(minEvenIndex);
                    }
                } else {
                    int minOddNum = Integer.MAX_VALUE;
                    int minOddIndex = 0;
                    boolean isFound = true;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            isFound = false;
                            if (arr[i] < minOddNum) {
                                minOddNum = arr[i];
                                minOddIndex = i;
                            }
                        }
                    }
                    if (isFound) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(minOddIndex);
                    }
                }
            } else if (command.equals("first")) {
                int index = Integer.parseInt(array[1]);
                String oddOrEven = array[2];

                if (index > array.length) {
                    System.out.println("Invalid count");
                } else {
                    if (oddOrEven.equals("even")) {
                        int countEven = 0;
                        int countEven1 = 0;
                        for (int i = 0; i < arr.length; i++) {
                            //int countEven1 = 0;
                            if (arr[i] % 2 == 0) {
                                countEven1++;
                                if (countEven1 <= index) {
                                    countEven++;
                                } else {
                                    break;
                                }

                            }
                        }
                        int[] firstEvenArr = new int[countEven];
                        countEven = 0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % 2 == 0) {
                                firstEvenArr[countEven] = arr[i];
                                countEven++;

                                if(countEven==firstEvenArr.length){
                                    break;
                                }

                            }
                        }


                        if (countEven == 0) {
                            System.out.println("[]");
                        } else {
                            System.out.println(Arrays.toString(firstEvenArr));
                            }
                        }
                    }
                    if (oddOrEven.equals("odd")) {
                        int countOdd = 0;
                        int countOdd1 = 0;
                        for (int i = 0; i < arr.length; i++) {

                            if (arr[i] % 2 != 0) {
                                countOdd1++;
                                if (countOdd1 <= index) {
                                    countOdd++;
                                } else {
                                    break;
                                }

                            }
                        }
                        int[] firstOddArr = new int[countOdd];
                        countOdd = 0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % 2 != 0) {
                                firstOddArr[countOdd] = arr[i];
                                countOdd++;

                                if(countOdd==firstOddArr.length){
                                    break;
                                }

                            }
                        }


                        if (countOdd == 0) {
                            System.out.println("[]");
                        } else {
                            System.out.println(Arrays.toString(firstOddArr));
                        }
                    }

                }else if (command.equals("last")) {
                int index = Integer.parseInt(array[1]);
                String oddOrEven = array[2];

                if(index > array.length){
                    System.out.println("Invalid count");
                }else {
                    if (oddOrEven.equals("even")) {
                        int countEven = 0;
                        int countEven1 = 0;

                        int countVentsy = 0;
                        for(int i = 0; i < arr.length; i++){
                            if(arr[i] %2 ==0){
                                countVentsy++;
                            }

                        }

                        for (int i = 0; i < arr.length; i++) {
                            //int countEven1 = 0;
                            if (arr[i] % 2 == 0) {
                                countEven1++;
                                if (countEven1 <= countVentsy - index) {
                                    //countEven++;
                                } else {
                                    countEven++;
                                }

                            }
                        }
                        int[] firstEvenArr = new int[countEven];
                        countEven = 0;
                        int count =0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % 2 == 0) {
                                count++;
                                if (count > countVentsy - index) {
                                    firstEvenArr[countEven] = arr[i];
                                    countEven++;
                                }

                                if(countEven==firstEvenArr.length){
                                    break;
                                }

                            }
                        }


                        if (countEven == 0) {
                            System.out.println("[]");
                        } else {
                            System.out.println(Arrays.toString(firstEvenArr));
                        }
                    } else if (oddOrEven.equals("odd")) {
                        int countOdd = 0;
                        int countOdd1 = 0;

                        int countVentsy = 0;
                        for(int i = 0; i < arr.length; i++){
                            if(arr[i] %2 !=0){
                                countVentsy++;
                            }

                        }

                        for (int i = 0; i < arr.length; i++) {
                            //int countEven1 = 0;
                            if (arr[i] % 2 != 0) {
                                countOdd1++;
                                if (countOdd1 <= countVentsy - index) {
                                    //countEven++;
                                } else {
                                    countOdd++;
                                }

                            }
                        }
                        int[] firstOddArr = new int[countOdd];
                        countOdd = 0;
                        int count =0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % 2 != 0) {
                                count++;
                                if (count > countVentsy - index) {
                                    firstOddArr[countOdd] = arr[i];
                                    countOdd++;
                                }

                                if(countOdd==firstOddArr.length){
                                    break;
                                }

                            }
                        }


                        if (countOdd == 0) {
                            System.out.println("[]");
                        } else {
                            System.out.println(Arrays.toString(firstOddArr));
                        }
                    }

                }


            }


            line = scanner.nextLine();
        }
    }
}


