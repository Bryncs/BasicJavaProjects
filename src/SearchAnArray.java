import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 4, 6, 7, 4, 2, 5};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        //String target = "pineapple";
        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();
        //int target = 10;


        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
