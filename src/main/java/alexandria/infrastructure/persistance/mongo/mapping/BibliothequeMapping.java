package alexandria.infrastructure.persistance.mongo.mapping;

import alexandria.modele.bibliotheque.Bibliotheque;
import org.mongolink.domain.mapper.AggregateMap;

public class BibliothequeMapping extends AggregateMap<Bibliotheque> {
    public BibliothequeMapping() {
        super(Bibliotheque.class);
    }

    @Override
    public void map() {
        id().onField("identifiant").natural();
        property().onField("emailLecteur");
        collection().onField("exemplaires");
    }
}
