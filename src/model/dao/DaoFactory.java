package model.dao;

import db.DB;
import model.impl.SellerDaoJDBC;

/**
 * DaoFactory
 */
public class DaoFactory {

  public static SellerDao createSellerDao() {
    return new SellerDaoJDBC(DB.getConnection());
  }
}