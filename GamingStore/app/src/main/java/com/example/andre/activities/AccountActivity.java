package com.example.andre.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ANDRE on 23/11/2016.
 */
public class AccountActivity extends Activity {
    private static final String TAG ="com.example.andre.activities.AccountActivity" ;
    private Button btnStore;
    private Button btnNews;
    private Button btnWishlist;
    private Button btnApps;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        btnStore= (Button)findViewById(R.id.btnStore);
        btnNews=(Button)findViewById(R.id.btnNews);
        btnWishlist=(Button)findViewById(R.id.btnWishlist);
        btnApps=(Button)findViewById(R.id.btnMyApps);
        btnBack=(Button)findViewById(R.id.btnBack);

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMain();
            }
        });

        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoNews();
            }
        });

        btnWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoWishlist();
            }
        });

        btnApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoApps();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSesion();
            }
        });
    }

    private void gotoMain() {
        Intent intent = new Intent(AccountActivity.this,
                MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void gotoNews() {
        Intent intent = new Intent(AccountActivity.this,
                NewsActivity.class);
        startActivity(intent);
        finish();
    }

    private void gotoWishlist() {
        Intent intent = new Intent(AccountActivity.this,
                WishlistActivity.class);
        startActivity(intent);
        finish();
    }

    private void gotoApps() {
        Intent intent = new Intent(AccountActivity.this,
                AppsActivity.class);
        startActivity(intent);
        finish();
    }

    private void closeSesion() {
        Intent intent= new Intent(AccountActivity.this,
                LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
