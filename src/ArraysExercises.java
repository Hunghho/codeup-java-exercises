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
        people = addPerson(people, new Person("Batman"));

        for(Person person : people){
            System.out.println(person.getName());
        }


    }

    public static Person[] addPerson(Person[] people, Person newPerson ){
        // create a new array from people array adding to length
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        // add new person to newArray
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
}
