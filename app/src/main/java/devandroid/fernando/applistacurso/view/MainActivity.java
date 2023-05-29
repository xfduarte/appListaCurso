package devandroid.fernando.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import devandroid.fernando.applistacurso.R;
import devandroid.fernando.applistacurso.controller.CursoController;
import devandroid.fernando.applistacurso.controller.PessoaController;
import devandroid.fernando.applistacurso.model.Curso;
import devandroid.fernando.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    List<String> nomeCursos;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    Spinner spinner;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa("", "", "", "");
        PessoaController pessoaController = new PessoaController(MainActivity.this);
        pessoaController.buscar(pessoa);

        CursoController cursoController = new CursoController();
        nomeCursos = cursoController.dadosParaSpinner();

        Toast.makeText(MainActivity.this, "Inicio " + pessoaController, Toast.LENGTH_LONG).show();

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);
        spinner = findViewById(R.id.spinner);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        //Adapter
        //Layout
        //Injetar o Adapter ao Spinner - A lista será gerada
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cursoController.dadosParaSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

/*        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");
            }
        });*/
        btnLimpar.setOnClickListener((View v) -> {
            editPrimeiroNome.setText("");
            editSobrenome.setText("");
            editNomeCurso.setText("");
            editTelefoneContato.setText("");

            pessoaController.limpar();
        });

/*        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo " + pessoa, Toast.LENGTH_LONG).show();

                pessoaController.salvar(pessoa);
            }
        });*/
        btnSalvar.setOnClickListener((View v) -> {
            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobreNome(editSobrenome.getText().toString());
            pessoa.setCursoDesejado(editNomeCurso.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

            Toast.makeText(MainActivity.this, "Salvo " + pessoa, Toast.LENGTH_LONG).show();

            pessoaController.salvar(pessoa);
        });

/*        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte sempre!", Toast.LENGTH_LONG).show();
                finish();
            }
        });*/
        btnFinalizar.setOnClickListener((View v) -> {
            Toast.makeText(MainActivity.this, "Volte sempre!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}