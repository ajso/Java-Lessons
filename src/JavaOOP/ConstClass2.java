package JavaOOP;

public class ConstClass2 {

    int modelYear;
    String modelName;

    public ConstClass2(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        ConstClass2 cont = new ConstClass2(1978, "Mustang");
        System.out.println(cont.modelYear +" "+ cont.modelName);
    }
}
