public class Jogo {
    private Time timeCasa;
    private Time timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public Jogo(Time timeCasa, Time timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    public void setResultado(int golsCasa, int golsVisitante) {
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
        timeCasa.atualizarResultado(golsCasa, golsVisitante);
        timeVisitante.atualizarResultado(golsVisitante, golsCasa);
    }
}
