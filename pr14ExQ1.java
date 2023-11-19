import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class pr14ExQ1 {
    public static void main(String[] args)throws UnknownHostException {
        System.out.println("Enter Hostname");
        Scanner sc = new Scanner(System.in);
        String hostname = sc.nextLine();
        InetAddress address = InetAddress.getByName(hostname);
        String ipAddress = address.getHostAddress();
        System.out.println(ipAddress);
    }
}
