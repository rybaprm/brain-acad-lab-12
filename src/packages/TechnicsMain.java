package packages;

public class TechnicsMain {
    public static void main(String[] args) {
        packages.technics.Pasport technic1 = new packages.technics.Pasport("FirstPC");
        packages.technics.Pasport technic2 = new packages.technics.Pasport("SecondPC");
        System.out.println(technic1);
        System.out.println(technic2);
        packages.technics.PassportUtil.warrantyReplace(technic1);
        packages.technics.PassportUtil.warrantyReplace(technic2);
        System.out.println(technic1);
        System.out.println(technic2);

    }
}
