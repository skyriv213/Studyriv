import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClinetEx {


    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Socket socket = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new Socket("localhost", 9999);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                System.out.print("보내기 >>");
                String outMsg = scanner.nextLine();
                if (outMsg.equalsIgnoreCase("bye")) {
                    out.write(outMsg + "\n");
                    out.flush();
                    break;
                }
                out.write(outMsg + "\n");
                out.flush();
                String inMsg = in.readLine();
                System.out.println("server >> : " + inMsg);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                scanner.close();
                out.close();
                in.close();
                socket.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
