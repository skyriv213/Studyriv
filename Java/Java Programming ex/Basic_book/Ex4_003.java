package Solve;

import java.util.Scanner;

public class Ex4_003 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String song = sc.next();
		String artist = sc.next();
		int year = sc.nextInt();
		String country = sc.next();
		
		Song fav = new Song(song, artist, year, country);
		fav.show();
		
	}

}
class Song{
	private String song, artist, country;
	private int year;
	
	public Song() {} // �⺻������
	

	public Song(String song, String artist, int year, String country) { // �Ű������� �ʵ带 �ʱ�ȭ�ϴ� ������
		this.song = song;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}
	public void show() {
		System.out.println(year + "�� " + country + "������" + artist + "�� �θ� "+song);
	}
}
