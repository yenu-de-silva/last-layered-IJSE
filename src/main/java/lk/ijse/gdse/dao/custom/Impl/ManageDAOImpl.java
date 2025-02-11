package lk.ijse.gdse.dao.custom.Impl;

import lk.ijse.gdse.dao.SQLUtil;
import lk.ijse.gdse.dao.custom.ManageDAO;
import lk.ijse.gdse.entity.Manage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManageDAOImpl implements ManageDAO {
    @Override
    public List<Manage> getAll() throws SQLException, ClassNotFoundException {
        ResultSet resultSet = SQLUtil.execute("SELECT * from Manage");

        List<Manage> manageList = new ArrayList<>();

        while (resultSet.next()) {
            String manageId = resultSet.getString("manage_id");
            String inventoryId = resultSet.getString("inventory_id");
            String supplierId = resultSet.getString("supplier_id");
            String orderId = resultSet.getString("order_id");
            int quantity = resultSet.getInt("quantity");
            String supplierName = resultSet.getString("supplier_name");
            String supplierContactName = resultSet.getString("supplier_contact_name");

            Manage manage = new Manage(manageId, inventoryId, supplierId, orderId, quantity, supplierName, supplierContactName);
            manageList.add(manage);
        }

        return manageList;
    }

    @Override
    public boolean save(Manage dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("insert into manage (manage_id, inventory_id, supplier_id, order_id, quantity , supplier_name , supplier_contact_name) values (?,?,?,?,?,?,?)",dto.getManageId(),dto.getInventoryId(),dto.getSupplierId(),dto.getOrderId(),dto.getQuantity(),dto.getSupplierName());
    }

    @Override
    public boolean update(Manage dto) throws SQLException, ClassNotFoundException {
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
        return Integer.parseInt("1");
    }

    @Override
    public Manage search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
