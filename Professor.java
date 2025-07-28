public class Professor extends Pessoa {
    
    private String disciplina;
    private double salario;

    public Professor() {
        super();
        this.disciplina = "";
        this.salario = 0.0;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nDisciplina = " + disciplina + 
               "\nSalário = " + salario;
    }
    
}
