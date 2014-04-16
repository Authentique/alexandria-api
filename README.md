# Alexandria

## Installation sur Eclipse 

* Ajouter le support JDK8 à Eclipse via le marketplace
* Ajouter le support à spock via le marketplace
* Cloner le projet
* Vérifier que le jk8 est bien utilisé dans le build path
* Importer le projet dans Eclipse en tant que projet Gradle
* Convertir le projet en projet Groovy (clic droit sur le projet + configure)
* Ajouter la nature spock au projet (clic droit sur le projet + jspresso)

## Lancer gradle en ligne de commande

Tout comme avec maven, il peut être intéressant de lancer gradle en ligne de commande pour vérifier que le projet fonctionne en dehors d'Eclipse.

* Configurer le JAVA_HOME pour qu'il pointe vers le jdk8
* Ajouter répertoire bin du jdk8 au path
* exécuter gradle build