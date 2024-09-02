package aula19;

import java.util.Random;
public class Conta {

    float saldo;
    String titular;
    String identificador;
    String senha;

    public Conta(String titular, String senha, float saldo){
        geraIdentificador();
        this.titular=titular;
        this.saldo=saldo;
        this.senha = senha;
    }

    public Conta(String titular){
        geraIdentificador();
        this.titular = titular;
    }
    void geraIdentificador(){
        String texto = "";
        for(int i=0;i<4;i++){
            texto+=(char) new Random().nextInt(91);
        }
        int valor = new Random().nextInt(10000);
        identificador = texto+valor;
    }
    void depositar(float valor){
        this.saldo+=saldo;
    }
    boolean sacar(float valor){
        if(valor<=saldo){
            saldo-=valor;
            return true;
        }
        return false;
    }

    String verificaSaldo(){
        return ("Saldo atual R$ " + saldo);
    }


}
