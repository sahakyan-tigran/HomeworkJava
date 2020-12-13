import Model.Student;
import Service.StudentService;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\students.txt"));
        String buffer[] = new String[5];
        String line = reader.readLine();
        int countOfLines = 0;
        while (line != null) {
            countOfLines++;
            line = reader.readLine();
        }
        reader.close();

        reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\students.txt"));
        line = reader.readLine();
        Student[] students = new Student[countOfLines];
        int j = 0;
        while (line != null) {
            int i = 0;
            for (String str : line.split(",")) {
                buffer[i++] = str;
            }
            students[j++] = new Student(buffer[0], buffer[1], Integer.parseInt(buffer[2]), buffer[3], Double.parseDouble(buffer[4]));
            line = reader.readLine();
        }
        reader.close();

        StudentService ss = new StudentService();
        System.out.println("-----------------------Task1----------------------");
        ss.printFullName(students);
        System.out.println("\n-----------------------Task2----------------------");
        ss.printMaleStudents(students);
        System.out.println("\n-----------------------Task3----------------------");
        ss.printFemalesGreater50_4(students);
        System.out.println("\n-----------------------Task4----------------------");
        ss.printStudentWithMinimalMark(students);
        System.out.println("\n-----------------------Task5----------------------");
        ss.printBiggestMale(students);
        System.out.println("\n-----------------------Task6----------------------");
        ss.printByMark(students);
        System.out.println("\n-----------------------Task7----------------------");
        ss.printFemalesByYear(students);
    }
}
