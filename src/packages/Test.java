package packages;

import packages.citizen.Pasport;

public class Test {
    public static void main(String[] args) {
        Pasport citizen1 = new Pasport("MrFirst","01.01.1991");
        System.out.println(citizen1);

        packages.technics.Pasport technic1 = new packages.technics.Pasport("FirstPC");
        System.out.println(technic1);

        packages.transport.Pasport transport1 =
                new packages.transport.Pasport("Lanos","MrFirst");
        System.out.println(transport1);


    }
}
