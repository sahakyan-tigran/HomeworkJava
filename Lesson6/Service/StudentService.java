package Service;

import Model.Student;

public class StudentService {

    public void printFullName(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public void printMaleStudents(Student[] students) {
        for (Student student : students) {
            if (student.getGender().equals("male")) {
                System.out.println(student);
            }
        }
    }

    public void printFemalesGreater50_4(Student[] students) {
        for (Student student : students) {
            if (student.getGender().equals("female") && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
    }

    public void printStudentWithMinimalMark(Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() < min.getMark()) {
                min = students[i];
            }
        }
        System.out.println(min);
    }

    public void printBiggestMale(Student[] students) {
        Student big = null;
        int smallest = 2021;
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGender().equals("male") && students[i].getYear() < smallest) {
                big = students[i];
                smallest = big.getYear();
            }
        }
        if ((big == null)) {
            System.out.println("There isn`t male student");
        } else {
            System.out.println(big);
        }
    }

    public void printByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; ++j) {
                if (students[i].getMark() > students[j].getMark()) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printFemalesByYear(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; ++j) {
                if (students[i].getYear() < students[j].getYear()) {
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
        }
        boolean flag = false;
        for (Student student : students) {
            if (student.getGender().equals("female")) {
                System.out.println(student);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("There isn`t female student");
        }
    }
}
