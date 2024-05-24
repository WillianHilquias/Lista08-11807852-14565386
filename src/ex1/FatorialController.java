package ex1;
class FatorialController {
    public static long calcular(int n) {
        long resultado = 1;

        if (n < 0) {
            throw new IllegalArgumentException("ERRO: O número inserido foi: " + n + ", fatorial de número negativo");
        } else if (n > 20) {
            throw new IllegalArgumentException("ERRO: O número inserido foi " + n
                    + ", o fatorial do número apresenta resultado muito grande para ser calculado");
        } 
        else {
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            System.out.println("Fatorial de " + n + ": " + resultado);
        }

        return resultado;
    }
}