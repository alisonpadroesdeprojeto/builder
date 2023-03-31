package builder;

public class CurriculoBuilder {

    private final Curriculo curriculo;

    public CurriculoBuilder() {
        this.curriculo = new Curriculo();
    }

    public Curriculo build() {
        if (curriculo.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (curriculo.getCargo().equals("")) {
            throw new IllegalArgumentException("Cargo desejado é obrigatório");
        }
        return curriculo;
    }

    public CurriculoBuilder setNome(String nome) {
        curriculo.setNome(nome);
        return this;
    }

    public CurriculoBuilder setCargo(String cargo) {
        curriculo.setCargo(cargo);
        return this;
    }

    public CurriculoBuilder setEmail(String email) {
        curriculo.setEmail(email);
        return this;
    }

    public CurriculoBuilder setExperiencia(String experiencia) {
        curriculo.setExperiencia(experiencia);
        return this;
    }

    public CurriculoBuilder setFormacaoAcademica(String formacaoAcademica) {
        curriculo.setFormacaoAcademica(formacaoAcademica);
        return this;
    }

    public CurriculoBuilder setHabilidades(String habilidades) {
        curriculo.setHabilidades(habilidades);
        return this;
    }

    public CurriculoBuilder setObjetivoCarreira(String objetivoCarreira) {
        curriculo.setHabilidades(objetivoCarreira);
        return this;
    }
}