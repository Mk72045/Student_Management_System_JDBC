import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String table = "St_info";

        System.out.println("Student Management System");

        while(true) {
            int choice;
            System.out.println("Press 1 for insert, Press 2 for read, Press 3 for update, Press 4 for delete and 5 for exit");
            choice = sc.nextInt();

            if(choice == 5) break;

            switch(choice) {
                // to give values to be inserted in the table using insert query
                case 1 : {
                    int id, marks;
                    String name, city;

                    System.out.println("Enter id: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter name: ");
                    name = sc.nextLine();                    

                    System.out.println("Enter marks: ");
                    marks = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter city: ");
                    city = sc.nextLine();

                    Student st = new Student(id, name, marks, city);

                    Crud.executeCreate(table, st);
                    System.out.println("Data added Successfully.");
                    
                    break;
                }

                // to read or print all (all columns) data of a table
                case 2 : {
                    
                    for(Student student : Crud.executeRead(table)) {
                        System.out.println(student);
                    }
                    
                    break;
                }

                // to make changes in a row of a table for column name and city
                case 3 : {
                    System.out.println("Enter 1 for change name, 2 for change city.");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();
                    
                    switch (updateChoice) {
                        case 1 : {
                            System.out.println("Enter new Name: ");
                            String name = sc.nextLine();

                            System.out.println("Enter id of Student to be make changes: ");
                            int id = sc.nextInt();

                            Crud.executeUpdate(table, "St_Name", name, id); 
                            System.out.println("Changes are made Successfully."); 
                            break;  
                        }
        
                        case 2 : {
                            System.out.println("Enter new city: ");
                            String city = sc.nextLine();

                            System.out.println("Enter id of Student to be make changes: ");
                            int id = sc.nextInt();

                            Crud.executeUpdate(table, "city", city, id); 
                            System.out.println("Changes are made Successfully."); 
                            break;  
                        }

                        default : {
                            System.out.println("Invalid Statement.");
                            break;
                        }

                    }
                    break;
                }

                // to delete data from a table based on Student id
                case 4 : {
                    System.out.println("Enter id of Student to be deleted: ");
                    int id = sc.nextInt();

                    Crud.executeDelete(table, id);
                    System.out.println("Student having id = " + id + " is deleted successfully.");
                    break;
                }

                default: {
                    System.out.println("Invalid Input.");
                    break;
                }

            }
            System.out.println();
        }
        sc.close();
        Conn.connect().close();
        System.out.println("Application closed safely.");
    }
}
