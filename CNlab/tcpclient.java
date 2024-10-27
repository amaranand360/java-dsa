// import java.io.*;
// import java.net.*;
// import java.util.Scanner;

// public class tcpclient {
// 	public static void main(String[] args) throws IOException, InterruptedException {
// 		DataOutputStream out;
// 		DataInputStream in;
// 		Scanner scanner = new Scanner(System.in);
// 		Socket socket = new Socket("127.0.0.1", 6000);
// 		System.out.println("\nEnter the filename to request\n");
// 		String filename = scanner.nextLine();
// 		// Get the input stream associated with the socket
// 		in = new DataInputStream(socket.getInputStream());
// 		// Get the output stream associated with the socket
// 		out = new DataOutputStream(socket.getOutputStream()); 
//         // Send a message to the server
// 		out.writeUTF(filename);
// 		String fileContent = in.readUTF();
// 		if (fileContent.length() > 0)
// 			System.out.println(fileContent);
// 		else
// 			System.out.println("FILE IS EMPTY");
// 	}
// }




import java.io.*;
import java.net.*;

public class tcpclient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 6000);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("\nEnter the filename to request\n");
            String filename = reader.readLine();
            out.writeUTF(filename);
            String fileContent = in.readUTF();
            System.out.println(fileContent.length() > 0 ? fileContent : "File is empty");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
