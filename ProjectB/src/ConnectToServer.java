import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ConnectToServer {

	java.net.URLConnection conn = null;
	
	public  void connectToURL() {
		URL url ;
		try {
			url = new URL("ftp://ftp.ncbi.nlm.nih.gov/genbank/gbbct1.seq.gz");
			conn = url.openConnection(); 
		}catch(Exception e) {}
		
		System.out.println("Connected URL");
		readFromURL();

	}
	
	public void readFromURL() {
        try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
			}//try
        
        catch (IOException e) {e.printStackTrace();}
	}
}//Tysdf
