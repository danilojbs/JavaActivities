package model;

public class Produto {

    private String nome;    
    private Integer codigo;
    private float valor;
    private float preco;

    public Produto(String nome, Integer codigo, float valor) {
        setNome(nome);
        setCodigo(codigo);
        setValor(valor);
        setPreco(calcularPreco(valor));
    }
    
    public float calcularPreco(float valor){
        this.preco = (float) (1.2 * valor);
        return preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    
}
