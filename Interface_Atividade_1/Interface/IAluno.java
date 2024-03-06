package Interface;

import Controller.Matricula;

public interface IAluno {
  public String getCPF();

  public String getNome();

  public Matricula getMatricula();

  public String toString();
}
