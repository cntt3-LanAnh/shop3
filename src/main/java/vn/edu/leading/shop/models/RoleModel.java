package vn.edu.leading.shop.models;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "shop_roles")
public class RoleModel extends BaseModel<RoleModel> {

    @NotEmpty
    @Column(nullable = false)
    private String name;
}