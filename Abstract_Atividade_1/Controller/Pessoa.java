package Controller;

public abstract class Pessoa {
  private String cpf;
  private String nome;

  public Pessoa(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  public String getCPF() {
    return this.cpf;
  }

  public void setCPF(String cpf) {
    if (cpf == "") {
      throw new Error("CPF não pode ser vazio");
    }

    this.cpf = cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    if (nome == "") {
      throw new Error("Nome não pode ser vazio");
    }

    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + "\nCPF: " + this.cpf;
  }
}
