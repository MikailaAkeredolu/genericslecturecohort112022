package wildcards;

import java.util.List;

public class Main {

    // method that take s a list of any type of object

    public static <T> void printList(List<T> list){
        for (T t: list) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

    }
}
