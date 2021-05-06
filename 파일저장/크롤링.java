package 파일저장;

import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링 {
	public void webtoon() {
		String url = "https://comic.naver.com/webtoon/weekdayList.nhn?week=fri";
		Document doc;
		try {//먼저 크롤링
			//연결하
			Connection con = Jsoup.connect(url);
			doc = con.get();
			Elements title = doc.select("dl dt a");
			Elements grade = doc.select("div.rating_type");
			Elements writer = doc.select("dd.desc");
			FileWriter file = new FileWriter("c:/data/금요웹툰.txt");
			for (int i = 0; i < grade.size(); i++) {
				System.out.println("제목: " + title.get(i + 3).text() + ", 평점: " + grade.get(i).text()  + ", 작가: " + writer.get(i + 3).text());
				file.write("제목: " + title.get(i).text() + ", 평점: " + grade.get(i).text()  + ", 작가: " + writer.get(i).text());
			}
			file.close();
		} catch (Exception e) {
			System.out.println("크롤링 실패");
		}
		
		
	}
		
	
	
}
