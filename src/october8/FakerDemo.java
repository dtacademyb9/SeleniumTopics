package october8;

import com.github.javafaker.Faker;

public class FakerDemo {


    public static void main(String[] args) {


        Faker faker =  new Faker();

        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().password());
        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().fullAddress());



    }
}
