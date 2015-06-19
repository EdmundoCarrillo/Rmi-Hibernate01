package com.escom.cliente;

import com.escom.dao.ArticuloImplements;
import com.escom.modelo.Articulo;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class ArticuloCliente {

    public void addArticulo(Articulo articulo) throws RemoteException, NotBoundException, MalformedURLException {
        ArticuloImplements op = (ArticuloImplements) Naming.lookup("Articulo");
        op.addArticulo(articulo);
    }

    public void deleteArticulo(Articulo articulo) throws RemoteException, NotBoundException, MalformedURLException {
        ArticuloImplements op = (ArticuloImplements) Naming.lookup("Articulo");
        op.deleteArticulo(articulo);

    }

    public void uptadeArticulo(Articulo articulo) throws RemoteException, NotBoundException, MalformedURLException {
        ArticuloImplements op = (ArticuloImplements) Naming.lookup("Articulo");
        op.uptadeArticulo(articulo);

    }

    public List<Articulo> getAllArticulos() throws RemoteException, NotBoundException, MalformedURLException {
    
    ArticuloImplements op = (ArticuloImplements) Naming.lookup("Articulo");
        return op.getAllArticulos();
    
    }

    public Articulo getArticuloById(int idArticulo) throws RemoteException, NotBoundException, MalformedURLException {
    
    ArticuloImplements op = (ArticuloImplements) Naming.lookup("Articulo");
        return op.getArticuloById(idArticulo);
    }

}
