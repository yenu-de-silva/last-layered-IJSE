package lk.ijse.gdse.dao.custom;

import lk.ijse.gdse.dao.CrudDAO;
import lk.ijse.gdse.dto.OrderDetailsDTO;
import lk.ijse.gdse.entity.Employee;
import lk.ijse.gdse.entity.OrderDetails;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailsDAO extends CrudDAO<OrderDetails> {

    ArrayList<OrderDetailsDTO> getAllOrderDetails();

    boolean saveOrderDetails(OrderDetailsDTO orderDetailsDTO) throws SQLException, ClassNotFoundException;

    boolean updateOrderDetails(OrderDetailsDTO orderDetailsDTO) throws SQLException, ClassNotFoundException;

    boolean deleteOrderDetails(String orderDetailId) throws SQLException, ClassNotFoundException;
}
