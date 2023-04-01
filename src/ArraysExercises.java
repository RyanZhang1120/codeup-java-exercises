import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] persons = new Person[3];

        persons[0] = new Person("Ryan");
        persons[1] = new Person("Niki");
        persons[2] = new Person("John");
        for(Person person : persons){
            System.out.println(person.getName());
        }

        Person newPerson = new Person("Alice");
        persons = addPerson(persons, newPerson);

        System.out.println("After adding a new person:");
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] persons, Person newPerson){
        Person[] newPersonsArray = Arrays.copyOf(persons, persons.length + 1);
        newPersonsArray[persons.length] = newPerson;
        return newPersonsArray;
    }
}
