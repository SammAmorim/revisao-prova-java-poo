public enum Setor2 {

    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material Construção"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimentício");

    protected String nome;

    Setor2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
