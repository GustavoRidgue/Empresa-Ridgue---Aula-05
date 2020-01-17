package FuncinariosEmpresa;

public class Gerente extends Funcionarios{
    int numeroFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int cargo) {
        super(nome, cpf, salario, cargo);
    }



    public Gerente(String nome, String cpf, double salario, int cargo, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario, cargo);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }
    public double bonificacao(double salario) {
        salario = salario * 0.5;
        return salario;
}

}
