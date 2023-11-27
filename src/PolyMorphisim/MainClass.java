package PolyMorphisim;

public class MainClass extends AnimalsClass{

    public static void main(String[] args) {
        AnimalsClass animalsClass = new AnimalsClass();
        PigClass pigClass = new PigClass();
        CatClass catClass = new CatClass();
        DogClass dogClass = new DogClass();

        System.out.println(pigClass.pigSound);
        System.out.println(dogClass.dogSound);
        System.out.println(catClass.catSound);

        animalsClass.animalSound();
        dogClass.animalSound();
        catClass.animalSound();
        pigClass.animalSound();
    }
}
