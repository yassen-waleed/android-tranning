package com.example.bookstore.Model;

import java.util.ArrayList;
import java.util.List;

public class Bookdata implements IBookDa {
private ArrayList<Book> books = new ArrayList<>() ;

    public Bookdata() {
        books.add (new Book(300,"java","java") );
        books.add (new Book(450,"pro java","java") );
        books.add (new Book(300,"C#","C#") );
    }
    public List<Book> getBooks (String cat) {
        ArrayList<Book> data = new ArrayList<>( ) ;
        for (Book b : books) {
            if(b.getCategory().equals((cat))) {
                data.add(b);
            }
        }
        return  data ;

    }

    @Override
    public String[] getcategory() {
        String[] cats = new String[]{"java", "C#", "python"};
        return cats;
    }
}
