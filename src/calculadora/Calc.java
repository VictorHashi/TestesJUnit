package calculadora;

import java.util.Arrays;

public class Calc {
    public static double Media(double[] valores){
        double soma = 0;
        for (double valor : valores){
            soma += valor;
        }
        return soma / valores.length;
    }

    public static double Moda(double[] valores){

        int cont = 1;
        int max = 1;

        Arrays.sort(valores);

        double moda = valores[0];

        for (int i = 1; i < valores.length; i++){
            if (valores[i] == valores[i-1])
                cont++;
            else
                cont = 1;
            if (cont > max){
                max = cont;
                moda = valores[i];
            }
        }
        return moda;

    }

    public static double Mediana(double[] valores){
        Arrays.sort(valores);
        if (valores.length % 2 == 1)
            return valores[(int) Math.floor(valores.length/2)];
        return (valores[valores.length/2]+valores[valores.length/2+ 1])/2;
    }

    public static double Variancia(double[] valores) {
        double media = Media(valores);
        double somatorio = 0;
        for (double valor : valores) {
            somatorio += Math.pow(valor - media, 2);
        }
        double variancia = somatorio/(valores.length);
        return variancia;
    }

    public static double DesvioPadrao(double[] valores) {
        double desvio = Math.sqrt(Variancia(valores));
        return desvio;
    }

}
