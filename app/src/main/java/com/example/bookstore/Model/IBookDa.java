package com.example.bookstore.Model;

import java.util.ArrayList;
import java.util.List;

public interface IBookDa {

     List<Book> getBooks (String cat);

     String [] getcategory ();
}
