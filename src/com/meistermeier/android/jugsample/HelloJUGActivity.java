package com.meistermeier.android.jugsample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.meistermeier.android.jugsample.domain.Book;
import com.meistermeier.android.jugsample.util.BookBuilderUtil;

public class HelloJUGActivity extends ListActivity {

    private ArrayAdapter<Book> arrayAdapter;

    public static final String NAME = "NAME";
    public static final String ISBN = "ISBN";
    public static final String DESCRIPTION = "DESCRIPTION";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayAdapter = new ArrayAdapter<Book>(this, android.R.layout.simple_list_item_1);
        for (Book book : BookBuilderUtil.createSampleBooks()) {
            arrayAdapter.add(book);
        }
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Book selectedBook = (Book) l.getItemAtPosition(position);

        Intent detailIntent = new Intent(this, BookDetailActivity.class);
        detailIntent.putExtra(NAME, selectedBook.getName());
        detailIntent.putExtra(ISBN, selectedBook.getIsbn());
        detailIntent.putExtra(DESCRIPTION, selectedBook.getDescription());

        startActivity(detailIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent barcodeIntent = new Intent("com.google.zxing.client.android.SCAN");
        startActivityForResult(barcodeIntent, 1234);

        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            String result = data.getStringExtra("SCAN_RESULT");
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }
    }
}















