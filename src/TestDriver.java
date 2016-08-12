import com.jaunt.*;
import com.jaunt.component.*;
import com.jaunt.util.*;

public class TestDriver {
	public static void main(String[] args) {
		try {
			UserAgent userAgent = new UserAgent();
			userAgent.settings.autoSaveAsHTML = true;
			userAgent.settings.checkSSLCerts = false;
			
			userAgent.visit("https://foodimentary.com/today-in-national-food-holidays/todayinfoodhistorycalenderfoodnjanuary/");
			//System.out.println(userAgent.doc.innerHTML());
			
			Elements elements = userAgent.doc.findEvery("<div>National");
			//Elements elements = userAgent.doc.findEvery("<a title=January>");
			System.out.println(elements.innerHTML());
		}
		catch (JauntException e) {
			System.err.println(e);
		}
	}
}
