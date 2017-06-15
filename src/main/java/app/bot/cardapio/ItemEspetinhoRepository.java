package app.bot.cardapio;

import org.springframework.data.repository.CrudRepository;

public interface ItemEspetinhoRepository extends CrudRepository<ItemEspetinho, Long> {

    public void delete(int t);
    
}