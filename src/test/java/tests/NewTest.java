package tests;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import methods.Retry;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;		

public class NewTest {		
	    private WebDriver driver;
	    
	    @BeforeTest
		public void setup() throws Exception{
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}
		
		@Test(retryAnalyzer = Retry.class)			
		public void SourceCodeCheck() {
			String[] layout = new String[]{"","referandum","son-dakika","turkiye","dunya","ekonomi","spor","yasam","saglik","teknoloji","emlak","sanat","otomobil","egitim","ntv-ekrani","video/diger/","dunya/test-news-dontchange-this-news-title%2cpFBwenZaZkSSQxBQiHc3Lw","canli-yayin/ntv","video/arsiv", "404", "galeri","galeri/turkiye/turkiyenin-kuslari,rWPOClgbLUGenvqlh4dj_g", "video","video/odan-100e/0dan-100e-5-mart-2017,n8nCNExyQEK9bNpq4lu9TA"};
			for (int i = 0; i < layout.length; i++) {
				driver.get("http://staging.ntv.com.tr/"+layout[i]);
				System.out.println("http://staging.ntv.com.tr/"+layout[i]+" = "+driver.getPageSource()
					.contains("meta property=\"og:site_name\" content=\"NTV\""));
				System.out.println("http://staging.ntv.com.tr/"+layout[i]+" = "+driver.getPageSource()
				.contains("meta name=\"twitter:card\""));
				//Sasaasas
				//sasasas
				
			}
						
			}
			
		}