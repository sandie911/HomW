package homework7;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(LogModes.INFO);
        Person person1 = new Person("Nikita","Kovalenko","32222345",40 );
        Person person2 = new Person("","Fedorenko","56635555",23);
        List<Person> list = new ArrayList<Person>();
        list.add(person1);
        list.add(person2);
        list.add(new Person("Oleg", "Vinnik", "33333222", 25));
        list.add(new Person("Inna", "Bur", "43333622", 18));
        list.add(new Person("Olga", "Guk", "55333222", 29));
        try {
            System.out.println(person1.call());
            System.out.println(person2.call());

        }
        catch (CustomException e) {
            logger.Write(e.getMessage());
        }
        catch (Exception exception){
            logger.Write(exception.getMessage());
        }
        System.out.println( "Не телефонувати: ");
        List<Person> listOfPersonsBefore30 = Person.PersonUnderThirty(list, 30);
         int n = listOfPersonsBefore30.size();
         for (int i = 0; i < n; i++){
            Person person = listOfPersonsBefore30.get(i);
            System.out.println(person.getSurname() + " "+ person.getName());
        }
    }
}
