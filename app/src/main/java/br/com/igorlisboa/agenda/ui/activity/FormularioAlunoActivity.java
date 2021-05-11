package br.com.igorlisboa.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.igorlisboa.agenda.R;
import br.com.igorlisboa.agenda.dao.AlunoDao;
import br.com.igorlisboa.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        EditText nomeAluno = findViewById(R.id.activity_formulario_aluno_nome);
        EditText telefoneAluno = findViewById(R.id.activity_formulario_aluno_telefone);
        EditText emailAluno = findViewById(R.id.activity_formulario_aluno_email);

        AlunoDao alunoDao = new AlunoDao();

        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = nomeAluno.getText().toString();
                String telefone = telefoneAluno.getText().toString();
                String email = emailAluno.getText().toString();

                Aluno alunoCadastrado = new Aluno(nome, telefone, email);
                alunoDao.salvar(alunoCadastrado);

                finish();
            }
        });
    }
}