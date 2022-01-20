import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(23);
        integerArrayList.add(66);
        integerArrayList.add(22);
        integerArrayList.add(1);
        integerArrayList.add(5);
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("adrian");
        stringArrayList.add("gerd");
        stringArrayList.add("paul");
        stringArrayList.add("simon");
        stringArrayList.add("chris");
        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);

        ArrayList<Person> personArrayList=new ArrayList<>();
        personArrayList.add(new Person("Charlie", 25));
        personArrayList.add(new Person("Ben",44));
        personArrayList.add(new Person("Alex",32));
        personArrayList.add(new Person("Daniel",41));

        Collections.sort(personArrayList);
        System.out.println(personArrayList);

    }
}
