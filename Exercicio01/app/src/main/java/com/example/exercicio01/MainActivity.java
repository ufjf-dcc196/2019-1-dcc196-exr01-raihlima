package com.example.exercicio01;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText sobrenome;
    EditText nomeCompleto;
    Button gerarNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nome_usuario);
        sobrenome = (EditText) findViewById(R.id.sobrenome_usuario);
        nomeCompleto = (EditText) findViewById(R.id.nome_completo);
        gerarNome = (Button) findViewById(R.id.botao_nome);

        gerarNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeCompleto.setText(nome.getText()+" "+sobrenome.getText());
            }
            });

    }
}
