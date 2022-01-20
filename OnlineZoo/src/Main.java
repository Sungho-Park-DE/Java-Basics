import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<AbstractAnimal> animals=new ArrayList<>();

        Scanner stdIn=new Scanner(System.in);
        for (int i=0; i<2;i++){
            System.out.println("which animal: ");
            String name=stdIn.next();
            System.out.println("sound: ");
            String sound=stdIn.next();

            //anonymous Class

            animals.add(new AbstractAnimal(name) {
                @Override
                public void cry() {
                    System.out.println(sound);
                }
            });
        }
        for (AbstractAnimal animal  :animals
             ) {
            System.out.println(animal.name);
            animal.cry();
        }
    }
}