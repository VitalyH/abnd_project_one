package com.example.android.owlsshop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void visitUs(View view) {
        Uri uri = Uri.parse("https://www.google.lv/maps/@56.938733,24.2080639,16.75z?hl=en");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void buyOwl(View view) {
        Uri uri = Uri.parse("http://www.owl-shop.lv");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void feedOwl(View view) {
        Uri uri = Uri.parse("https://www.barnowltrust.org.uk/support-us/donate/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
