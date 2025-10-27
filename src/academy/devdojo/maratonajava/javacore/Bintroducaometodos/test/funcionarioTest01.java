package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
//import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.impressoraFuncionario;


public class funcionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();



        funcionario.name = "Marcos";
        funcionario.age = 18;
        funcionario.salaries = new double[]{2500, 1700, 3000};

        funcionario.imprime2();
        //funcionario.imprimeMediaSalarial();




    }
}
