package com.example.andre.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ANDRE on 04/11/2016.
 */
public class LoginActivity extends Activity {
    private static final String TAG ="com.example.andre.activities.LoginActivity" ;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin= (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMain();
            }
        });
    }

    private void gotoMain() {
        Intent intent = new Intent(LoginActivity.this,
                AccountActivity.class);
        startActivity(intent);
        finish();
    }
}
