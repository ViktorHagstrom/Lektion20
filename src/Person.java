import java.util.Calendar;

public class Person {

    // Instansvariabler
    String firstName;
    String lastName;
    String dateOfBirth;
    public double height;
    double weight;


    // Instansmetoder - får ej innehålla static
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {

        String calendar = Calendar.getInstance().getTime().toString();
        String thisYearString = calendar.substring(calendar.lastIndexOf(' ') + 1);
        int thisYear = Integer.parseInt(thisYearString);

        String yearString = this.dateOfBirth.substring(0, 4);
        int year = Integer.parseInt(yearString);

        int age = thisYear - year;
        return age;
    }

    public double getBMI() {
        return this.weight / (this.height * 2);
    }


}

