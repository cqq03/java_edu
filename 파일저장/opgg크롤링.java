package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class opgg크롤링 {
	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://www.op.gg/champion/statistics");
		Document doc = con.get();
		Elements div = doc.select("div.champion-index-table__position");
		Elements div2 = doc.select("div.champion-index-table__name");
		System.out.println(div.size());
		for (Element e : div) {
			System.out.println(e.text());
			
			}
		
		try { 
				FileWriter f = new FileWriter("c:/data/champ.txt");
				for (Element element : div) {
					f.write(element.text() +"\n");
					for (Element element2 : div2) {
						f.write(element.text() +"\n");
						f.write(element2.text() + "\n");
					}
					}
					
				
				f.close();
		} catch (Exception er) {
			System.out.println("에러입니다. 에러 정보는 " + er.getMessage());
		}
 	}	
	
}
