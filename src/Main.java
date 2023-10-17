import java.util.Scanner;

 public class Main {
        public static void main(String[] args) {
            // Création d'objets Animal (lion)
            Animal lion = new Animal("Félin", "Lion", 5, true);
            Animal elephant = new Animal("Éléphantidae", "Éléphant", 10, true);
            // Création d'un tableau d'animaux pour le zoo (vous pouvez ajouter d'autres animaux)
            Animal[] animalsForZoo = { lion , elephant };

            // Création d'un objet Zoo (myZoo)
            Zoo myZoo = new Zoo(animalsForZoo, "Mon Zoo", "Ma Ville", 10);

            // Accéder aux attributs des objets Animal et Zoo et les afficher
            System.out.println("Nom de l'animal : " + lion.getName());
            System.out.println("Nom du zoo : " + myZoo.getName());
            System.out.println("Ville du zoo : " + myZoo.getCity());
            System.out.println("Nombre de cages du zoo : " + myZoo.getNbrCages());

            // Affiche les détails du zoo
           // myZoo.displayAnimals(lion);

            // Ajoute l'animal au zoo
            myZoo.add(lion, 0);

        }


 }



