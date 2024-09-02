package aula20.exStatic;

public class Teste {
    public static void main(String[] args) {
        Conta c1 = new Conta("Joao", "123", 1000);
        c1.depositar(0);
        System.out.println(c1.verificaSaldo());


    }
}