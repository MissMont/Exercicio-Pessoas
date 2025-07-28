public class Saida {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        
        pessoa.setNome("João");
        pessoa.setTelefone("123456789");
        pessoa.setIdade(30);
        pessoa.setAltura(1.75);
        pessoa.setPeso(70.0);
        System.out.println("\nInformações da Pessoa:");
        System.out.println(pessoa.toString());

        professor.setNome("Maria");
        professor.setTelefone("987654321");
        professor.setIdade(45);
        professor.setAltura(1.65);
        professor.setPeso(65.0);
        professor.setDisciplina("Matemática");
        professor.setSalario(5000.0);
        System.out.println("\nInformações do Professor:");
        System.out.println(professor.toString());
        
        aluno.setNome("Carlos");
        aluno.setTelefone("555555555");
        aluno.setIdade(20);
        aluno.setAltura(1.80);
        aluno.setPeso(75.0);
        aluno.setCurso("Engenharia");
        aluno.setNotaFinal(9.5);
        System.out.println("\nInformações do Aluno:");
        System.out.println(aluno.toString());


    }

}
