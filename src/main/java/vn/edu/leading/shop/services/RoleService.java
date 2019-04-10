package vn.edu.leading.shop.services;

import vn.edu.leading.shop.models.RoleModel;
import vn.edu.leading.shop.models.UserModel;

import java.util.List;

public interface RoleService {

    List<RoleModel> findAll();

    List<RoleModel> search(String term);

    RoleModel findById(Long id);

    boolean update(RoleModel roleModel);

    void save(RoleModel roleModel);

    boolean delete(Long id);
}
