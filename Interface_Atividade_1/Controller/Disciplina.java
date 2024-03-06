package Controller;

import java.util.ArrayList;

import Interface.IDisciplina;

public class Disciplina implements IDisciplina {
  private Curso curso;
  private String disciplina;
  private int id;
  private String periodo;

  ArrayList<String> matriculas = new ArrayList<>();

  public Disciplina(Curso curso, String disciplina, String periodo) {
    this.curso = curso;
    this.disciplina = disciplina;
    this.periodo = periodo;
  }

  public Curso getCurso() {
    return this.curso;
  }

  public String getDisciplina() {
    return this.disciplina;
  }

  public int getId() {
    return this.id;
  }

  public String getPeriodo() {
    return this.periodo;
  }

  public void setCurso(Curso curso) {
    if (curso == null) {
      throw new Error("Curso não pode ser vazio");
    }

    this.curso = curso;
  }

  public void setDisciplina(String disciplina) {
    if (disciplina == "") {
      throw new Error("Disciplina não pode ser vazia");
    }

    this.disciplina = disciplina;
  }

  public void setId(int id) {
    if (id < 0) {
      throw new Error("ID não pode ser vazio");
    }

    this.id = id;
  }

  public void setPeriodo(String periodo) {
    if (periodo == "") {
      throw new Error("Período não pode ser vazio");
    }

    this.periodo = periodo;
  }

  public void setMatricula(Matricula matricula) {
    if (matricula == null) {
      throw new Error("Matrícula não pode ser vazia");
    }

    matriculas.add(matricula.getMatricula());
  }

  @Override
  public String toString() {
    return "\nCurso: " + this.curso + "\nDisciplina: " + this.disciplina + "\nPeriodo: "
        + this.periodo + "\nMatriculas: " + this.matriculas;
  }
}
