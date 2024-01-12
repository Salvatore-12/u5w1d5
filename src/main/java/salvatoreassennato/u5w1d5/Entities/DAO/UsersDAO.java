package salvatoreassennato.u5w1d5.Entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salvatoreassennato.u5w1d5.Entities.Users;

@Repository
public interface UsersDAO extends JpaRepository<Users,Long> {

}
