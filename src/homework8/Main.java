package homework8;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<Student>();
        int course = 3;
        list.add(new Student("Федоренко", 3));
        list.add(new Student("Русік",1 ));
        list.add(new Student("Орлик",1 ));
        list.add(new Student("Ткач",2 ));
        list.add(new Student("Деркач",3 ));
        list.add(new Student("Азарова",1 ));
        list.add(new Student("Шевчек",1 ));
        list.add(new Student("Зірка",2 ));
        list.remove(5);
        list.add(new Student("Азарова",3 ));
        list.add(new Student("Зубко",1 ));
        list.add(new Student("Верес",2 ));
        PrintList(list, course);
    }
    public static void PrintList(List<Student> students, int course)
    {
        System.out.println("Студенти " + course + " курса:");
        int n = students.size();
        for (int i = 0; i < n; i++)
        {

            Student student = students.get(i);
            if (student.getCourse() == course)
            {
                System.out.println(student.getName());
            }
        }
    }
}

