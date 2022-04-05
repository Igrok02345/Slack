package advanced;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class DemoLog4 {

    private int Side;

    public DemoLog4(int side) {
        Side = side;
    }


    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }

    static Logger logger = LogManager.getLogger(DemoLog4.class);

    public static void main(String[] args) {
        System.out.println("\n tre tee \n");

        logger.info("this is info message");
        logger.error("this is error massage");
        logger.warn("thi is a waring massage");
        logger.fatal("this is fatal massage");

        System.out.println("\n Completed \n ");
    }


}