package aula18.ex1;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "luis";
        p1.sobrenome = "henrique";
        p1.altura = 160;
        p1.idade = 22;

        p1.andar();
        p1.correr();
        p1.parar();
        System.out.println(p1.obterDados());
    }
}
