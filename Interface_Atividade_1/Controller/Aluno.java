package Controller;

import Interface.IAluno;

public class Aluno implements IAluno {
  private String cpf;
  private String nome;
  private Matricula matricula;

  public Aluno(String cpf, String nome, Matricula matricula) {
    this.cpf = cpf;
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getCPF() {
    return this.cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public Matricula getMatricula() {
    return this.matricula;
  }

  public void setCPF(String cpf) {
    if (cpf == "") {
      throw new Error("CPF não pode ser vazio");
    }

    this.cpf = cpf;
  }

  public void setNome(String nome) {
    if (nome == "") {
      throw new Error("Nome não pode ser vazio");
    }

    this.nome = nome;
  }

  public void setMatricula(Matricula matricula) {
    if (matricula == null) {
      throw new Error("Matrícula não pode ser vazia");
    }

    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nMatricula: " + this.matricula;
  }
}
