/*  Created by IntelliJ IDEA.
 *  User: Shreya Srivastava (shreyasrivastava18)
 *  Date: 30/08/20
 *  Time: 9:00 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

import definitions.Library;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Book myBookStore = new Book();
        String bookName;
        String bookAuthorName;
        String bookIsbnNumber;

        do{
            System.out.println("\"Welcome To The Front Desk\"");
            System.out.println("============");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1...4)");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Enter the name of the book you want to issue:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBookStore.issueBookName(bookName);
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Return the book you have issued earlier!");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBookStore.IssueBooks(bookName);
                    break;
                default:
                    break;
            }

        }
        while (studentInput !=EXIT);
        scanner.close();
    }
}
