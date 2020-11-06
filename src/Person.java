public class Person {
    String firstName;
    String lastName;
    String dateOfBirth;
    double height;
    double weight;

    public static String getName(Person p){

        return p.firstName + " " + p.lastName;
    }
}
