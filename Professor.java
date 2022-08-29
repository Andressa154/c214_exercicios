
package exercicio;


public class Professor {
    private String nome;
    private String horario_atendimento;
    private String periodo;

    public Professor (String nome, String horario_atendimento, String periodo){
        this.nome = nome;
        this.horario_atendimento = horario_atendimento;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario_atendimento() {
        return horario_atendimento;
    }

    public void setHorario_atendimento(String horario_atendimento) {
        this.horario_atendimento = horario_atendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
    
}
