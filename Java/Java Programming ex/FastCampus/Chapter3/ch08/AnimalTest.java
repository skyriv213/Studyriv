package ch08;

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
    	
    	AnimalTest test = new AnimalTest();
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
    	test.testDowncasting(animalList);
    	
	
    }
    public void testDowncasting(ArrayList<Animal> animalList) {
    	
    	for(int i = 0 ; i < animalList.size();i++) {
    		
    		Animal animal = animalList.get(i);
    		
    		if( animal instanceof human) {
    			
    			human h1 = (human)animal;
    			h1.readbook();
    		}
    		else if(animal instanceof Tiger) {
    			Tiger  tAnimal = (Tiger) animal;
    			tAnimal.hunting();
    					
    		}
    		else if( animal instanceof eagle) {
    			
    			eagle eAnimal = (eagle)animal;
    			eAnimal.flying();
    		}
    		else {
    			System.out.println("unsupported type");
    		}
    	}
    	
    }
    
    public void moveAnima(Animal animal) {
    	animal.move();
    	
    }
}

