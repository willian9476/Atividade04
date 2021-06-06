package atividade;

public class Funcionario extends Pessoa {
	protected String cargo;
    protected double salario;

    public Funcionario(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(int idade, String nome, String cargo, double salario) {
        super(idade, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(int idade, String nome, String cpf, String cargo, double salario) {
        super(idade, nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }

}
