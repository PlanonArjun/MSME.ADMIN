package dataGenrator;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class ProductServicesGenerator {
    public static final Map<String, String> productDetails = new HashMap<>();

    static {
        Faker faker = new Faker();

        String type = productDetails.get("type");//drp
        String code ="";
        String name = "";
        String category = productDetails.get("category");//drp
        String subCategory = productDetails.get("subCategory");//drp
        String description = "";
        String umo = productDetails.get("umo");//drp
        String location = productDetails.get("location");//drp
        String sellingPrice = "";
        String map = "";



    }

}
