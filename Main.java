import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*
        List<Fish> school = new ArrayList<>();
        school.add(new Fish("carp", 4.7));
        school.add(new Fish("mullet", 9.6));
        school.add(new Fish("albacore", 2.7));

        System.out.println(school);

        Collections.sort(school, (f1, f2) -> f1.getSpecies().compareTo(f2.getSpecies()));

        System.out.println(school);

        */

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Charles", "Bordon", 18),
                new Person("Brett", "Shaulson", 20),
                new Person("Richard", "Baer", 15),
                new Person("Ryan", "Szczesny", 18)));

        Collections.sort(list, (p1, p2) -> p1.getLast().compareTo(p2.getLast()));
    }
}
