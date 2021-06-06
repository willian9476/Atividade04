package atividade;

public class Pessoa {
	protected int idade;
    protected String nome;
    protected String  cpf;

    public Pessoa() {
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa(int idade, String nome, String cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}
