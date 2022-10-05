package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvresultado;
    float numero1=0.0f;
    float numero2=0.0f;
    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvresultado=findViewById(R.id.tvresultado);
    }

    public void escribir7(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("7");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"7");
        }
    }

    public void escribir8(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("8");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"8");
        }
    }

    public void limpiarresultado(View view) {
        tvresultado.setText("0");
        numero1=0.0f;
        numero2=0.0f;
        operacion="";
    }

    public void dividir(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        operacion="/";
        tvresultado.setText("0");

    }

    public void mostrarresultado(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (operacion.equals("/"))
        {
            if (valor==0.0f)
            {
                Toast.makeText(this,"Operacion no valida",Toast.LENGTH_LONG).show();
            }
            else
            {
                float result=numero1/valor;
                tvresultado.setText(result+"");
            }
        }
        else if(operacion.equals("*")){
            float result=numero1*valor;
            tvresultado.setText(result+"");
        }
        else if(operacion.equals("+")){
            float result=numero1+valor;
            tvresultado.setText(result+"");
        }
        else if(operacion.equals("-")){
            float result=numero1-valor;
            tvresultado.setText(result+"");
        }
    }

    public void escribe9(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("9");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"9");
        }
    }

    public void multiplicar(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        operacion="*";
        tvresultado.setText("0");
    }

    public void escribir4(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("4");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"4");
        }
    }

    public void escribe5(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("5");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"5");
        }
    }

    public void escribe6(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("6");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"6");
        }
    }

    public void resta(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        operacion="-";
        tvresultado.setText("0");
    }

    public void escribe3(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("3");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"3");
        }
    }

    public void escribe2(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("2");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"2");
        }
    }

    public void escribe1(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("1");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"1");
        }
    }

    public void suma(View view) {
        numero1 = Float.parseFloat(tvresultado.getText().toString());
        operacion="+";
        tvresultado.setText("0");
    }

    public void escribe0(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText("0");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"0");
        }
    }

    public void escribepunto(View view) {
        float valor = Float.parseFloat(tvresultado.getText().toString());
        if (valor==0.0f){
            tvresultado.setText(".");
        }
        else{
            tvresultado.setText(tvresultado.getText()+"");
        }
    }
}