package lk.ijse.gdse.dao.custom.Impl;

import lk.ijse.gdse.dao.custom.CustomerFeedbackDAO;
import lk.ijse.gdse.entity.CustomerFeedback;

import java.sql.SQLException;
import java.util.List;

public class CustomerFeedBackDAOImpl implements CustomerFeedbackDAO {

    @Override
    public List<CustomerFeedback> getAll() throws SQLException, ClassNotFoundException {
        return List.of();
    }

    @Override
    public boolean save(CustomerFeedback dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(CustomerFeedback dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public int generateNewId() throws SQLException, ClassNotFoundException {
        return 0;
    }

    @Override
    public CustomerFeedback search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
