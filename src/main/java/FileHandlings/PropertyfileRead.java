package FileHandlings;

import java.io.*;
import java.util.Properties;

public class PropertyfileRead {
	
	String filepath = "C:\\Users\\kumar\\eclipse-workspace\\FitaAnnanagarSeleniumAugust2024\\Input\\Env.properties";
	
	public void read() throws IOException
	{
		File F = new File(filepath);
		FileInputStream Fs = new FileInputStream(F);
		int i;
		/*while((i =Fs.read())!=-1)
		{
			System.out.print((char)i);
		}*/
		Properties P = new Properties();
		P.load(Fs);
		System.out.println(P.getProperty("username"));
		System.out.println(P.getProperty("url"));
		System.out.println(P.getProperty("password"));
		System.out.println(P.getProperty("dob"));
		P.setProperty("dob", "May-2000");
		System.out.println(P.getProperty("dob"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyfileRead P=  new PropertyfileRead();
		P.read();
	}

}
