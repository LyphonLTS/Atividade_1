import java.util.ArrayList;
import java.util.Scanner;

import Controller.Aluno;
import Controller.Curso;
import Controller.Disciplina;
import Controller.Matricula;

public class Atividade_1 {

  public static void main(String[] args) {
    // Criando variável controladora
    int count = 0;
    // Criando um curso manualmente
    Curso curso = new Curso("TSI");
    // Criando duas disciplinas manualmente
    Disciplina poo = new Disciplina(curso, "POO", "3º Período");
    Disciplina pp = new Disciplina(curso, "PP", "5º Período");
    // Criando um array de alunos
    ArrayList<Aluno> alunos = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    do {
      System.out.print("Digite o nome do aluno: ");
      String nomeAluno = scan.nextLine();

      System.out.print("Digite o CPF do aluno: ");
      String cpfAluno = scan.nextLine();

      System.out.print("Digite a matricula do aluno: ");
      String matriculaAluno = scan.nextLine();

      System.out.println("Digite a disciplina do aluno: ");
      String disciplinaAluno = scan.nextLine().toUpperCase();

      System.out.println("\n" + count);
      System.out.println("\n" + matriculaAluno);

      switch (disciplinaAluno) {
        case "POO":
          // idDisciplinaAluno = count;
          poo.setMatricula(new Matricula(count + 1, matriculaAluno));
          break;

        case "PP":
          // idDisciplinaAluno = count;
          pp.setMatricula(new Matricula(count + 1, matriculaAluno));
          break;

        default:
          break;
      }

      alunos.add(new Aluno(cpfAluno, nomeAluno, new Matricula(count + 1, matriculaAluno)));

      System.out.println("");

      count++;

    } while (count < 2);

    scan.close();

    System.out.println(poo.toString() + "\n");
    System.out.println(pp.toString() + "\n");
    System.out.println(alunos.get(0).toString() + "\n");
    System.out.println(alunos.get(1).toString() + "\n");
  }
}
