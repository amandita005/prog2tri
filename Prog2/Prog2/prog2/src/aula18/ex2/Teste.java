package aula18.ex2;

public class Teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Joao";
        a1.sobrenome = "Souza";
        a1.eMail = "jooasouza@gmail.com";
        a1.codigo = 1234;
        a1.notaUm = 5;
        a1.notaDois = 9;

        System.out.println("O aluno "+a1.nome+" "+ a1.sobrenome+" teve "+a1.obterMedia()+" e "+ a1.obterStatus());
    }
}
