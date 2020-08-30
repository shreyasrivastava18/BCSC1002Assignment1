/*  Created by IntelliJ IDEA.
 *  User: Shreya Srivastava(shreyasrivastava18)
 *  Date: 30/08/20
 *  Time: 9:00 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student{

    // fields
    String studentFirstName;
    String studentMiddleName;
    String studentLastName;
    long studentUniversityRollNumber;
    int numberOfBooksIssued;
    Book[] Issued;

    Scanner scanner = new Scanner(System.in);

    //Constructor Method
    //Non-Parameterized Constructor Method

    public Class Student(){
        this.studentFirstName = "Shubhransh";
        this.studentMiddleName ="Kumar";
        this.studentLastName = "Srivastava";
        this.studentUniversityRollNumber = 181500690;
        this.numberOfBooksIssued = 0;
        this.Issued = new Book[5];
    }

    public Student(String studentFirstName,String studentMiddleName,String studentLastName,long studentUniversityRollNumber,int numberOfBooksIssued,Book[] Issued) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.Issued = Issued;
    }

    public Student(String studentFirstName){
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = "Kumar";
        this.studentLastName = "Srivastava";
        this.studentUniversityRollNumber = 181500690;
        this.numberOfBooksIssued = 0;
        this.Issued = Issued;

    }

    public String getStudentFirstName(){
        return studentFirstName;
    }
    //getter

    public void setStudentFirstName(String studentFirstName){
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName(){
        return studentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName){
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName(){
        return studentLastName;
    }

    public void setStudentLastName(){
        this.studentLastName = studentLastName;
    }

    //setter

    public long getStudentUniversityRollNumber(){
        return studentUniversityRollNumber;
    }

    public void  setStudentUniversityRollNumber(){
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssued(){
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public void doIssue(){
        if(numberOfBooksIssued == 0){
            System.out.println("Please Enter your First Name: ");
            studentFirstName = scanner.nextLine();
            System.out.println("Please Enter your Middle Name:" );
            studentMiddleName = scanner.nextLine();
            System.out.println("Please Enter your Last Name: ");
            studentLastName = scanner.nextLine();
            System.out.println("Please Enter your University Name:" );
            studentUniversityRollNumber = scanner.nextInt();
        }
        System.out.println("Enter the book name: ");
        String bookName = scanner.nextLine();
        System.out.println("Enter the author name: ");
        String bookAuthorName = scanner.nextLine();
        System.out.println("Enter the ISBN number of the book: ");
        long BookIsbnNumber=scanner.nextLong();
        Issued[getNumberOfBooksIssued()] = new Book(bookName, bookAuthorName, bookIsbnNumber);
        System.out.println(bookName +" "+"book issued!!");
        System.out.println("--Welcome to FrontDesk");
    }

    /*
     * this method used to return the book
     */

    public void doReturn(){
        if (numberOfBooksIssued == 0) {
            System.out.println("No book is returned");
        }else{
            numberOfBooksIssued = 0;
            this.Issued = new Book[10];
            System.out.println("Books are returned!!");
        }
    }

    public void showIssuedBooks(){
        System.out.println("StudentFirstName: "+ studentFirstName);
        System.out.println("StudentMiddleName: "+ studentMiddleName);
        System.out.println("StudentLastName: "+ studentLastName);
        System.out.println("StudentUniversityRollNumber: "+ studentUniversityRollNumber);
        for(int i = 0; i < numberOfBooksIssued; i++){
            System.out.println("Issued = "+ Issued[i]);
        }
        if (numberOfBooksIssued == 0){
            System.out.println("No Books Issued!");
        }
    }


    @Override
    public String toString(){
        return "Student First Name: "+ getStudentFirstName() + ", "+
                "Student Middle Name: "+ getStudentMiddleName() + ", "+
                "Student Last Name: "+ getStudentLastName() + ", "+
                "Student University Name: "+ getStudentUniversityRollNumber() +
                "Number of Books Issued: "+ getNumberOfBooksIssued() + ", "+
                "Name Of The Books Issued: "+ getIssued() + ", ";
    }

    private Object[] getIssued(){
        return new Object[0];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student that = (Student) obj;
        return Arrays.equals(getIssued(), that.Issued);

    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(getIssued());
    }
    

}

