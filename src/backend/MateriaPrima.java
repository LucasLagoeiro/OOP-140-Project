package backend;

//definição do parametros 
public class MateriaPrima  implements Imprimivel{
    private String nome;
    private String unidade;
    private String fornecedor;
    private float preco;

//construtores
    public MateriaPrima(String nome, String unidade, String fornecedor, float preco){
        this.nome = nome;
        this.unidade = unidade;
        this.fornecedor = fornecedor;
        this.preco = preco;
    }

//gets 
    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public float getPreco() {
        return preco;
    }
 //chama Interface   
   @Override
    public void imprime() {
        System.out.println("Matéria-Prima: " + nome);
        System.out.println("Unidade: " + unidade);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Preço: " + preco);
    }
}