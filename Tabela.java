import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Tabela {
    private List<Time> times;

    public Tabela(List<Time> times) {
        this.times = times;
    }

    public Time getLider() {
        return times.stream()
                    .max(Comparator.comparing(Time::getPontos)
                                   .thenComparing(Time::getSaldoGols))
                    .orElse(null);
    }

    public Time getLanterna() {
        return times.stream()
                    .min(Comparator.comparing(Time::getPontos)
                                   .thenComparing(Time::getSaldoGols))
                    .orElse(null);
    }

    public List<Time> getZonaDeRebaixamento() {
        return times.stream()
                    .sorted(Comparator.comparing(Time::getPontos)
                                      .thenComparing(Time::getSaldoGols))
                    .limit(4)
                    .collect(Collectors.toList());
    }

    public Time getTime(String nome) {
        return times.stream()
                    .filter(t -> t.getNome().equals(nome))
                    .findFirst()
                    .orElse(null);
    }
}
