package aula18.ex1;

public class Teste2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Amanda";
        p1.sobrenome = "Fleck";
        p1.altura = 167;
        p1.idade = 15;

        p1.andar();
        p1.correr();
        p1.parar();
        System.out.println(p1.obterDados());
    }
}
