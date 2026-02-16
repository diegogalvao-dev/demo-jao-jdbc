package model_dao;

import modelEntities.Department;
import modelEntities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void delete(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartmentId(Department department);

}
