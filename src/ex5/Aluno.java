package ex5;

public class Aluno extends Pessoa {

    private double nota1, nota2;

    public Aluno(String nome, String cpf, double nota1, double nota2) {
        super(nome, cpf);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1>0 && nota1<10){
            this.nota1 = nota1;
        }else{
            throw new IllegalArgumentException("a nota precisa ser entre 0 e 10");
        }

    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2>0 && nota2<10){
            this.nota2 = nota2;
        }else{
            throw new IllegalArgumentException("a nota precisa ser entre 0 e 10");
        }
    }

    double calcularMedia(){
        return (nota1 * nota2) / 2;
    }

    String verificarSituacao(){
        if(calcularMedia()<5){
            return "Reprovado";
        }else if (calcularMedia()<7){
            return "Recuperacao";
        }else{
            return "Aprovado";
        }
    }

    @Override
    void exibirDadosResumidos(){
        System.out.println("Aluno | "
                + getNome() + " | CPF: "
                + getCpf() + " | Média: "
                + calcularMedia() + " | "
                + verificarSituacao());

    }
}

