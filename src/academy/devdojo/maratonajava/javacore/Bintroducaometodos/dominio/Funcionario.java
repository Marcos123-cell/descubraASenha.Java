package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name = null;
    public int age = 0;
    public double[] salaries = null;

    public void imprime2(){
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries == null) {
            return;
        }
            for (double waze : salaries) {
                System.out.print(waze + " ");
            }

        imprimeMediaSalarial();


    }
    public void imprimeMediaSalarial(){
        if (salaries == null){
            return;
        }
        double media = 0;

        for(double waze : salaries){
            media += waze;
        }
        media /= salaries.length;

        System.out.println("\nMedia salarial: " + media);
    }

}
