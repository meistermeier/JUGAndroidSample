package com.meistermeier.android.jugsample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Gerrit Meier
 */
public class BookDetailActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_detail);

        TextView nameView = (TextView) findViewById(R.id.book_name);
        TextView isbnView = (TextView) findViewById(R.id.book_isbn);
        TextView descriptionView = (TextView) findViewById(R.id.book_description);

        Bundle extras = getIntent().getExtras();
        String bookName = (String) extras.get(HelloJUGActivity.NAME);
        final String bookIsbn = (String) extras.get(HelloJUGActivity.ISBN);
        String bookDescription = (String) extras.get(HelloJUGActivity.DESCRIPTION);

        nameView.setText(bookName);
        isbnView.setText(bookIsbn);
        descriptionView.setText(bookDescription);

        Button onlineButton = (Button) findViewById(R.id.book_online_button);
        onlineButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("http://amzn.com/"+bookIsbn));
                startActivity(browserIntent);
            }
        });

    }
}