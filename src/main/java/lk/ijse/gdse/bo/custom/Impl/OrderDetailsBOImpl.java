package lk.ijse.gdse.bo.custom.Impl;

import lk.ijse.gdse.bo.custom.OrderDetailsBO;
import lk.ijse.gdse.dao.DAOFactory;
import lk.ijse.gdse.dao.custom.OrderDetailsDAO;
import lk.ijse.gdse.dto.OrderDetailsDTO;
import lk.ijse.gdse.entity.OrderDetails;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailsBOImpl implements OrderDetailsBO {
    OrderDetailsDAO orderDetailsDAO = (OrderDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.ORDERDETAILS);

    @Override
    public boolean deleteOrderDetails(String orderDetailId) throws SQLException, ClassNotFoundException {
        orderDetailsDAO.delete(orderDetailId);

        return false;
    }

    @Override
    public boolean updateOrderDetails(OrderDetailsDTO orderDetailsDto) throws SQLException, ClassNotFoundException {
        orderDetailsDAO.update(new OrderDetails(orderDetailsDto.getOrderDetail_id(), orderDetailsDto.getOrder_id(), orderDetailsDto.getProduct_id(), orderDetailsDto.getQuantity(), orderDetailsDto.getPrice()));

        return false;
    }

    @Override
    public boolean saveOrderDetails(OrderDetailsDTO orderDetailsDTO) throws SQLException, ClassNotFoundException {
        orderDetailsDAO.save(new OrderDetails(orderDetailsDTO.getOrderDetail_id(), orderDetailsDTO.getOrder_id(), orderDetailsDTO.getProduct_id(), orderDetailsDTO.getQuantity(), orderDetailsDTO.getPrice()));

        return false;
    }

    @Override
    public List<OrderDetailsDTO> getAllOrderDetails() throws SQLException, ClassNotFoundException {
        ArrayList<OrderDetailsDTO> orderDetailsDTOS = new ArrayList<>();
        ArrayList<OrderDetails> orderDetailss = (ArrayList<OrderDetails>) orderDetailsDAO.getAll();
        for (OrderDetails orderDetails :orderDetailss ) {
            orderDetailsDTOS.add(new OrderDetailsDTO(orderDetails.getOrderDetail_id(), orderDetails.getOrder_id(), orderDetails.getProduct_id(), orderDetails.getQuantity(), orderDetails.getPrice()));
        }
        return orderDetailsDTOS;
    }
}
