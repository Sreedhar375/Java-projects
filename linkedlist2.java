// // package CRT DAY 2.CRT DAY 3;
import java.util.*;

public class linkedlist2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
            hmap.put(sc.nextInt(), sc.next());
        } 
        System.out.println(hmap);

        sc.close();
    }
}