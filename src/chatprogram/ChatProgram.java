/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatprogram;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author okama01
 */
public class ChatProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //a server socket 
        //    ServerSocket serverSocket = new ServerSocket(12345);
        //accept incoming client commection
        //  Socket clientSocket = serverSocket.accept();
        //input stream to send and receive data
        //InputStream input = clientSocket.getInputStream(); 
        //OutputStream output = clientSocket.getOutputStream();
        Scanner input = new Scanner(System.in);
        int val;

        do {
            System.out.println("Kommandon"); // fråga om uppgifter 
            System.out.println("1. Lista alla uppkopplade");
            System.out.println("2. Skriv ett meddelande till någon");
            System.out.println("3. Skriv ett medelande till alla");
            System.out.println("0. Avsluta ");

            val = input.nextInt();
            
            switch (val) {
                
                case 1:
                    
                    break;
                    
                default: 
                    System.out.println("Ogiltig val");
                    break;
            }
            
        } while (val != 0);
    }
}
