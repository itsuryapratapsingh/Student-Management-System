import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }

    public void displayCourses() {
        System.out.println("List of Courses:");
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseId() + ", Name: " + course.getCourseName());
        }
    }
}

public class StudentManagementSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n1. Add Student\n2. Add Course\n3. Display Students\n4. Display Courses\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();

                    Student newStudent = new Student(studentId, studentName, studentAge);
                    sms.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Enter course ID: ");
                    String courseId = scanner.next();
                    System.out.print("Enter course name: ");
                    String courseName = scanner.next();

                    Course newCourse = new Course(courseId, courseName);
                    sms.addCourse(newCourse);
                    break;
                case 3:
                    sms.displayStudents();
                    break;
                case 4:
                    sms.displayCourses();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
