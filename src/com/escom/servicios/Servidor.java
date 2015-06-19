package com.escom.servicios;

import com.escom.dao.ArticuloDao;
import com.escom.dao.MovArticuloDao;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {

    public static void main(String args[]) {

        try {
            LocateRegistry.createRegistry(1099);
            ArticuloDao articuloDao = new ArticuloDao();
            MovArticuloDao movDao = new MovArticuloDao();
            Naming.rebind("Articulo", articuloDao);
            Naming.rebind("Mov", movDao);

            System.out.println("servidor corriendo");
        } catch (RemoteException | MalformedURLException e) {
        }
    }
}
