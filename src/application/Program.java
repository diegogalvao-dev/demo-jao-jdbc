package application;

import modelEntities.Department;
import modelEntities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department obj = new Department(1, "book");

        Seller seller = new Seller(4454.34, LocalDate.parse("20/07/2022", fmt1), obj, "aoeofakof", 21, "af");

        System.out.println(seller);

    }

}
