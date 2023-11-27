package InnClass;

class OuterClass{
    int x = 12;

    class InnerClass{
        int y =14;
    }
}

public class NestedClass {

        public static void main(String[] args) {
            OuterClass outerClass = new OuterClass();
            OuterClass.InnerClass innerClass = outerClass.new InnerClass();

            int result = outerClass.x + innerClass.y;

            System.out.println(result);

    }

}
