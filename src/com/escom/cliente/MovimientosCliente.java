/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.cliente;

import com.escom.dao.ArticuloImplements;
import com.escom.dao.MovArticuloImplements;
import com.escom.modelo.Articulo;
import com.escom.modelo.MovArticulo;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author DARTH VADER
 */
public class MovimientosCliente {
    
    public void addMovimiento(MovArticulo mov) throws RemoteException, NotBoundException, MalformedURLException {
        MovArticuloImplements op = (MovArticuloImplements) Naming.lookup("Mov");
        op.addMovimiento(mov);
    }
    
    public List<MovArticulo> getAllMovimientos() throws RemoteException, NotBoundException, MalformedURLException {
        MovArticuloImplements op = (MovArticuloImplements) Naming.lookup("Mov");
        return op.getAllMovimientos();
    }
    
//    public static void main(String[] args) {
//        try {
//            Date fecha = new Date();
//            Articulo art = new Articulo();
//            art.setIdarticulo(1);
//            MovArticulo mov = new MovArticulo();
//            mov.setCantidad(Integer.toString(50));
//            mov.setTipo('E');
//            mov.setFecha(new java.sql.Date(fecha.getTime()));
//            mov.setArticulo(art);
//            new MovimientosCliente().addMovimiento(mov);
//        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
//            Logger.getLogger(MovimientosCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
}
