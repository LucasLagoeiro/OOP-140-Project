package backend;

//definição do parametros 
public class Pessoa implements Imprimivel {
    private String nome;
    private Data dataNasc;
    private String cpf;
    private Endereco endereco;
    //construtores
    public Pessoa(String nome, Data dataNasc, String cpf, Endereco endereco) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    //gets
    public String getNome() {
        return nome;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //chama Interface
    @Override
    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc.getDia() + "/" + dataNasc.getMes() + "/" + dataNasc.getAno());
        System.out.println("CPF: " + cpf);
        endereco.imprime();
    }
}
    
    
