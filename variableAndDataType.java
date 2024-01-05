import java.time.LocalDate;

public class variableAndDataType {
    public static void main(String[] args) {
        // primative data type
        byte age = 23;
        long viewCount = 444444448;
        float price = 373.578f;
        double netPrice = 47.595;
        char gender = 'M';
        boolean isAuth = false;

        System.out.println(age);
        System.out.println(viewCount);
        System.out.println(price);
        System.out.println(netPrice);
        System.out.println(gender);
        System.out.println(isAuth);

        // none primative data type
        String helloWorld = "Hello World";
        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(helloWorld);

    }
}
