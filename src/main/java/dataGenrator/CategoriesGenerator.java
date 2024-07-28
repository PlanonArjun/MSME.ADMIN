package dataGenrator;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CategoriesGenerator {
    public static final Map<String, String> categoryDetails = new HashMap<>();

    static {
        Faker faker = new Faker();

    // Category
    String categoryCode = getCategoryCode();
    String categoryName = getCategoryName();
    String subCategoryCode = getCategoryCode();
    String subCategoryName = faker.commerce().department();

    // Fill the map with generated values
    categoryDetails.put("categoryCode",categoryCode);
    categoryDetails.put("categoryName",categoryName);
    categoryDetails.put("subCategoryCode",subCategoryCode);
    categoryDetails.put("subCategoryName",subCategoryName);
    }
    public static String getCategoryCode() {
        // Create a Faker instance
        Faker faker = new Faker();

        // Get the current month and year
        LocalDate currentDate = LocalDate.now();
        String currentMonth = currentDate.format(DateTimeFormatter.ofPattern("MM")); // Current month as MM
        String currentYear = currentDate.format(DateTimeFormatter.ofPattern("yy")); // Last two digits of current year

        // Generate a random two-letter string
        String randomLetters = faker.letterify("??").toUpperCase();

        // Concatenate the month, year, and random letters to form the category code
        String categoryCode = currentMonth + currentYear + randomLetters;

        return categoryCode;
    }

    public static String getCategoryName() {
        // Randomly assign either "Services" or "Product"
        String[] categories = {"Services", "Product"};
        Random random = new Random();
        int index = random.nextInt(categories.length);

        return categories[index];
    }
}
