package Controller;

public class Curso {
  private int id;
  private String curso;

  public Curso(String curso) {
    this.curso = curso;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    if (curso == "") {
      throw new Error("Curso não pode ser vazio");
    }

    this.curso = curso;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    if (id < 0) {
      throw new Error("ID não pode ser vazio");
    }

    this.id = id;
  }

  @Override
  public String toString() {
    return this.curso;
  }
}
