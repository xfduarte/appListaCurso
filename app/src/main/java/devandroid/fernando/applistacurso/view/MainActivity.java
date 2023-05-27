package devandroid.fernando.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.fernando.applistacurso.R;
import devandroid.fernando.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa("","","","");
        pessoa.setPrimeiroNome("Fernando");
        pessoa.setSobreNome("Duarte");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("47-999553107");
        pessoa.toString();
        int parada = 0;
    }
}