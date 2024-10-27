import java.io.*;
import java.net.*;
import java.util.*;
public class UDPServer
{
public static void main(String[] args) throws IOException
{
Scanner scanner = new Scanner(System.in);        
DatagramSocket datagramSocket = new DatagramSocket();
InetAddress clientAddress = InetAddress.getByName("127.0.0.1");
String line;
byte[] buffer;
DatagramPacket datagramPacket;

while (true) 
	{
        System.out.println("Enter Messages to Send");
		line = scanner.nextLine();
        buffer = line.getBytes();
        datagramPacket = new DatagramPacket(buffer, buffer.length, clientAddress, 1234);
        datagramSocket.send(datagramPacket);
        if (line.equalsIgnoreCase("exit"))
		{
            datagramSocket.close();
            break;
         }
	}
}
}