import java.util.Scanner;

public class hw9_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = Integer.parseInt(scan.next());
        int[] heapArr = new int[numbers];
        //loop numbers
        for (int i = 0; i < numbers; i++) {
            heapArr[i] = Integer.parseInt(scan.next());
        }
        mHeap(heapArr);
        int numCommands = Integer.parseInt(scan.next());

        String temp;
        switch (temp) {
            case "displayMax":
                break;
            case "insert":
                break;
            case "deleteMax":
                break;
            case "display":
                break;
            case "update":
                break;
            case "delete":
                break;
            default:
                System.out.println("How'd i get here");
                break;
        }
    }
    public static void mHeap(int[] heapArr){
        //constructor for heap

    }
}
