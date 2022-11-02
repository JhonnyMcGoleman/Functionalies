package com.example.functionalies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        link=findViewById(R.id.link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
                link.setTextColor(getResources().getColor(R.color.dark_blue));

            }
        });


    }
    public void enviar(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}