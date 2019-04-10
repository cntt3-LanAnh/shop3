package vn.edu.leading.shop.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "shop_orders")
public class OrderModel extends BaseModel<OrderModel> {

    @NotEmpty
    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @NotEmpty
    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    private String orderDate;

    @NotEmpty
    @Column(name = "shipper_id", nullable = false)
    private Long shipperId;
}
