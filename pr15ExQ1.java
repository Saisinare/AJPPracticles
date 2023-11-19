import java.net.URL;

public class pr15ExQ1 {
    public static void main(String[] args) throws Exception{
        URL urlString = new URL("http://www.msbte.org.in");
        System.out.println(urlString.getHost());
        System.out.println(urlString.getPort());
        System.out.println(urlString.getFile());
        System.out.println(urlString.getProtocol());
    }
}
