package devandroid.fernando.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.fernando.applistacurso.model.Curso;

public class CursoController {

    private List listaCursoDesejado;

    public List getListaCursoDesejado(){

        listaCursoDesejado = new ArrayList<>();

        listaCursoDesejado.add(new Curso("Java"));
        listaCursoDesejado.add(new Curso("HTML"));
        listaCursoDesejado.add(new Curso("C#"));
        listaCursoDesejado.add(new Curso("Python"));
        listaCursoDesejado.add(new Curso("PHP"));
        listaCursoDesejado.add(new Curso("Flutter"));
        listaCursoDesejado.add(new Curso("Dart"));
        return listaCursoDesejado;
    }

    public ArrayList<String> dadosParaSpinner() {

        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getListaCursoDesejado().size(); i++) {
            Curso objeto = (Curso) getListaCursoDesejado().get(i);
            dados.add(objeto.getNomeCurso());
        }
        return dados;
    }

}
