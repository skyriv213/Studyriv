package ch06;

import java.util.ArrayList;

class Animal {
	
	public void  move() {
		System.out.println("������ �����Դϴ�");
	}
	public void eating() {
		System.out.println("�Դ´� �Ծ�");
	}

}


class human extends Animal {
	
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�");

	}
	public void readbook() {
		System.out.println("����� å�� �н��ϴ�");
	}
	
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");

	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�");
	}

}
class eagle extends Animal {
	
	public void move() {
		System.out.println("�������� �� ������ ���ϴ�");

	}
	public void flying() {
		System.out.println("�������� �ϴ��� ���ƴٴմϴ�");
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

