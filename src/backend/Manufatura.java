package backend;

//definição do parametros 
public class Manufatura implements Imprimivel {
    private Processo processo;
    private float qtde;
//construtores
    public Manufatura(Processo processo, float qtde) {
        this.processo = processo;
        this.qtde = qtde;
    }
//gets
    public Processo getProcesso() {
        return processo;
    }

    public float getQtde() {
        return qtde;
    }
//chama Interface
    @Override
    public void imprime() {
        System.out.println("Manufatura: " + processo.getNome());
        System.out.println("Quantidade: " + qtde);
    }
}