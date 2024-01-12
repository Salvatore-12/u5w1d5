package salvatoreassennato.u5w1d5.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Getter
@NoArgsConstructor
public class Prenotazione {
    private long id;
    private LocalDate dayPrenotazione;
    private Postazione postazione;
    private  Users users;


    public Prenotazione(LocalDate dayPrenotazione, Postazione postazione, Users users) {
        this.dayPrenotazione = dayPrenotazione;
        this.postazione = postazione;
        this.users = users;
    }

    public void setDayPrenotazione(LocalDate dayPrenotazione) {
        this.dayPrenotazione = dayPrenotazione;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "\n Prenotazione{" +
                "id=" + id +
                ", dayPrenotazione=" + dayPrenotazione +
                ", postazione=" + postazione +
                ", users=" + users +
                '}';
    }
}
