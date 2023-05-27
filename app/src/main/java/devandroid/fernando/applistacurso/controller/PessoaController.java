package devandroid.fernando.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.fernando.applistacurso.model.Pessoa;

public class PessoaController {

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller","Salvo: "+pessoa.toString());
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller","Controller iniciada...");
        return super.toString();
    }
}
