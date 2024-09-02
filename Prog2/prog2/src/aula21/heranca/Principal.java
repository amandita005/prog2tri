package aula21.heranca;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("maria", "oliveira");
        m1.setNome("maria");
        m1.setSobrenome("olivera");
        m1.setSalario(3000);

        m1.setCnh("565758");

        Engenheiro e1 = new Engenheiro("Jose", "antonio");
        e1.setCrea("12345");
    }
}
