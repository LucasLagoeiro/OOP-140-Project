package backend;

//definição do parametros 
public class Operador extends Pessoa {
    private final String cargo;
    private final float salarioHora;
//construtores
    public Operador(String nome, Data dataNasc, String cpf, Endereco endereco, String cargo, float salarioHora) {
        super(nome, dataNasc, cpf, endereco);
        this.cargo = cargo;
        this.salarioHora = salarioHora;
    }
    //gets
    public String getCargo() {
        return cargo;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    //chama Interface
    @Override
    public void imprime() {
        super.imprime(); // Chama o método imprime da classe Pessoa
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário por Hora: " + salarioHora);
    }
}