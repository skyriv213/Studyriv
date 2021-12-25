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
	
	public Song() {} // 기본생성자
	

	public Song(String song, String artist, int year, String country) { // 매개변수로 필드를 초기화하는 생성자
		this.song = song;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}
	public void show() {
		System.out.println(year + "년 " + country + "국적의" + artist + "가 부른 "+song);
	}
}
