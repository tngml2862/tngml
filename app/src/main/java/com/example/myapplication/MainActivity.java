package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"나는 희야야",Toast.LENGTH_SHORT).show();

        EditText editId= (EditText)findViewById(R.id.edit_id);
        EditText editPassword= (EditText)findViewById(R.id.edit_password);
        Button btnLogin= (Button)findViewById(R.id.btn_login);

        editId.setText(">_<");
        editId.setTextColor(0xFFF000);
        editId.setTextSize(TypedValue.COMPLEX_UNIT_SP,70);
    }

}
