package JavaEnums;

public class MainEnumClass {

    public static void main(String[] args) {
//        Levels myVar = Levels.LOW;
//        System.out.println(myVar);

//        Levels myVar = Levels.MEDIUM;
//
//        switch(myVar) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case MEDIUM:
//                System.out.println("Medium level");
//                break;
//            case HIGH:
//                System.out.println("High level");
//                break;
//        }

//        Loop Through an Enum
        for (Levels myVar : Levels.values()) {
            System.out.println(myVar);
        }
    }

}
