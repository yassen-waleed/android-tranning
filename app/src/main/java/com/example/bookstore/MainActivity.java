package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.bookstore.Model.Book;
import com.example.bookstore.Model.Bookdata;
import com.example.bookstore.Model.Bookfactory;
import com.example.bookstore.Model.IBookDa;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        editText = findViewById(R.id.edittext);
        papulatespinner();

    }

    private void papulatespinner() {
        Bookfactory bookfactory = new Bookfactory();
        IBookDa obj = bookfactory.getmodel();
        String[] cats = obj.getcategory();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);
    }

    public void btngetbooks(View view) {
        Bookfactory bookfactory = new Bookfactory();
        IBookDa obj = bookfactory.getmodel();
        String item = spinner.getSelectedItem().toString() ;
        List<Book> books = obj.getBooks(item);
        String str = "";
        for (Book b : books) {
            str += b.getTitle() + "\n";

        }
        editText.setText(str);
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}