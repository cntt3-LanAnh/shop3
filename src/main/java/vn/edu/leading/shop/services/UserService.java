package vn.edu.leading.shop.services;

import vn.edu.leading.shop.models.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> findAll();

    List<UserModel> search(String term);

    UserModel findById(Long id);

    boolean update(UserModel userModel);

    void save(UserModel userModel);

    boolean delete(Long id);

    void register(UserModel userModel) throws Exception;
}
