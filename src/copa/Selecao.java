package copa;


public class Selecao {
    private String nome;
    private int vitorias, jogos, empates, derrotas, golFavor, golContra,
            saldoDeGols, codSelecao;

    private double aproveitamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolFavor() {
        return golFavor;
    }

    public void setGolFavor(int golFavor) {
        this.golFavor = golFavor;
    }

    public int getGolContra() {
        return golContra;
    }

    public void setGolContra(int golContra) {
        this.golContra = golContra;
    }

    public int getSaldoDeGols() {
        return saldoDeGols;
    }

    public void setSaldoDeGols(int saldoDeGols) {
        this.saldoDeGols = saldoDeGols;
    }

    public int getCodSelecao() {
        return codSelecao;
    }

    public void setCodSelecao(int saldoDeGols) {
        this.codSelecao = codSelecao;
    }

    public void setAproveitamento() {
        this.aproveitamento = aproveitamento;

    }

    public double getAproveitamento(){
        return aproveitamento;
    }

    public double calculoAproveitamento(int vitorias, int derrotas, int empates){
        int total = vitorias + derrotas + empates;

        return ((vitorias / total) * 100);
    }

}


