package Calculadora;

public class Calculadora {
    public double adicao(double numeroUm, double numeroDois){
        return numeroUm + numeroDois;
    }

    public double subtracao(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicacao(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double divisao(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN; 
        }
        return numeroUm / numeroDois;
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; 
        }
        return Math.sqrt(numero);
    }
}
