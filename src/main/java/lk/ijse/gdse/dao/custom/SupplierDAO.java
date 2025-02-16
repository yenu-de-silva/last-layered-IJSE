package lk.ijse.gdse.dao.custom;

import lk.ijse.gdse.dao.CrudDAO;
import lk.ijse.gdse.entity.Inventory;
import lk.ijse.gdse.entity.Supplier;

import java.sql.SQLException;

public interface SupplierDAO  extends CrudDAO<Supplier> {
    String getNextSupplierId() throws SQLException, ClassNotFoundException;
}
