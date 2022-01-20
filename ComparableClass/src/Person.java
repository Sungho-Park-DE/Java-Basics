public class Person implements Comparable<Person>{
    private final String name;

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

