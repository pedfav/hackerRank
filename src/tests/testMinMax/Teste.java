package tests.testMinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Person obama = new Person("Barack Obama", 53);
        Person bush2 = new Person("George Bush", 68);
        Person clinton = new Person("Bill Clinton", 68);
        Person bush1 = new Person("George HW Bush", 90);

        Person[] personArray = new Person[] {obama, bush2, clinton, bush1};
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
