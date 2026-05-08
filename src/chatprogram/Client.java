/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatprogram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.UnknownHostException;
import java.util.HashMap;



/**
 *
 * @author okama01
 */
public class Client {

    HashMap<String, Int> meddelande = new HashMap<>();
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    Scanner in = new Scanner(System.in);
    int val;

    public Client(String address, int port) throws IOException {

        do {
            System.out.println("Kommandon"); // fråga om uppgifter 
            System.out.println("1. Lista alla uppkopplade");
            System.out.println("2. Skriv ett meddelande till någon");
            System.out.println("3. Skriv ett medelande till alla");
            System.out.println("0. Avsluta ");

            val = in.nextInt();

            switch (val) {

                case 1:

                    break;

                default:
                    System.out.println("Ogiltig val");
                    break;
            }

        } while (val != 0);
        
         try{
            socket = new Socket(address, port);
            
            while (true){
                
                System.out.println(")";
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

        String line = "";
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }
        
       
        
       

    public static void main(String args[]) {
        Client client = new Client("127.0.0.1", 5000);

    }
}
