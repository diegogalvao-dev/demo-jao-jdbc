package application;

import modelEntities.Department;
import modelEntities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

import java.util.List;


public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1 findbyid ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TESTE 2 findbyid ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartmentId(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3 findALL ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }



    }

}
