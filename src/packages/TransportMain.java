package packages;

public class TransportMain {
    public static void main(String[] args) {
        packages.transport.Pasport transport1 =
                new packages.transport.Pasport("Lanos","MrFirst");
//        packages.transport.Pasport transport2=
//                packages.transport.PassportUtil.changeOwner(transport1,"MrsSecond");
        packages.transport.Pasport transport2 =transport1.changeOwner("MrsSecond");
        System.out.println(transport1);
        System.out.println(transport2);
    }
}
