    public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao Tipo da operação: "subtracao", "multiplicacao"
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
    }
}

