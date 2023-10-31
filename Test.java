public class Test {

    public static void main(String[] args) {

        Solo<String> strSolo = new Solo<>("toto");
        String strValue = strSolo.getValue();
        System.out.println(strValue);
        strSolo.setValue("tata");
        System.out.println(strSolo.getValue());

        Solo<Integer> intSolo = new Solo<>(Integer.valueOf(42));
        Integer intValue = intSolo.getValue();
        System.out.println(intValue);
        intSolo.setValue(Integer.valueOf(1337));
        System.out.println(intSolo.getValue());

        Solo<Integer> testInt = new Solo<>(42);
        Integer testIntValue = testInt.getValue();
        System.out.println(testIntValue);
        testInt.setValue(1337);
        System.out.println(testInt.getValue());


    }
}
