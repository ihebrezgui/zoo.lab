// Classe Zoo
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo() {
    } //atribut de relation

    // Constructeur pour la classe Zoo
    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }

    // Getters et Setters pour les attributs (facultatif, mais recommandé)
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

        public boolean add(Animal animal, int cagenbr) {
        if (cagenbr >= 0 && cagenbr < this.nbrCages) {
            animals[cagenbr] = animal;
            System.out.println(animal.getName() + " a été ajouté à la cage " + cagenbr);
            return true;
        } else {
            System.out.println("Cage invalide : " + cagenbr);
            return false;
        }
    }

    // Méthode pour afficher les détails du zoo
    public void displayAnimals(Animal animal) {
        System.out.println("Animaux du zoo :");
        for (int i = 0; i < this.animals.length ; i++) {
            if (this.animals != null) {
                System.out.println("Nom de l'animal : " + animal.getName());
                System.out.println("Famille : " + animal.getFamily());
                System.out.println("Âge : " + animal.getAge() + " ans");
                System.out.println("Mammifère : " + (animal.isMammal() ? "Oui" : "Non"));
                System.out.println();
                }
        }
    }
    public void afficheAnimals(Animal animal) {
        System.out.println("Animaux du zoo :");
        for (int i = 0; i < this.animals.length ; i++) {
            if (this.animals != null) {
                System.out.println(animal.toString()); // Appelle automatiquement la méthode toString de l'animal
                System.out.println();
            }
        }
    }



    // Méthode pour rechercher un animal par son nom et retourner son indice
    public int searchAnimal(Animal animal ) {
        for (int i = 0; i < this.animals.length ; i++) {
            if (this.animals[i] != null && this.animals[i].getName().equals(animal.getName())) {
                return i; // L'animal a été trouvé, retourne son indice
            }
        }
        return -1; // L'animal n'a pas été trouvé
    }
    // Méthode pour supprimer un animal du zoo et renvoyer le succès de la suppression
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] != null && this.animals[i].equals(animal)) {
                // L'animal a été trouvé, supprime-le
                this.animals[i] = null;
                System.out.println(animal.getName() + " a été supprimé du zoo.");
                return true; // Suppression réussie
            }
        }
        System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        return false; // L'animal n'a pas été trouvé, suppression échouée
    }


}
