import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList= new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        strList.add("e");
        strList.remove("c");

        System.out.println(strList);
        strList.clear();
        System.out.println(strList);

        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        for (int num :
                intList) {
            System.out.println(num*num);
        }


    }
}
