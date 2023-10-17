// Classe Animal
public class Animal {
    private String family;
    private String name;
    private int age ;
    private boolean isMammal ;

public Animal (String family , String name , int age , boolean isMammal){
    this.age = age ;
    this.name = name;
    this.family = family ;
    this.isMammal = isMammal ;
}

    // Getters et Setters pour les attributs (facultatif, mais recommandé)
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

static  void Affiche (String[] family , String[] name ,Integer[] age ,boolean[] isMammel)
{
    System.out.println("The Name of the Animal is  "+name+"\n It's family is "+family+"\nIt's age is "+age+"\nAnd is it a mammal ?  "+isMammel);

}

}
