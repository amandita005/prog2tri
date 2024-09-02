package aula22.polimorfismo.override;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        System.out.println(p1.obterDados());
        System.out.println(p1);

        Aluno a1 = new Aluno();

        System.out.println(a1);
    }
}
