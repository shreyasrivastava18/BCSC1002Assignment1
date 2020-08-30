//  Created by IntelliJ IDEA.
// *  User: Shreya Srivastava (shreyasrivastava18)
// *  Date: 30/08/20
// *  Time: 7:00 PM
// *  File Name : Book.java
// *
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String bookIsbnNumber;

    //constructor method
    //Non-Parameter Constructor Method

    public Book(){
        this.bookName = "The Boy Who Loved";
        this.bookAuthorName = "Durjoy Dutta";
        this.bookIsbnNumber =  "9234679899876";

    }

    public Book(String bookName,String bookAuthorName,String bookIsbnNumber){
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookIsbnNumber = bookIsbnNumber;

    }
    public Book(String bookName){
        this.bookName = bookName;
        this.bookAuthorName = "Durjoy Dutta";
        this.bookIsbnNumber = "9234679899876";

    }

    public Book(String bookName,String bookAuthorName,long i){

    }

    public String getBookName(){
        return bookName;

    }

    public void setBookName(String bookName) {
        this.bookName = bookName;

    }
    public String getBookAuthorName(){
        return bookAuthorName;

    }

    public void setBookAuthorName(String bookAuthorName){
        this.bookAuthorName = bookAuthorName;

    }

    public String getBookIsbnNumber(){
        return bookIsbnNumber;

    }
    public void setBookIsbnNumber(String bookIsbnNumber){
        this.bookIsbnNumber = bookIsbnNumber;

    }

    // The toString()method
    //public String toString(){


    @Override
    public String toString(){
        return  "Book{" +
                "bookName='" + bookName + '\'' +
                ",bookAuthorName='" + bookAuthorName + '\''+
                ",bookIsbnNumber='" + bookIsbnNumber + '\''+
                '}';
    }
    // The equals() method
    // The HashCode() method
    @Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() !=obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return getBookAuthorName() == book.getBookAuthorName() &&
                bookIsbnNumber() == book.getBookIsbnNumber() &&
            Objects.equals(getBookName(),book.getBookName());
        }
        private String bookIsbnNumber(){
            return bookIsbnNumber;

        }
        @Override
        public int hashCode(){
            return  Objects.hash(getBookName(),getBookAuthorName(),getBookIsbnNumber());

        }

        public void issueBookName(String bookName){
        }

        public void doReturn(String bookName){
        }

        public void IssueBooks(String bookName){
        }
        }

