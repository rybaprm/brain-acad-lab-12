package packages.transport;

class PassportUtil {
    private PassportUtil(){
        /**
         * Private constructor
         */
    }
    public static Pasport changeOwner(Pasport pasport,String ownerName){
        return new Pasport(pasport.getNameTransport(),ownerName);
    }
}
