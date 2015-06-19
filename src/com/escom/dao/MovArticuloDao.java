/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.dao;

import com.escom.modelo.Articulo;
import com.escom.modelo.MovArticulo;
import com.escom.util.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DARTH VADER
 */
public class MovArticuloDao extends UnicastRemoteObject implements MovArticuloImplements {

    public MovArticuloDao() throws RemoteException {
        super();
    }

    @Override
    public void addMovimiento(MovArticulo mov) throws RemoteException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(mov);
            session.getTransaction().commit();
            System.out.println("Agregado Exitosamente");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println(e.toString());
        } finally {

            session.close();

        }
    }

    @Override
    public List<MovArticulo> getAllMovimientos() throws RemoteException {
        List<MovArticulo> articulos = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            articulos = session.createQuery("from MovArticulo").list();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        } finally {

            session.close();
        }
        return articulos;
    }

}
