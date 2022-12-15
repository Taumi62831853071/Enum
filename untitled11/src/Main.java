import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        System.out.println("Легковые автомобили");

        Cars Lada = new Cars("Lada","Granta", 1.7, BodyType.SEDAN.toString());
        System.out.println(Lada);
        Lada.pitStop();
        Lada.bestLapTime();
        Lada.maxSpeed();
        Cars Audi = new Cars("Audi","A8", 2.8,BodyType.SEDAN.toString());
        System.out.println(Audi);
        Cars BMW = new Cars("BMW","Z8", 3.0,BodyType.SEDAN.toString());
        System.out.println(BMW);
        Cars KIA = new Cars("KIA","Sportage", 2.4,BodyType.CROSSOVER.toString());
        System.out.println(KIA);
        Lada.startMoving();
        KIA.finishTheMove();

        System.out.println("Грузовые автомобили");

        Trucks Kamaz = new Trucks("КамАЗ","5490", 11.97, BearingCapacity.N2);
        System.out.println(Kamaz);
        Kamaz.pitStop();
        Kamaz.bestLapTime();
        Kamaz.maxSpeed();
        Trucks Man = new Trucks("MAN","TGX", 10.5, BearingCapacity.N2);
        System.out.println(Man);
        Trucks MAZ = new Trucks("МАЗ","544018", 11.95, BearingCapacity.N2);
        System.out.println(MAZ);
        Trucks Hyundai = new Trucks("Hyundai","HD500", 12.34, BearingCapacity.N3);
        System.out.println(Hyundai);
        Kamaz.startMoving();
        Hyundai.finishTheMove();

        System.out.println("Автобусы");

        Buses Nefaz = new Buses("НефАЗ","5299", 6.7, Capacity.AVERAGE);
        System.out.println(Nefaz);
        Nefaz.pitStop();
        Nefaz.bestLapTime();
        Nefaz.maxSpeed();
        Buses Volvo = new Buses("Volvo","9700", 10.8, Capacity.BIG);
        System.out.println(Volvo);
        Buses Scania = new Buses("Scania","Touring", 9.00, Capacity.AVERAGE);
        System.out.println(Scania);
        Buses PAZ = new Buses("ПАЗ","Vector-Next", 4.43, Capacity.SMALL);
        System.out.println(PAZ);
        Nefaz.startMoving();
        PAZ.finishTheMove();

        System.out.println();
        System.out.println("Задания про типы авто:");

        Lada.printType();
        Audi.printType();
        BMW.printType();
        KIA.printType();

        Kamaz.printType();
        Man.printType();
        MAZ.printType();
        Hyundai.printType();

        Nefaz.printType();
        Volvo.printType();
        Scania.printType();
        PAZ.printType();

        Type type = new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
        type.getTypeName();


    }
}