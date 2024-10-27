// import java.io.*;
// import java.net.*;
// import java.nio.file.*;

// public class tcpserver {
//     public static void main(String[] args) throws Exception {
//         ServerSocket server;
//         DataOutputStream out = null;
//         DataInputStream in;
//         try {
//             server = new ServerSocket(6000, 2);
//             System.out.println("Server waiting for client");
//             Socket socket = server.accept();
//             System.out.println("Client Connected");
//             // Get the input stream associated with the socket
//             in = new DataInputStream(socket.getInputStream());
//             // Get the output stream associated with the socket
//             out = new DataOutputStream(socket.getOutputStream());
//             String filename = in.readUTF();
//             System.out.println("File requested is: " + filename);
//             byte[] filedata = Files.readAllBytes(Paths.get(filename));
//             String fileContent = new String(filedata);
//             out.writeUTF(fileContent.toString());
//             System.out.println("FILE SENT SUCCESSFULLY");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//             out.writeUTF("FILE DOES NOT EXIST");
//         }
//     }
// }

import java.io.*;
import java.net.*;
import java.nio.file.*;
public class tcpserver {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(6000, 2)) {
            System.out.println("Server waiting for client");
            Socket socket = server.accept();
            System.out.println("Client Connected");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String filename = in.readUTF();
            System.out.println("File requested: " + filename);
            try {
                byte[] fileData = Files.readAllBytes(Paths.get(filename));
                out.writeUTF(new String(fileData));
                System.out.println("File sent successfully");
            } catch (IOException e) {
                out.writeUTF("FILE DOES NOT EXIST");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}