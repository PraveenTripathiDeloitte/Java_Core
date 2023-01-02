package practice;

import java.util.ArrayList;
import java.util.Collections;

public class University {

    ArrayList<Student> studentsDatabase;

    public University(ArrayList<Student> studentsDatabase) {
        this.studentsDatabase = studentsDatabase;
    }

    public University() {
    }

    public static final University university = new University();

    public ArrayList<Student> getStudentsDatabase() {
        return studentsDatabase;
    }

    public void setStudentsDatabase(ArrayList<Student> studentsDatabase) {
        this.studentsDatabase = studentsDatabase;
    }

    /**
     * This function will create new student with
     * provided student ID
     *
     * @param studentID String studentID
     */
    public void createStudent(String studentID) {
        Student student = new Student(studentID);
        if (university.getStudentsDatabase() == null) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(student);
            university.setStudentsDatabase(students);
        } else
            university.getStudentsDatabase().add(student);
    }

    /**
     * This function will set name of the student
     * with provided student ID
     *
     * @param studentID Student with StudentID
     * @param name      String name
     */
    public void setStudentName(String studentID, String name) throws Exception {
        boolean idExist = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                student.setName(name);
                idExist = true;
            }
        }
        if (!idExist) throw new Exception("No student exist with given ID");


    }

    /**
     * This function will set major of the student
     * with provided student ID
     *
     * @param studentID Student with StudentID
     * @param major     String major
     */
    public void setMajorName(String studentID, String major) throws Exception {
        boolean idExist = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                student.setMajor(major);
                idExist = true;
            }
        }
        if (!idExist) throw new Exception("No student exist with given ID");
    }

    /**
     * This function will set birthdate of the student
     * with provided student ID
     *
     * @param studentID Student with StudentID
     * @param birthdate String birthdate
     */
    public void setBirthdate(String studentID, String birthdate) throws Exception {
        boolean idExist = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                student.setBirthdate(birthdate);
                idExist = true;
            }
        }
        if (!idExist) throw new Exception("No student exist with given ID");
    }

    /**
     * This function will add course to courseList of the student
     * with provided student ID
     *
     * @param studentID Student with StudentID
     * @param courseNo  String courseNo
     */
    public void addCourse(String studentID, String courseNo) throws Exception {
        boolean idExist = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                idExist = true;
                if (student.getCourses() == null) {
                    Course course = new Course(courseNo);
                    ArrayList<Course> courses = new ArrayList<>();
                    courses.add(course);
                    student.setCourses(courses);
                } else {
                    student.getCourses().add(new Course(courseNo));
                }
            }
        }
        if (!idExist) throw new Exception("No student exist with given ID");
    }

    /**
     * This function will set credit hour to the course of the
     * student if course is available in the courseList
     *
     * @param studentID
     * @param courseID
     * @param creditHour
     * @throws Exception
     */
    public void setCreditHour(String studentID, String courseID, Integer creditHour) throws Exception {

        boolean studentExist = false, courseEnrolled = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                studentExist = true;
                for (Course course : student.getCourses()) {
                    if (course.getCn().equals(courseID)) {
                        courseEnrolled = true;
                        course.setCh(creditHour);
                    }
                }
            }
        }
        if (studentExist && !courseEnrolled) {
            throw new Exception("No course found with given course ID in the courses list of the provided student");

        } else if (!studentExist) {
            throw new Exception("No student found with given studentID");
        }
    }

    /**
     * This function will add grade to the course of the
     * student if course is available in the courseList
     *
     * @param studentID
     * @param courseID
     * @param grade
     * @throws Exception
     */
    public void setGrades(String studentID, String courseID, Integer grade) throws Exception {
        boolean studentExist = false, courseEnrolled = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                studentExist = true;
                for (Course course : student.getCourses()) {
                    if (course.getCn().equals(courseID)) {
                        courseEnrolled = true;
                        course.setGrade(grade);
                    }
                }
            }
        }
        if (studentExist && !courseEnrolled) {
            throw new Exception("No course found with given course ID in the courses list of the provided student");

        } else if (!studentExist) {
            throw new Exception("No student found with given studentID");
        }
    }

    /**
     * This function will return the average of the grades
     * of all the courses in which student is enrolled
     *
     * @param student
     * @return
     */
    public Double getAverage(Student student) throws Exception {
        if (!student.getCourses().isEmpty()) {
            Double avg = 0.0;
            for (Course x : student.getCourses()) {
                if (x.getGrade() != null)
                    avg += x.getGrade();
                else continue;
            }
            return avg;
        } else throw new Exception("Student not enrolled in any course");
    }

    public void getDetails(String studentID) throws Exception {
        boolean studentExist = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                studentExist = true;
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Major: " + student.getMajor());
                System.out.println("Birthdate: " + student.getBirthdate());
                System.out.println("Average: " + getAverage(student));
                System.out.println("CN" + "    " + "Credit Hours" + "    " + "Grade");
                if (!student.getCourses().isEmpty()) {
                    for (Course x : student.getCourses()) {
                        System.out.println(x.getCn() + "    " + x.getCh() + "    " + x.getGrade());
                    }
                } else {
                    throw new Exception("Student is not enrolled in any course");
                }
            }
        }
        if (!studentExist) throw new Exception("No student exists with given ID");
    }

    public void deleteStudent(String studentID) throws Exception {
        boolean studentExist = false;
        for (Student student : university.getStudentsDatabase()) {
            if (student.getId().equals(studentID)) {
                studentExist = true;
                university.getStudentsDatabase().remove(student);
            }
        }
        if (!studentExist) {
            throw new Exception("No Student Exist with given ID");
        }

    }

    public static void main(String[] args) throws Exception {
        university.createStudent("101");
        university.setStudentName("101", "Harry Potter");
        university.setBirthdate("101", "2000-06-23");
        university.setMajorName("101", "Wizardy");
        university.addCourse("101", "Hyppotise");
//        university.getDetails("101");
        university.createStudent("102");
        System.out.println(university.getStudentsDatabase().get(1).getId().equals("102"));
        university.setStudentName("102", "Ron Weasley");
        university.setBirthdate("102", "2000-07-23");
        university.setMajorName("102", "Wizardy");
        university.addCourse("102", "Hyppotise");
//        university.getDetails("102");
        university.createStudent("103");
        university.setStudentName("103", "Hermione Granger");
        university.setBirthdate("103", "2000-08-23");
        university.setMajorName("103", "Wizardy");
        university.addCourse("103", "Hyppotise");

        System.out.println(university.getStudentsDatabase());
        Collections.sort(university.studentsDatabase, (Student s1, Student s2) -> {
            return s1.getName().compareTo(s2.getName());
        });
        for (Student s : university.studentsDatabase) {
            university.getDetails(s.getId());
        }

        if(!university.studentsDatabase.stream().anyMatch(student -> student.getName().equals("Dumbledore"))){
            university.createStudent("104");
            System.out.println(university.getStudentsDatabase());
        }
    }
}
