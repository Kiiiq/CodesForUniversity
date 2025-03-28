package Questao2;

public class Funcionario {
    String funcao = "", nome="";
    int salario;

    public Funcionario(String funcao, int salario, String nome){
        this.funcao=funcao;
        this.salario=salario;
        this.nome=nome;
    }

    public void mostraFuncionario(){
        System.out.println("\nO funcionario "+ nome + " recebe R$ "+salario+"pela funcao de "+funcao);
    }

    public void ajustarSalario(){
        salario*=1.05;
    }
}

