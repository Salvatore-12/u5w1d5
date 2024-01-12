package salvatoreassennato.u5w1d5.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {
    @Getter
    private long id;
    private String descrizione;
    private Tipo tipo;
    private int massimoOccupanti;
    private Edificio edificio;
    private int day;

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
