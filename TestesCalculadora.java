public class TestesCalculadora {
    public static void main(String[] args) {
        testarResultado("2 + 2", Soma.somar(2, 2), 4);
        testarResultado("5 - 3", Subtracao.subtrair(5, 3), 2);
        testarResultado("4 * 3", Multiplicacao.multiplicar(4, 3), 12);
        testarResultado("10 / 2", Divisao.dividir(10, 2), 5);
        testarDivisaoPorZero();

        System.out.println("Todos os testes automatizados passaram.");
    }

    private static void testarResultado(String caso, double obtido, double esperado) {
        if (Double.compare(obtido, esperado) != 0) {
            throw new AssertionError(caso + " falhou. Esperado: " + esperado + ", obtido: " + obtido);
        }

        System.out.println("[OK] " + caso + " = " + obtido);
    }

    private static void testarDivisaoPorZero() {
        try {
            Divisao.dividir(10, 0);
            throw new AssertionError("10 / 0 falhou. Era esperado erro.");
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] 10 / 0 retornou erro: " + e.getMessage());
        }
    }
}
