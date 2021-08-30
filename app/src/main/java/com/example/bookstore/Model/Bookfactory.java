package com.example.bookstore.Model;

public class Bookfactory {

    public IBookDa getmodel (){
        return new Bookdata() ;
    }
}
