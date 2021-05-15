package model;

public class Perecivel extends Produto{
    
    private Integer validade;

    public Perecivel(String nome, Integer codigo, float valor, Integer validade) {
        super(nome, codigo, valor);
        
        setNome(nome);
        setCodigo(codigo);
        setValor(valor);
        setPreco(calcularPreco(valor));
        setValidade(validade);
        
    }
    
    
    public float calcularPrecoPerecivel(float valor){
         preco = (float) (1.4 * valor);
        return preco;
    }
    
    public Integer getValidade(){
        return this.validade;
    }
    
    public void setValidade(Integer validade){
        this.validade = validade;
    }
    
    
    
}
