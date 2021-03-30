package br.com.igorlisboa.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Hello World!!!!!", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        setTitle("Lista de alunos");

        List<String> alunos = new ArrayList<>(Arrays.asList("João", "Igor", "Fernando", "Pedro", "João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro"));

        ListView listaAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));
    }
}
