import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        Person person1 = new Person("Hung");
        Person person2 = new Person("Horace");
        Person person3 = new Person("Titus");

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        for(Person person : people){
            System.out.println(person.getName());
        }
        // add more people to the array
        people = Person.addPerson(people, new Person("Batman"));

        for(Person person : people){
            System.out.println(person.getName());
        }


    }

}
