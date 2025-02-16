package lk.ijse.gdse.bo.custom;

import lk.ijse.gdse.bo.SuperBO;
import lk.ijse.gdse.dto.UserDTO;
import lk.ijse.gdse.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserBO extends SuperBO {

    List<User> getAllUserIds() throws SQLException, ClassNotFoundException;

    boolean saveUser(UserDTO userDTO) throws SQLException, ClassNotFoundException;

    boolean updateUser(UserDTO userDTO) throws SQLException, ClassNotFoundException;

    boolean deleteUser(int i) throws SQLException, ClassNotFoundException;
}
