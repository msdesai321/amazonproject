package utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
		
	public static void Screenshot(WebDriver driver, String snap) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & hh-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File selfile = ts.getScreenshotAs(OutputType.FILE);
		File myfile = new File("./ScreenshotFolder\\"+snap+date+".jpg");
		FileHandler.copy(selfile, myfile);
	}

}
