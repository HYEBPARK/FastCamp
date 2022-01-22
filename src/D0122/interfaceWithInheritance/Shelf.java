package D0122.interfaceWithInheritance;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    // 생성자를 생성할때 초기화 하는게 좋음
    public Shelf(){
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }

}
