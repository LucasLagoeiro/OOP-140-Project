package backend;

//definição do parametros 
public class Processo implements Imprimivel {
    private String nome;
    private float custoHora;
    private Operador operador;
    private Equipamento equipamento;
//construtores

    public Processo() {
    }
    
    public Processo(String nome, float custoHora, Operador operador, Equipamento equipamento) {
        this.nome = nome;
        this.custoHora = custoHora;
        this.operador = operador;
        this.equipamento = equipamento;
    }
//sets

    public void setCustoHora(float custoHora) {
        this.custoHora = custoHora;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }
    
//gets
    public String getNome() {
        return nome;
    }

    public float getCustoHora() {
        return custoHora;
    }

    public Operador getOperador() {
        return operador;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

//chama Interface    
 @Override
public void imprime() {
    System.out.println("Processo: " + nome);
    System.out.println("Custo por Hora: " + custoHora);
    System.out.println("Operador: " + operador.getCargo());
    System.out.println("Equipamento: " + equipamento.getNome());
}
}
