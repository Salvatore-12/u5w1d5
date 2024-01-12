package salvatoreassennato.u5w1d5.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Edificio {
    @Getter
    private long id;

    private String nome;

    private String indirizzo;

    private String città;

    public Edificio(String nome, String indirizzo, String città) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.città = città;
    }

    @Override
    public String toString() {
        return "\n Edificio{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", città='" + città + '\'' +
                '}';
    }
}
