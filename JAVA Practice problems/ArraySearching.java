import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,34,54,67,87,98,76,56,24,9,6};
        System.out.println("WELCOME TO ARRAY SEARCHING ");
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr,num);
        if (isFound) {
            System.out.println("YOUR NUMBER WAS FOUND IN ARRAY ");

        } else {
            System.out.println("YOUR NUMBER WAS NOT FOUND IN ARRAY");
        }
    }
    public static boolean isFound(int[] arr,int num) {
        int index =0;
        while(index< arr.length) {
            if (arr[index] == num ) {
                return true;
            }
            index++;
        }
        return false;

    }
}
