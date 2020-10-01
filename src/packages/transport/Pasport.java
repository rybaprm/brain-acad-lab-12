package packages.transport;

public class Pasport {
    //12 Пакеты (Практика)
//1 Создать в своем проекте пакет packages. Дальнейшая работа будет вестись именно в
//    нем.
//2 В своем проекте пакет packages, создать еще 3 пакета: citizen, technics, transport
//3 В каждом из пакетов создать класс Passport (паспорт гражданина, паспорт на бытовую
//            технику, тех. паспорт на автомобиль). Придумать и описать поля для каждого класса
//    Passport.
//4 Создать класс Test в пакете packages.
//            4.1 В методе main создать экземпляр класса Passport (из пакета citizen);
//4.2 Попытаться создать новый экземпляр класса Passport, но из пакета technics. Дополнить
//    название полным путем к классу, для избежания конфликта имен.
//            4.3 Аналогично создать экземпляр класса Passport (из пакета transport);
//5 В каждом из пакетов (citizen, technics, transport) создать по util-классу (PassportUtil),
//    для вспомогательных операций над паспортом. Примечание: все методы пометить
//    модификатором public; В классе нужно создать закрытый конструктор с комментарием
//«закрытый конструктор» внутри.
//5.1 Для PassportUtil в пакете citizen создать статический метод по регистрации брака
//            (marriageRegistrate):
//            • Добавить поле spouseId, в которое нужно передать номер паспорта
//    супруга/супруги.
//• Метод должен принимать 2 объекта Passport и инициализировать поле spouseId в
//    каждом из паспортов.
//• Метод ничего не возвращает (void).
//            5.2 Для PassportUtil в пакете technics создать статический метод по замене по гарантии
//            (warrantyReplace):
//            • Добавить поле warrantyStartDate (Используем тип java.util.Date, создание: new
//            Date();).
//            • Для импортирования пакет в IDEA ставим курсор на неизвестный класс и
//    нажимаем alt+Enter.
//• Метод должен принимать Passport. Внутри метода обновляется поле
//    warrantyStartDate, заменяем на новую дату.
//            • Метод ничего не возвращает (void).
//            5.3 Для PassportUtil в пакете transport создать статический метод по переоформлению
//    автомобиля (changeOwner):
//            • Добавить поле ownerName в класс Passport (если его еще нет, или нет подобного
//            поля, описывающего ФИО владельца авто)
//• Метод должен принимать Passport и ФИО нового владельца. Внутри метода
//    создается новый экземпляр класса Passport, который инициализируется всеми
//    полями из предыдущего экземпляра и ФИО нового владельца
//• Метод должен возвращать новый экземпляр класса Passport.
//6 В общем пакете packages создать пакет test.
//6.1 Создать по “main” классу для каждого из наших паспортов (CitizenMain, TechnicsMain,
//                                                             TransportMain)
//6.2 В каждом из классов создать необходимые экземпляры классов внутри метода main.
//6.3 Проверить работу статических методов.
//            7 В классе CitizenMain, применить статический импорт для статического метода
//    marriageRegistrate(…)
//8 В классе PassportUtil, пакета transport, заменить модификатор доступа на packageprivate (дефолтный)
//8.1 Проверить наличие ошибки в классе TransportMain
//8.2 Перенести функционал по замене владельца внутрь класса Passport.
//            • Создать публичный, не статический метод changeOwner, который принимает имя
//    нового владельца.
//            • Внутри метода вызвать существующий статический метод, передав в качестве
//    объекта паспорта – this.
//            • Удостоверится что внутри пакета доступ к методу с дефолтным модификатором
//    доступа осуществляется без проблем.
//            8.3 Изменить вызов метода в классе TransportMain, на новый вариант, с использованием
//    нестатического метода у объекта.
    private int id;
    private String ownerName;
    private String nameTransport;
    public static int COUNTER_ID = 1;

    public Pasport(String nameTransport,String ownerName) {
        this.id=COUNTER_ID++;
        this.ownerName = ownerName;
        this.nameTransport = nameTransport;
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    @Override
    public String toString() {
        return "Transport {" +
                "id=" + id +
                ", ownerName='" + ownerName + '\'' +
                ", nameTransport='" + nameTransport + '\'' +
                '}';
    }
    public Pasport changeOwner(String ownerName){
        return PassportUtil.changeOwner(this,ownerName);
    }
}
