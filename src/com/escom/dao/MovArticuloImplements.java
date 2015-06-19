/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.dao;

import com.escom.modelo.MovArticulo;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author DARTH VADER
 */
public interface MovArticuloImplements extends Remote {

    public void addMovimiento(MovArticulo mov) throws RemoteException;

    public List<MovArticulo> getAllMovimientos() throws RemoteException;

}
