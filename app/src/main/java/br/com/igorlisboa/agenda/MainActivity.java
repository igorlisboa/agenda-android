package br.com.igorlisboa.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Hello World!!!!!", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);

        List<String> listaAlunos = new ArrayList<>(Arrays.asList("João", "Igor", "Fernando", "Pedro"));

        TextView firstName = findViewById(R.id.textView4);
        TextView secondName = findViewById(R.id.textView);
        TextView thirdName = findViewById(R.id.textView2);
        TextView fourthName = findViewById(R.id.textView3);

        firstName.setText(listaAlunos.get(0));
        secondName.setText(listaAlunos.get(1));
        thirdName.setText(listaAlunos.get(2));
        fourthName.setText(listaAlunos.get(3));
    }
}
