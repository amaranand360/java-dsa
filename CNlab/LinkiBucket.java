import java.util.Scanner;

public class LinkiBucket {
    public static void main(String[] args) {
        int i, packets[], bucketRemaining = 0, bucketCapacity = 4, rate = 3, sent, received;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of packets");
        int numberOfPackets = scanner.nextInt();
        packets = new int[numberOfPackets];
        
        System.out.println("Enter the packets");
        for (i = 0; i < numberOfPackets; i++)
            packets[i] = scanner.nextInt();
        
        System.out.println("Clock \t Packet Size \t Accepted \t Sent \t Remaining");
        for (i = 0; i < numberOfPackets; i++) {
            if (packets[i] != 0) {
                if (bucketRemaining + packets[i] > bucketCapacity)
                    received = -1;
                else {
                    received = packets[i];
                    bucketRemaining += packets[i];
                }
            } else
                received = 0;
            
            if (bucketRemaining != 0) {
                if (bucketRemaining < rate) {
                    sent = bucketRemaining;
                    bucketRemaining = 0;
                } else {
                    sent = rate;
                    bucketRemaining -= rate;
                }
            } else
                sent = 0;
            
            if (received == -1)
                System.out.println((i + 1) + "\t\t" + packets[i] + "\t dropped \t" + sent + "\t" + bucketRemaining);
            else
                System.out.println((i + 1) + "\t\t" + packets[i] + "\t\t" + received + "\t" + sent + "\t" + bucketRemaining);
        }
        scanner.close();
    }
}
