package Controller;

public class Matricula {
  private int id;
  private String matricula;
  private int idDisciplina;

  public Matricula(int idDisciplina, String matricula) {
    if (idDisciplina <= 0 || matricula == "") {
      throw new Error("Matrícula não pode conter campos vazios teste");
    }

    this.idDisciplina = idDisciplina;
    this.matricula = matricula;
  }

  public int getId() {
    return this.id;
  }

  public int getIdDisciplina() {
    return this.idDisciplina;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setId(int id) {
    if (id == 0) {
      throw new Error("ID não pode ser vazio");
    }

    this.id = id;
  }

  public void setIdDisciplina(int idDisciplina) {
    if (idDisciplina == 0) {
      throw new Error("A chave da disciplina não pode ser vazia");
    }

    this.idDisciplina = idDisciplina;
  }

  public void setMatricula(String matricula) {
    if (matricula == "") {
      throw new Error("Matrícula não pode ser vazia");
    }

    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return "Disciplina: " + this.idDisciplina + "\nMatrícula: " + this.matricula;
  }
}
