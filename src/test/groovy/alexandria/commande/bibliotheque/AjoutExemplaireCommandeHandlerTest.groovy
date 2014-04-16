package alexandria.commande.bibliotheque
import org.junit.Rule

import spock.lang.Specification
import alexandria.infrastructure.persistance.memoire.AvecEntrepotsMemoire
import alexandria.modele.LocalisateurEntrepots
import alexandria.modele.bibliotheque.Exemplaire
import fr.arpinum.graine.modele.evenement.AvecBusEvenement

class AjoutExemplaireCommandeHandlerTest extends Specification {

	@Rule
	AvecBusEvenement avecBusMemoire = new AvecBusEvenement()
	
    @Rule
    AvecEntrepotsMemoire entrepotsMemoire = new AvecEntrepotsMemoire()

    def "peut créer la bibliothèque si elle n'existe pas"(){
        given:
        def commande = new AjoutExemplaireCommande(email: "body@email.com", isbn: "myisbn")

        when:
        def id = new AjoutLivreCommandeHandler().execute(commande)

        then:
        LocalisateurEntrepots.bibliotheques().get(id) != null
    }

    def "peut ajouter un exemplaire à la bibliothèque"(){
        given:
        def commande = new AjoutExemplaireCommande(email: "body@email.com", isbn: "myisbn")

        when:
        def id = new AjoutLivreCommandeHandler().execute(commande)

        then:
        def bibliotheque = LocalisateurEntrepots.bibliotheques().get(id)
        bibliotheque.contient(new Exemplaire("myisbn"))
    }
}
