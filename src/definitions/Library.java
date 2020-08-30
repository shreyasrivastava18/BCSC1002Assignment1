/*  Created by IntelliJ IDEA.
 *  User: Shreya Srivastava (shreyasrivastava18)
 *  Date: 30/08/20
 *  Time: 7:00 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book[] store;

    public Library(){
        this.store = new Book[50];
        for (int i = 0; i < store.length; i++){
            store[i] = new Book("Book" + (i + 1), null, 9234679899876L + (i+1));

        }
    }
    public Library(Book[] store){
        this.store = store;
    }

    public Book[]getStore(){
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store =  store;
    }
    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Library that = (Library) obj;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }
    }


