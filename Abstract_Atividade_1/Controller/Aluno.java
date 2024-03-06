package Controller;

public class Aluno extends Pessoa {
  private Matricula matricula;

  public Aluno(String cpf, String nome, Matricula matricula) {
    super(cpf, nome);
    this.matricula = matricula;
  }

  public Matricula getMatricula() {
    return this.matricula;
  }

  public void setMatricula(Matricula matricula) {
    if (matricula == null) {
      throw new Error("Matrícula não pode ser vazia");
    }

    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return super.toString() + "\nMatricula: " + this.matricula;
  }
}
