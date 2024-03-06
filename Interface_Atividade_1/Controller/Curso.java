package Controller;

import Interface.ICurso;

public class Curso implements ICurso {
  private int id;
  private String curso;

  public Curso(String curso) {
    this.curso = curso;
  }

  public int getId() {
    return this.id;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setId(int id) {
    if (id < 0) {
      throw new Error("ID não pode ser vazio");
    }

    this.id = id;
  }

  public void setCurso(String curso) {
    if (curso == "") {
      throw new Error("Curso não pode ser vazio");
    }

    this.curso = curso;
  }

  @Override
  public String toString() {
    return this.curso;
  }
}
