import java.util.ArrayList;
import java.util.Scanner;

public class ListUnion {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> resultList = new ArrayList<>(list1);
        resultList.addAll(list2);
        return resultList;
    }
}

class TestListUnion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter five integers for list1
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        // Prompt the user to enter five integers for list2
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        // Get the union of the two lists
        ArrayList<Integer> combinedList = ListUnion.union(list1, list2);

        // Display the combined list
        System.out.print("The combined list is ");
        for (Integer num : combinedList) {
            System.out.print(num + " ");
        }
    }
}

