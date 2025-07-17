import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Comparator;


class MyComparator implements Comparator<Integer>{

    @Override
    public  int compare(Integer o1, Integer o2){
        return o2 - o1;
    }
}

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String S1, String S2){
        return S1.length() - S2.length();
    }
}
class Arraylist{


    public static void main(String[] args){
//
//        List<String> list = new ArrayList<>();
//        List<String> list1 = Arrays.asList("Monday","Tuesday");
//        String[] array = {"Apple", "banana","Cherry"};
//
//        List<String> list2 = Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//
//        List<String> list4 = new ArrayList<>(list2); //isme capacitty de skte aur constructor bhi de skte
//        list4.add("Mango");
//        System.out.println(list4);
//        List<Integer> list3 =List.of(1,2,3,4);
//
//        List<Integer> list5 = new ArrayList<>();
//        list5.add(1);
//        list5.add(2);
//        list5.add(3);
//        list5.add(4);
//        list5.add(0,0);
////        for (int x:list5) {
////            System.out.print(x+" ");
////        }
////        System.out.println(list5);
//        List<Integer> list6 = List.of(5, 6, 7, 8, 9);
//        list5.addAll(list6);
//        System.out.println(list5);


        // -> Comparator


List<Integer> list = new ArrayList<>();
list.add(5);
list.add(2);
list.add(3);

list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("Banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }
}
