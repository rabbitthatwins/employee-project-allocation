package com.example.epas.util;

import org.hibernate.Session;

public class DbTest {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Integer result = session.createNativeQuery("SELECT 1", Integer.class).getSingleResult();
            System.out.println(">>> Database connection OK, got: " + result);
        } finally {
            HibernateUtil.shutdown();
        }
    }
}