package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.PrintWriter;


public class MainActivity extends AppCompatActivity {

    PrintWriter operando;

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;
    private Button boton_Punto;
    private Button boton_Esc;
    private Button boton_0;
    private Button boton_1;
    private Button boton_2;
    private Button boton_3;
    private Button boton_4;
    private Button boton_5;
    private Button boton_6;
    private Button boton_7;
    private Button boton_8;
    private Button boton_9;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    public MainActivity() {
    }


    public void boton_0(){
        operando.append("0");
    }
    public void boton_1(){
        operando.append("1");
    }
    public void boton_2(){
        operando.append("2");
    }
    public void boton_3(){
        operando.append("3");
    }
    public void boton_4(){
        operando.append("4");
    }
    public void boton_5(){
        operando.append("5");
    }
    public void boton_6(){
        operando.append("6");
    }
    public void boton_7(){
        operando.append("7");
    }
    public void boton_8(){
        operando.append("8");
    }
    public void boton_9(){
        operando.append("9");
    }
    public void boton_Punto(){
        operando.append(".");
    }
    public void boton_Esc(){
        finish();
    }
    public void finish(){
        Intent salida=new Intent( Intent.ACTION_MAIN);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);

        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( suma( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        btn_division = findViewById(R.id.button_9);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( division( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicacion( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( resta( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}