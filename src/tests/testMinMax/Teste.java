package tests.testMinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Person brady = new Person("Tom Brady", 40);
        Person rodgers = new Person("Aaron Rodgers", 42);
        Person manning = new Person("Peyton Manning", 34);
        Person brees = new Person("Drew Brees", 39);

        Person[] personArray = new Person[] {brady, rodgers, manning, brees};
        List<Person> personList = Arrays.asList(personArray);

        //Find Oldest Person
        final Comparator<Person> comp = Comparator.comparingInt(Person::getAge);

        Person oldest = personList.stream()
                .max(comp)
                .get();

        //Find Youngest Person
        //-This time instead create the Comparator as the argument to the min() method
        Person youngest = personList.stream()
                .min(comp)
                .get();
        System.out.println(oldest);
        System.out.println(youngest);
    }

}
