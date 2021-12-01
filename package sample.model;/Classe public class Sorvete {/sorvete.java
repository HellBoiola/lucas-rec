package sample.model;

//Classe
public class Sorvete {

    //atributos
    private String nome;
    private String sabor;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Sorvete{" +
                "nome='" + nome + '\'' +
                ", sabor='" + sabor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
