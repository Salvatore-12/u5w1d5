package salvatoreassennato.u5w1d5.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class Users {
   @Getter
   private long id;
   private String username;
   private String nomeCompleto;
   private String email;
   private List<Prenotazione> prenotazioni=new ArrayList<>();

   public Users(String username, String nomeCompleto, String email) {
      this.username = username;
      this.nomeCompleto = nomeCompleto;
      this.email = email;
   }

   @Override
   public String toString() {
      return "\n User{" +
              "id=" + id +
              ", username='" + username + '\'' +
              ", nomeCompleto='" + nomeCompleto + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}
