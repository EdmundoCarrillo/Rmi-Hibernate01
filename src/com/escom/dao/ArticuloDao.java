/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escom.dao;

import com.escom.modelo.Articulo;
import com.escom.util.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ArticuloDao extends UnicastRemoteObject implements ArticuloImplements {

    public ArticuloDao() throws RemoteException {
        super();
    }

    @Override
    public void addArticulo(Articulo articulo) throws RemoteException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(articulo);
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
    public void deleteArticulo(Articulo articulo) throws RemoteException {
        Transaction tr = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tr = session.beginTransaction();
            session.delete(articulo);
            session.getTransaction().commit();
            System.out.println("Eliminado Exitosamente");
        } catch (HibernateException e) {
            if (tr != null) {
                tr.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();

        }
    }

    @Override
    public void uptadeArticulo(Articulo articulo) throws RemoteException {
        Transaction tr = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tr = session.beginTransaction();
            session.update(articulo);
            session.getTransaction().commit();

        } catch (HibernateException e) {
            if (tr != null) {
                tr.rollback();
            }
            System.out.println(e.toString());
        } finally {

            session.close();

        }
    }

    @Override
    public List<Articulo> getAllArticulos() throws RemoteException {
        List<Articulo> articulos = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            articulos = session.createQuery("from Articulo").list();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        } finally {

            session.close();
        }
        return articulos;
    }

    @Override
    public Articulo getArticuloById(int idArticulo) throws RemoteException {
        Articulo articulo = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Articulo where idarticulo= :id ";
            Query query = session.createQuery(queryString);
            query.setInteger("id", idArticulo);
            articulo = (Articulo) query.uniqueResult();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        } finally {

            session.close();
        }
        return articulo;
    }

}
