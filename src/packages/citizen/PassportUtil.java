package packages.citizen;

public class PassportUtil {
    private PassportUtil() {
        /**
         * Private constructor
         */
    }

    public static void marriageRegistrate(Pasport pasport1, Pasport pasport2) {
        pasport1.setSpouseId(pasport2.getId());
        pasport2.setSpouseId(pasport1.getId());
    }
}
