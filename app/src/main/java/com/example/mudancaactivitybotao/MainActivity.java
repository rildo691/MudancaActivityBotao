package com.example.mudancaactivitybotao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_redirecciona;
    Button btn_mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mensagem = (Button) findViewById(R.id.btn_mensagem);
        btn_redirecciona = (Button) findViewById(R.id.btn_redirecciona);

        btn_mensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Botão clicado", Toast.LENGTH_SHORT).show();
            }
        });

        btn_redirecciona.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent segundaTela = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(segundaTela);
            }
        });
    }
}