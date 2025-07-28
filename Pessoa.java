public class Pessoa {
    private String nome;
    private String telefone;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
        this.nome = "";
        this.telefone = "";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Nome = " + nome + 
                "\nTelefone = " + telefone + 
                "\nIdade = " + idade +
                "\nAltura = " + altura +
                "\nPeso = " + peso;
    }

}
