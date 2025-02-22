package lk.ijse.gdse.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Inventory {
    private String inventory_id;
    private String product_id;
    private String supplier_id;
    private Integer quantity;
    private String last_updated;

}
