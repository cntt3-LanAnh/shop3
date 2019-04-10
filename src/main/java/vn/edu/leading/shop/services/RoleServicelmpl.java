package vn.edu.leading.shop.services;

import org.springframework.stereotype.Service;
import vn.edu.leading.shop.models.RoleModel;
import vn.edu.leading.shop.models.UserModel;
import vn.edu.leading.shop.repositories.RoleRepository;
import vn.edu.leading.shop.repositories.UserRepository;

import java.util.List;

@Service
public class RoleServicelmpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServicelmpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleModel> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public List<RoleModel> search(String term) {
        return roleRepository.findByNameContaining(term);
    }

    @Override
    public RoleModel findById(Long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public boolean update(RoleModel roleModel) {
        RoleModel roleModel1 = roleRepository.findById(roleModel.getId()).orElse(null);
        if (roleModel == null)
            return false;
        roleRepository.save(roleModel);
        return true;
    }

    @Override
    public void save(RoleModel roleModel) {
        roleRepository.save(roleModel);
    }

    @Override
    public boolean delete(Long id) {
        RoleModel roleModel = roleRepository.findById(id).orElse(null);
        if (roleModel == null)
            return false;
        roleRepository.delete(roleModel);
        return true;
    }
}
