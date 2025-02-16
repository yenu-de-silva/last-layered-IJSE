package lk.ijse.gdse.dao.custom;

import lk.ijse.gdse.dao.SuperDAO;

import java.sql.SQLException;

public interface QueryDAO extends SuperDAO {
    void findOrdersByOrderDerailID() throws SQLException, ClassNotFoundException;
}

//join query