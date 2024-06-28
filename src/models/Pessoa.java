package models;

public class Pessoa {
    
    private int codigo;
    private String nome, rua, cidade;
    
    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }


    public int getCodigo() {
        return codigo;
    }
    
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getRua() {
        return rua;
    }
    
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    
    public String getCidade() {
        return cidade;
    }
    
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //-------------------------toCSV Args
    public String toCSV(){
        return getCodigo() + ";" + getNome() + ";" + getRua() + ";" + getCidade() + "\n"; 
    }

}