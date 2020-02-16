package Task12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task12_1 {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>(10);
        list.add("qwer");
        list.add("asdf");
        list.add("zxcv");
    List<String> list0 = new ArrayList<>();


    List<String> list2 = new LinkedList<>();
    List<Integer>   list3 = new ArrayList<>() ;
        list3.add(10);
        list3.add(20);
        list3.add(30);
        printList(list);

    }
    private static void printList(List<String> list){
        System.out.println(list);
    }
}
