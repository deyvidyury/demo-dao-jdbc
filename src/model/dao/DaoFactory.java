package model.dao;

import model.impl.SellerDaoJDBC;

/**
 * DaoFactory
 */
public class DaoFactory {

  public static SellerDao createSellerDao() {
    return new SellerDaoJDBC();
  }
}