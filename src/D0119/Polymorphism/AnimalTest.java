package D0119.Polymorphism;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal Human = new Human();
        Animal Tiger = new Tiger();
        Animal Eagle = new Eagle();
        AnimalTest test = new AnimalTest();

//        test.moveAnimal(Human);
//        test.moveAnimal(Tiger);
//        test.moveAnimal(Eagle);

        ArrayList<Animal> animaList = new ArrayList<>();
        animaList.add(Human);
        animaList.add(Tiger);
        animaList.add(Eagle);

//        for (Animal animal : animaList) animal.move();
        test.testDownCasting(animaList);
    }

    // 다운 캐스팅
    public void testDownCasting(ArrayList<Animal> list){
        for(int i = 0 ; i<list.size(); i++){
            Animal animal = list.get(i);
            // animal이 human인가?
            if(animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();
            }
            else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
            else {
                System.out.println("unsuppoerted type");
            }
        }
    }
    // animal test의 메소드임
    public void moveAnimal(Animal animal){
        animal.move();
        //동물이 움직입니다.
        //호랑이가 네 발로 뜁니다.
        //독수리가 날아갑니다
    }
}
