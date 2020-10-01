package packages;

import packages.citizen.Pasport;

import static packages.citizen.PassportUtil.marriageRegistrate;

public class CitizenMain {
    public static void main(String[] args) {
        Pasport citizen1 = new Pasport("MrFirst","01.01.1991");
        Pasport citizen2 = new Pasport("MrsSecond","02.02.1992");
        System.out.println(citizen1);
        System.out.println(citizen2);
        marriageRegistrate(citizen1,citizen2);
        System.out.println(citizen1);
        System.out.println(citizen2);
        Pasport citizen3 = new Pasport("MrThird","03.03.1993");
        Pasport citizen4 = new Pasport("MrsForth","04.04.1994");
        System.out.println(citizen3);
        System.out.println(citizen4);
        marriageRegistrate(citizen3,citizen4);
        System.out.println(citizen3);
        System.out.println(citizen4);


    }
}
