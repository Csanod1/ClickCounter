package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private TextView szamTextView;
    private Button pluszGomb;
    private Button minuszGomb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        pluszGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ideiglenes;
                ideiglenes = Integer.valueOf(szamTextView.getText().toString());
                szamTextView.setText(Integer.toString(ideiglenes + 1));
                if (Integer.parseInt(szamTextView.getText().toString()) < 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.red));
                }else if (Integer.parseInt(szamTextView.getText().toString()) > 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.green));
                }else{
                    szamTextView.setTextColor(getResources().getColor( R.color.blue));
                }
            }
        });
        minuszGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ideiglenes;
                ideiglenes = Integer.valueOf(szamTextView.getText().toString());
                szamTextView.setText(Integer.toString(ideiglenes - 1));
                if (Integer.parseInt(szamTextView.getText().toString()) < 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.red));
                }else if (Integer.parseInt(szamTextView.getText().toString()) > 0){
                    szamTextView.setTextColor(getResources().getColor( R.color.green));
                }else{
                    szamTextView.setTextColor(getResources().getColor( R.color.blue));
                }
            }
        });
    }
    public void init(){
        this.relativeLayout = findViewById(R.id.relativeLayout);
        this.szamTextView = findViewById(R.id.szamTextView);
        this.pluszGomb = findViewById(R.id.pluszGomb);
        this.minuszGomb = findViewById(R.id.minuszGomb);
    }
}