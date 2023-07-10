package om.gov.taxoman;

import om.gov.taxoman.entity.Product;
import om.gov.taxoman.entity.User;

public class Main {
    public static void main(String[] args) {
        Product[]  products = new Product[1];
        String[] Categories = new String[1];
        Categories[0]= "human";
        String[] roles = new String[1];
        roles[0] = "admin";
        User user =new User(id: 111,username:"manar", password:"mmm", roles);



    }
}