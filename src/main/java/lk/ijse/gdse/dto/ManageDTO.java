package lk.ijse.gdse.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ManageDTO {
    private String manageId;
    private String inventoryId;
    private String supplierId;
    private String orderId;
    private int quantity;
    private String supplierName;
    private String supplierContactName;


}
