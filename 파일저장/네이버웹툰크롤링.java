package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {
	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn");
		Document doc = con.get();
		Elements div = doc.select("a.title");
		
		System.out.println(div.size());
		for (Element e : div) {
			System.out.println(e.text());
			
			}
		
		try { 
				FileWriter f = new FileWriter("c:/data/webtoon.txt");
				for (Element element : div) {
					f.write(element.text() +"\n");
				
					}
					
				
				f.close();
		} catch (Exception er) {
			System.out.println("에러입니다. 에러 정보는 " + er.getMessage());
		}
 	}	
	
}
