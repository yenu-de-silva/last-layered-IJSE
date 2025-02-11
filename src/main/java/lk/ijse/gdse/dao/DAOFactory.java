package lk.ijse.gdse.dao;

import lk.ijse.gdse.dao.custom.Impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() {
    }
    public static DAOFactory getInstance() {
        return daoFactory==null?daoFactory=new DAOFactory():daoFactory;
    }
    public enum DAOType {
        CUSTOMER,DEPARTMENT,EMPLOYEE,PAYMENT,PRODUCT,INVENTORY,SUPPLIER,ITEM,ORDER,SALARY,USER,DELIVERY,MANAGE,ORDERDETAILS,QUERY,CUSTOMERFEEDBACK
    }
    public SuperDAO getDAO(DAOType type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerDAOImpl();
                case DEPARTMENT:
                    return new DepartmentDAOImpl();
                    case EMPLOYEE:
                        return new EmployeeDAOImpl();
                        case PAYMENT:
                            return new PaymentDAOImpl();
                            case PRODUCT:
                                return new ProductDAOImpl();
                                    case INVENTORY:
                                        return new InventoryDAOImpl();
                                        case SUPPLIER:
                                            return new SupplierDAOImpl();
                                            case ITEM:
                                                return new ItemDAOImpl();
                                                case ORDER:
                                                    return new OrderDAOImpl();
                                                    case SALARY:
                                                        return new SalaryDAOImpl();
                                                        case USER:
                                                            return new UserDAOImpl();
                                                            case DELIVERY:
                                                                return new DeliveryDAOImpl();
                                                                case MANAGE:
                                                                    return new ManageDAOImpl();
                                                                    case ORDERDETAILS:
                                                                        return new OrderDetailsDAOImpl();
                                                                        case QUERY:
                                                                            return new QueryDAOImpl();
                                                                            case CUSTOMERFEEDBACK:
                                                                                return new CustomerFeedBackDAOImpl();


            default:
                return null;
        }
    }

}
