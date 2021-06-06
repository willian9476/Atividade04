package atividade;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	List<Vendedor> vendedores = new ArrayList<>();
    protected double comissaoGerente;
    protected String setor;
    protected  double comissaoTotalGerente;

    public Gerente(int idade, String nome, String cpf, String cargo, double salario, double comissaoGerente, String setor, double comissaoTotalGerente) {
        super(idade, nome, cpf, cargo, salario);
        this.comissaoGerente = comissaoGerente;
        this.setor = setor;
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public double getComissaoGerente() {
        return comissaoGerente;
    }

    public void setComissaoGerente(double comissaoGerente) {
        this.comissaoGerente = comissaoGerente;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getComissaoTotalGerente() {
        for(int i = 0; i < vendedores.size(); i++){
            comissaoTotalGerente += vendedores.get(i).totalVendas * comissaoGerente;
        }
        return comissaoTotalGerente;
    }

    public void setComissaoTotalGerente(double comissaoTotalGerente) {
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    @Override
    public double getSalario() {
        salario += comissaoTotalGerente;
        return salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "vendedores=" + vendedores +
                ", comissaoGerente=" + comissaoGerente +
                ", setor='" + setor + '\'' +
                ", comissaoTotalGerente=" + comissaoTotalGerente +
                "} " + super.toString();
    }

}
