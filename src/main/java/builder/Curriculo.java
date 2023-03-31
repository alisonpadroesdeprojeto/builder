package builder;

public class Curriculo {
    private String nome;
    private String cargo;
    private String email;
    private String experiencia;
    private String formacaoAcademica;
    private String habilidades;
    private String objetivoCarreira;

    public Curriculo() {
        this.nome = "";
        this.cargo = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getObjetivoCarreira() {
        return objetivoCarreira;
    }

    public void setObjetivoCarreira(String objetivoCarreira) {
        this.objetivoCarreira = objetivoCarreira;
    }
}