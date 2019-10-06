package exceptions;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

import java.io.IOException;

public class App {


    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    static {
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "INFO");
    }

    public static void main(String[] args) {
//        int result = 5/0;
        try {
            LOGGER.debug("Urmeaza impartirea lui 3 la 2");

            System.out.println(division(3, 2));

            LOGGER.debug("Urmeaza impartirea lui 3 la 0");
            System.out.println(division(3, 0));
        } catch (IOException e) {
//            System.out.println("catch");
            LOGGER.error("a fost prinsa exceptia cu mesajul '{}'.", e.getMessage());
        } finally {
            System.out.println("finally");
        }

    }

    static double division(int a, int b) throws IOException {

        try {
            LOGGER.info("Urmeaza impartirea lui {} la {}",a,b);
            return a / b;
        } catch (ArithmeticException e) {
            throw new IOException("iMPARTIRE LA 0", e);
        }
    }
}

