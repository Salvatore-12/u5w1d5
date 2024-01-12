package salvatoreassennato.u5w1d5.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Postazione {
    @Getter
    private long id;
    private String descrizione;
    private TipoPostazione tipo;
    private int massimoOccupanti;
    private Edificio edificio;
    private List<Prenotazione> prenotazioni=new ArrayList<>();


    public Postazione(String descrizione, TipoPostazione tipo, int massimoOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.massimoOccupanti = massimoOccupanti;
        this.edificio = edificio;

    }

    public Postazione(String descrizione, TipoPostazione tipo, int massimoOccupanti, Edificio edificio, List<Prenotazione> prenotazioni) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.massimoOccupanti = massimoOccupanti;
        this.edificio = edificio;
        this.prenotazioni = prenotazioni;
    }

    @Override
    public String toString() {
        return "\n Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", massimoOccupanti=" + massimoOccupanti +
                ", edificio=" + edificio +
                '}';
    }
}
