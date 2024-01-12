package salvatoreassennato.u5w1d5.Entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salvatoreassennato.u5w1d5.Entities.Edificio;
@Repository
public interface EdificioDAO extends JpaRepository<Edificio,Long> {
}
