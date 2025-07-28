public class Aluno extends Pessoa {
    
    private String curso;
    private double notaFinal;

    public Aluno() {
        super();
        this.curso = "";
        this.notaFinal = 0.0;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nCurso = " + curso + 
               "\nNota Final = " + notaFinal;
    }
    
}
