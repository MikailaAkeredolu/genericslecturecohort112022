import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {



//    public static void print(String[] list){
//        for (String item: list) {
//            System.out.println(item.getClass().getSimpleName() + ":" + item);
//        }
//    }

    public static<T> void print(T[] list){
        for (T item: list) {
            System.out.println(item.getClass().getSimpleName() + ":" + item);
        }
    }



    public static void main(String[] args) {

        List<Integer> idNumbers = new ArrayList();
//        idNumbers.add(" Mike");
//        idNumbers.add('d');
//        idNumbers.add(1);
//
//        idNumbers.add(new Date().toString());

        for (Object id: idNumbers) {
            System.out.println(id);
        }

        Integer index1 = idNumbers.get(1);





//        String[] listOfNames = {"Blk-Gurl-Magic", "E-Money", "FigBar"};
//        Integer[] listOfNumbers = {1,2,3};
//        print(listOfNames);
//        print(listOfNumbers);

    }
}
