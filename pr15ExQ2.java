import java.net.URL;
import java.net.URLConnection;

public class pr15ExQ2 {
    public static void main(String[] args) throws Exception {
        String urlString = "https://github.com/Saisinare/AJPPracticles"; // Replace with your URL

        URLConnection connection = new URL(urlString).openConnection();
        System.out.println("Date: " + connection.getHeaderField("Date"));
        System.out.println("Content Type: " + connection.getContentType());
        System.out.println("Content Length: " + connection.getContentLength() + " bytes");
    }
}
