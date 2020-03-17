package lesson1;

public class Conditions {
    public static void main(String[] args) {
        boolean isModifyUI = true;
        boolean isModifyDB = true;
        int valueInUI = 3;
        int valueInDB = 2;
        int newValue = 6;
        if (isModifyUI){
            System.out.println("Modify valueInUI old = " + valueInUI + " new = " + newValue);
            valueInUI = newValue;
        }
        if (isModifyDB){
            valueInDB = newValue;
        }
        System.out.println(valueInUI);
        System.out.println(valueInDB);

        int a= 4;
    }
}
