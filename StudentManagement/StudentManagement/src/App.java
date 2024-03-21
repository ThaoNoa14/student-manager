import java.util.Scanner;

public class App {
    public static void menu() {
        System.out.println("======================");
        System.out.println("1. Add Student.");
        System.out.println("2. Edit Student Name By Id.");
        System.out.println("3. Delete Student By Id.");
        System.out.println("4. Sort By GPA.");
        System.out.println("5. Sort By Name");
        System.out.println("6. Show Student.");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) throws Exception {
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (!isExit) {
            menu();
            System.out.print("Enter option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 0:
                    isExit = true;
                    break;
                case 1: {
                        Student student = new Student();
                        student.input();
                        manager.addStudent(student);
                    }
                    break;
                case 2: {
                        System.out.print("Enter id: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        manager.editStudentNameById(id, name);
                    }
                    break;
                case 3: {
                        System.out.print("Enter id: ");
                        String id = scanner.nextLine();
                        manager.deleteStudentById(id);
                    }
                    break;
                case 4:
                    manager.sortByGpa();
                    break;
                case 5:
                    manager.sortByName();
                    break;
                case 6:
                    manager.showStudent();
                    break;
                default:
                    break;
            }
        }
    }
}
