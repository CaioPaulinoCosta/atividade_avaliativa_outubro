public class Time {
    private String nome;
    private int pontos;
    private int saldoGols;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.saldoGols = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void atualizarResultado(int golsFeitos, int golsSofridos) {
        saldoGols += (golsFeitos - golsSofridos);
        if (golsFeitos > golsSofridos) {
            pontos += 3;
        } else if (golsFeitos == golsSofridos) {
            pontos += 1;
        }
    }
}
