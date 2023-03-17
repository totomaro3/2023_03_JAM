package com.KoreaIT.example.JAM;

import java.util.*;


public class Main {

	List<> articles = new ArrayList<>()
	
	public static void main(String[] args) {
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("명령어 ) ");
			
			String cmd = sc.nextLine().trim();
			
			if(cmd.equals("article write")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				
				Article article = new Article(title, body);
				
				System.out.println(article.id+"번 글이 생성되었습니다.");
				
			}
			
			if(cmd.equals("article list")) {
				System.out.println("번호 / 제목");
				for(int i>0,i<=article.)
				System.out.printf("%d / %s",article.title, article.body);
			}
			
			if (cmd.equals("exit")) {
				break;
			}
		}
		
	}

}

class Article {
	static int lastId = 0;
	int id;
	String title;
	String body;
	
	Article(String title, String body) {
		this.id = ++lastId;
		this.title = title;
		this.body = body;
	}
}