import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(67);
        list.add(324);

        // Print the elements in the list
        for (Integer num : list) {
            System.out.println(num);
        }
        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt(i));

        }
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
