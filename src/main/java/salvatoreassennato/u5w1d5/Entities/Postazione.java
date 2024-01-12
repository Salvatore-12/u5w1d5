package salvatoreassennato.u5w1d5.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Postazione {
    @Getter
    private long id;
    private String descrizione;
    private Tipo tipo;
    private int massimoOccupanti;
    private Edificio edificio;
    private int day;

    public Postazione(String descrizione, Tipo tipo, int massimoOccupanti, Edificio edificio, int day) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.massimoOccupanti = massimoOccupanti;
        this.edificio = edificio;
        this.day = day;
    }

    @Override
    public String toString() {
        return "\n Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", massimoOccupanti=" + massimoOccupanti +
                ", edificio=" + edificio +
                ", day=" + day +
                '}';
    }
}
