package Questao2;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    

    public static void main(String[] args) {
       
        Funcionario[] funcionarios = new Funcionario[5];
       
        registrarFuncionarios(funcionarios);
        mostrarFuncionarios(funcionarios);
        ajustarSalarios(funcionarios);
        mostrarFuncionarios(funcionarios);
        


    }
    
    public static void registrarFuncionarios(Funcionario[] funcionarios){
        HashMap<String,Integer> salarioMap = new HashMap<String,Integer>();
        Scanner scanner = new Scanner(System.in);
        String nomeString, funcaoString;
        int tempSal;

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite seu nome:");
            nomeString=scanner.nextLine();
            System.out.println("Digite sua funcao:");
            funcaoString=scanner.nextLine();
            if (salarioMap.containsKey(funcaoString)) {
                tempSal=salarioMap.get(funcaoString);
            } else {
                System.out.println("Qual o salario dessa funcao:");
                tempSal=scanner.nextInt();
                scanner.nextLine();
                salarioMap.put(funcaoString, tempSal);
            }

            funcionarios[i]= new Funcionario(funcaoString,salarioMap.get(funcaoString),nomeString);
        }
        scanner.close();
    }

    public static void mostrarFuncionarios(Funcionario[] funcionarios){
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].mostraFuncionario();
        }
    }

    public static void ajustarSalarios(Funcionario[] funcionarios){
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].ajustarSalario();
        }
    }
}
