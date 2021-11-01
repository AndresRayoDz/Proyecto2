/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Familia Rayo
 */
public class Servidor {
    
    
    public static void main(String[] args){
        ServerSocket servidorSocket=new ServerSocket(8090);
    
    
    }
    
    
    
    private ServerSocket servidorSocket;
    public Servidor(ServerSocket servidorSocket){
        this.servidorSocket=servidorSocket;
        
    }
    public void startServer() throws IOException{
        try {
        
            while(!servidorSocket.isClosed()){
               Socket socketServidor= servidorSocket.accept();//funciona como bloqueo, el programa se detiene hasta que un cliente se conecte
                System.out.println("a new client is conect")
                ControladorCliente controlCliente=new ControladorCliente(socketServidor);
                Thread thread=new Thread(controlCliente);
                thread.start();
            
            
            
            }
        
        }catch(IOException e){
        
        
        }
    }
    public void apagarServidor(){
        try{
            
            if(servidorSocket !=null){
                servidorSocket.close();          
            }
        
        
        
        }catch(IOException e){
        e.printStackTrece();
        }
    
    }
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
       

