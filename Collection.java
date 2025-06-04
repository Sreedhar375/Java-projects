package demo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Collection {
    public static void main(String[] args) {
        arrayListExample();
        linkedListExample();
        hashSetExample();
        hashMapExample();
    }

    public static void arrayListExample() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
    }

    public static void linkedListExample() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);
    }

    public static void hashSetExample() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Aizen");
        hashSet.add("Grimmjow");
        hashSet.add("Ichigo");
        System.out.println("HashSet: " + hashSet);
    }

    public static void hashMapExample() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);
    }
}