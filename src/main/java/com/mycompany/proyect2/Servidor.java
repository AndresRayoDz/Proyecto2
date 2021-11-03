/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Familia Rayo
 */
public class Servidor {
      public static void main(String args[]) throws IOException{
          
          
        ServerSocket servidorSocket=null;
        Socket socketCliente=null;
        BufferedReader entrada=null;
        PrintWriter salida=null;
        System.out.println("hola bienvenido");
        
        
          try {
              servidorSocket=new ServerSocket(8010);
         
           while(true){
            
                socketCliente=servidorSocket.accept();
                entrada=new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
                salida=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketCliente.getOutputStream())),true);
                String cad=entrada.readLine();
                System.out.println(cad);
                
           }
            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
              }
        salida.close();
        entrada.close();
        servidorSocket.close();
        socketCliente.close();
    }
    
}
