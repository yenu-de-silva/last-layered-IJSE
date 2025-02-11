package lk.ijse.gdse.dao.custom.Impl;


import lk.ijse.gdse.dao.SQLUtil;
import lk.ijse.gdse.dao.custom.QueryDAO;

import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public void findOrdersByOrderDerailID() throws SQLException, ClassNotFoundException {
        SQLUtil.execute("");
    }
}
