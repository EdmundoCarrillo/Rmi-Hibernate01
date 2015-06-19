/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.dao;

import com.escom.modelo.Articulo;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author DARTH VADER
 */
public interface ArticuloImplements extends Remote {

    public void addArticulo(Articulo articulo) throws RemoteException;

    public void deleteArticulo(Articulo articulo) throws RemoteException;

    public void uptadeArticulo(Articulo articulo) throws RemoteException;

    public List<Articulo> getAllArticulos() throws RemoteException;

    public Articulo getArticuloById(int idArticulo) throws RemoteException;

}
