import java.io.*;
import java.net.*;
public class UDPClient
{
public static void main(String[] args) throws IOException
{
	DatagramSocket datagramSocket = new DatagramSocket(1234);
	byte[] buffer;
	DatagramPacket datagramPacket;
	System.out.println("Messages from server");
	while (true) 
	{
		buffer = new byte[65535];
		datagramPacket = new DatagramPacket(buffer, buffer.length);
		datagramSocket.receive(datagramPacket);
		String received = new String(buffer).trim();
		System.out.println("Server: ");
		System.out.print(received);
		System.out.println();
		if (received.equalsIgnoreCase("exit")) {
			datagramSocket.close();
			break;
		}
	}

}
}