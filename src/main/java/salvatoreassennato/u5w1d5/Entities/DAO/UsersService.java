package salvatoreassennato.u5w1d5.Entities.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UsersDAO usersDAO;
}
