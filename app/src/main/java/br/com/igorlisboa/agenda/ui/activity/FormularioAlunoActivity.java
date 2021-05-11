package br.com.igorlisboa.agenda.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import br.com.igorlisboa.agenda.R;
import br.com.igorlisboa.agenda.dao.AlunoDao;
import br.com.igorlisboa.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo aluno";
    private EditText nomeAluno;
    private EditText telefoneAluno;
    private EditText emailAluno;

    private final AlunoDao alunoDao = new AlunoDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_formulario_aluno);
        setTitle(TITULO_APPBAR);
        inicializandoCampos();
        configuraBotaoSalvar();
    }

    private void configuraBotaoSalvar() {
        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno alunoCadastrado = criarAluno();
                salvar(alunoCadastrado);
            }
        });
    }

    private void inicializandoCampos() {
        nomeAluno = findViewById(R.id.activity_formulario_aluno_nome);
        telefoneAluno = findViewById(R.id.activity_formulario_aluno_telefone);
        emailAluno = findViewById(R.id.activity_formulario_aluno_email);
    }

    private void salvar(Aluno alunoCadastrado) {
        alunoDao.salvar(alunoCadastrado);
        finish();
    }

    @NonNull
    private Aluno criarAluno() {
        String nome = nomeAluno.getText().toString();
        String telefone = telefoneAluno.getText().toString();
        String email = emailAluno.getText().toString();

        Aluno alunoCadastrado = new Aluno(nome, telefone, email);
        return alunoCadastrado;
    }
}