public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao Tipo da operação: "soma"
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return a + b;
            
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
    }
}

