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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Familia Rayo
 */
public class Cliente {
    public static void main(String args[])throws IOException{
        Socket socketCliente=null;
        BufferedReader entrada=null;
        PrintWriter salida=null;
        
        
        
        try {
            socketCliente=new Socket("localhost",8010);
            entrada=new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            salida=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketCliente.getOutputStream())),true);
            
                        
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        try {
            String cad= sc.readLine();
            salida.println(cad);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        salida.close();
        entrada.close();
        sc.close();
        socketCliente.close();
    
    
    }
    
}
