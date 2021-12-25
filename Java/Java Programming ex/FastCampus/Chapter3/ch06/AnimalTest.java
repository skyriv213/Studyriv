package ch06;

import java.util.ArrayList;

class Animal {
	
	public void  move() {
		System.out.println("동물이 움직입니다");
	}
	public void eating() {
		System.out.println("먹는다 먹어");
	}

}


class human extends Animal {
	
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");

	}
	public void readbook() {
		System.out.println("사람이 책을 읽습니다");
	}
	
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");

	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}

}
class eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 두 날개로 납니다");

	}
	public void flying() {
		System.out.println("독수리가 하늘을 날아다닙니다");
	}
	
}
public class AnimalTest{
    public static void main(String [] args) {
	
    	Animal hAnimal = new human();
    	Animal tAnimal = new Tiger();
    	Animal eAnimal = new eagle();
    	
//    	AnimalTest test = new AnimalTest();
//    	test.moveAnima(eAnimal);
//    	test.moveAnima(tAnimal);
//    	test.moveAnima(hAnimal);
    	
    	ArrayList<Animal> animalList = new ArrayList<>();
    	animalList.add(hAnimal);
    	animalList.add(eAnimal);
    	animalList.add(tAnimal);

    	for(Animal animal :  animalList) {
    		animal.move();
    	}
    	
	
    }
    public void moveAnima(Animal animal) {
    	animal.move();
    	
    }
}

