package project;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class University {

    static{
        System.out.println("CLASS UNIVERSITY");
        System.out.println("\n");
    }
    private String name;
    private List<Student> studentList = new ArrayList<Student>();

    /**
     * this method sets the reference of the students object ot the students list
     * @param studentList
     */
    public void setStudentList(Student studentList){
        this.studentList.add(studentList);
    }

    /**
     * with this method we can get the students list
     * @return studentList
     */
    public List<Student> getStudentList(){
        return this.studentList;
    }



    /**
     * this method set the university name to the instance one
     * @param name
     */
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }else{
            throw new RuntimeException("invalid assigment!");
        }
    }

    /**
     * with this method we can get the university name
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * inserts the student to the students list
     * @param student
     */
    public void add(Student student){
        studentList.add(student);
    }


    /**
     * inserts the student objects reference to the studentList
     * @param sc1
     * @param sc2
     */
    public void insert(Scanner sc1, Scanner sc2){
        Scanner scInt = sc1;
        Scanner scString = sc2;
        System.out.print("ENTER FIRS NAME OF THE STUDENT ");
        String firstName = scString.nextLine();
        System.out.print("ENTER LAST NAME OF THE STUDENT ");
        String lastName = scString.nextLine();
        System.out.print("ENTER AGE OF THE STUDENT ");
        int age = scInt.nextInt();
        add(new Student(firstName, lastName, age));
    }

    /**
     * displays the students list
     */
    public void display(){
        System.out.println("-------------------------");
        System.out.println("FIRST NAME \t LAST NAME \t   AGE");
        Iterator<Student> iterator = studentList.listIterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getFirstName() + "\t\t" + student.getLastName() + "\t\t" + student.getAge());
        }
        System.out.println("-------------------------");
    }

    public void search(Scanner scString){

        boolean isFounded = false;
        Scanner scStr = scString;
        String firsName = scStr.nextLine();
        System.out.println("-------------------------");
        Iterator<Student > iterator = studentList.listIterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equals(firsName)){
                System.out.println(student.getFirstName() + "\t\t" + student.getLastName() + "\t\t" + student.getAge());
                isFounded = true;
            }
        }
        if(!isFounded){
            System.out.println("THE GIVEN PERSSON WOS NOT FOUNDED");
        }

        System.out.println("-------------------------");
    }

    public void delete(Scanner scStr){
        boolean isDeleted = false;
        String firstName, lastName;
        System.out.print("ENTER THE STUDENTS FIRS NAME ");
        firstName = scStr.nextLine();
        System.out.print("ENTER STUDENTS LAST NAME ");
        lastName = scStr.nextLine();
        Iterator<Student> iterator = studentList.listIterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                iterator.remove();
                isDeleted = true;
                System.out.println("STUDENT WAS DELETED SUCCESSFULLY");
            }
        }
        if(!isDeleted){
            System.out.println("CURRENT STUDENT DOES NOT EXIST");
        }
    }

    public void update(Scanner scStr, Scanner scInt){
        System.out.println("ENTER STUDENTS FIRST NAME LAST NAME AND AGE");
        String firstName, lastName;
        int age;
        boolean isUpdated = false;
        System.out.print("ENTER FIRST NAME ");
        firstName = scStr.nextLine();
        System.out.print("ENTER LAST NAME ");
        lastName = scStr.nextLine();
        System.out.print("ENTER THE AGE ");
        age = scInt.nextInt();
        Iterator<Student> iterator = studentList.listIterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getAge() == age){
                System.out.print("ENTER NEW FIRST NAME ");
                firstName = scStr.nextLine();
                student.setFirstName(firstName);
                System.out.print("ENTER NEW LAST NAME ");
                lastName = scStr.nextLine();
                student.setLastName(lastName);
                System.out.print("ENTER NEW AGE ");
                age = scInt.nextInt();
                student.setAge(age);
                isUpdated = true;
                System.out.println("UPDATE WOS DONE SUCCESSFULLY");
            }
        }
        if(!isUpdated){
            System.out.println("CURRENT STUDENT DOES NOT EXIST");
        }
    }

    public University(String name){
        this.name = name;
    }

    public University(){}
}
