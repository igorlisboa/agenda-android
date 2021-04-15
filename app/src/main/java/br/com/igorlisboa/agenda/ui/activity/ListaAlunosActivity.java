package br.com.igorlisboa.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.igorlisboa.agenda.R;
import br.com.igorlisboa.agenda.dao.AlunoDao;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Hello World!!!!!", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_lista_alunos);
        setTitle("Lista de alunos");

        AlunoDao alunoDao = new AlunoDao();

//        List<String> alunos = new ArrayList<>(Arrays.asList("João", "Igor", "Fernando", "Pedro", "João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro","João", "Igor", "Fernando", "Pedro"));

        ListView listaAlunos = findViewById(R.id.activity_lista_de_alunos_listview);
        listaAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunoDao.todos()));
    }
}
