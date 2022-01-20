import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> arrayList= new ArrayList<>();
        arrayList.add(new Pokemon("이상해씨"));
        arrayList.add(new Pokemon("이상해풀"));
        arrayList.add(new Pokemon("이상해꽃"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        HashMap<String, Pokemon> pokedex = new HashMap<>();
        pokedex.put("피카츄", new Pokemon("피카츄"));
        pokedex.put("파이리", new Pokemon("파이리"));
        pokedex.put("이상해씨", new Pokemon("이상해씨"));
        pokedex.put("이상해풀", new Pokemon("이상해풀"));
        pokedex.put("이상해꽃", new Pokemon("이상해꽃"));

        pokedex.put("피카츄", new Pokemon("라이츄"));
        System.out.println("________________");
        pokedex.remove("피카츄");
        for (String name: pokedex.keySet()
             ) {
            System.out.println(name);

        }// hashmap key have to be Stringtype




    }
}
