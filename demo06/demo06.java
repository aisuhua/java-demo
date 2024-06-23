import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * java -cp ./slf4j-api-1.7.9.jar:./logback-core-1.2.9.jar:./logback-classic-1.2.9.jar demo06.java
 * 或者
 * javac -cp ./slf4j-api-1.7.9.jar:./logback-core-1.2.9.jar:./logback-classic-1.2.9.jar demo06.java
 * java -cp .:./slf4j-api-1.7.9.jar:./logback-core-1.2.9.jar:./logback-classic-1.2.9.jar demo06
 */
public class demo06 {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(demo06.class);
        log.info("suhua is a good boy.");
        log.error("suhua is a good boy...");
    }
}
