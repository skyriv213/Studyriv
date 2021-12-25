package ch07_StreamEx;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCustomer lee =  new TravelCustomer(40,"이순신",5000);
		TravelCustomer kim =  new TravelCustomer(30,"김님",4000);
		TravelCustomer park =  new TravelCustomer(20,"박환",3000);
			
		List<TravelCustomer> li = new ArrayList<>();
		li.add(lee);
		li.add(park);
		li.add(kim);
		
		System.out.println("명단출력");
		
		li.stream().forEach(s->System.out.println(s));
		li.stream().map(i->i.getAge()).forEach(i->System.out.println(i));
		li.stream().map(p->p.getPrice()).forEach(p->System.out.println(p));
		System.out.println(li.stream().mapToInt(c->c.getPrice()).sum());
		li.stream().filter(c->c.getAge()>=30).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
