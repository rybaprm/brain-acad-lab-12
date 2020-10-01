package packages.technics;

import java.util.Date;

public class PassportUtil {
    private PassportUtil() {
        /**
         * Private constructor
         */
    }
    public static void warrantyReplace(Pasport pasport){
        pasport.setWarrantyStartDate(new Date());
    }
}
