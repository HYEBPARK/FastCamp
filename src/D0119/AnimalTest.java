package D0119;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal Human = new Animal();
        Animal Tiger = new Tiger();
        Animal Eagle = new Eagle();
        AnimalTest test = new AnimalTest();

        test.moveAnimal(Human);
        test.moveAnimal(Tiger);
        test.moveAnimal(Eagle);

        ArrayList<Animal> animaList = new ArrayList<>();
        animaList.add(Human);
        animaList.add(Tiger);
        animaList.add(Eagle);

        for (Animal animal : animaList) animal.move();
    }
    // animal test의 메소드임
    public void moveAnimal(Animal animal){
        animal.move();
        //동물이 움직입니다.
        //호랑이가 네 발로 뜁니다.
        //독수리가 날아갑니다
    }
}
