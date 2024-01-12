package salvatoreassennato.u5w1d5.Exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(long id){
        super("il dato con "+id+" non è stato trovato");
    }
}
