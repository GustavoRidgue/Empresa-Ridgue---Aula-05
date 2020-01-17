package FuncinariosEmpresa;

public class App {
    public static void main(String[] args) {

        Funcionarios funcionario = new Funcionarios(
                "Maicon",
                "5376573/8",
                200000.00,
                0
        );
        Gerente gerente = new Gerente(
                "Gustavo",
                "32435425/7",
                100000.00,
                1
        );

        System.out.println(funcionario.bonificacao(funcionario.salario));
        System.out.println(gerente.bonificacao(gerente.salario));


    }
}
