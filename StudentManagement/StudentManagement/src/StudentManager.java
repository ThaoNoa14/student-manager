import java.util.ArrayList;

public class StudentManager {
    // properties
    private ArrayList<Student> students; 

    // constructor
    public StudentManager() {
        this.students = new ArrayList<Student>();
    }
    // getter
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    // setter
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // methods
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void editStudentNameById(String id, String name) {
        for (int i = 0; i < this.students.size(); i ++) {
            if (this.students.get(i).getId().equals(id)) { // using equals for compare string
                this.students.get(i).setName(name);
            }
        }
    }

    // TODO

    public void deleteStudentById(String id) {
        for (int i = 0; i < this.students.size(); i ++) {
            if (this.students.get(i).getId().equals(id)) { // using equals for compare string
                this.students.remove(i);
            }
       }
    } 

    // > 0 : greater than
    // = 0: equals
    // < 0 : less than
    public void sortByGpa() {
        this.students.sort(

            (student1, student2) -> {
                if (student1.getGpa() > student2.getGpa()) {
                    return 1;
                } else if (student1.getGpa() < student2.getGpa()) {
                    return -1;
                }
                return 0;
            }

        );  
    }
 
    public void sortByName() {
        this.students.sort(
            (student1, student2 ) -> {
               return student1.getName().compareTo(student2.getName());
            }
        );  
    }

    public void showStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
