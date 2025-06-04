import java.util.Scanner;

public class ArrayUtility {
    public static void main(String[] args) {
        inputArray();
    }
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE LENGTH OF ARRAY : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i<size) {
            System.out.print("Please enter your element no " + (i+1) + " : ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }
}
