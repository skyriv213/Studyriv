import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        Scanner scanner = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("연결 대기중");
            socket = serverSocket.accept();
            System.out.println("연결 완료");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String inMsg = in.readLine();
                if (inMsg.equalsIgnoreCase("bye")) {
                    System.out.println("client exit");
                    break;
                }
                // normal message case
                System.out.println("client : " + inMsg);
                System.out.print("보내기 >>");
                String outMsg = scanner.nextLine();
                out.write(outMsg + "\n");
                out.flush();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                scanner.close();
                out.close();
                in.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }


}