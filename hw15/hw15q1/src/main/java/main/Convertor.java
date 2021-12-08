package main;

public class Convertor {

    public static Integer convertor(String string) {
        boolean positive;
        char[] charArray;
        if (string != null) {
            charArray = string.toCharArray();
        } else {
            throw new NumberFormatException("null!");
        }
        String overWrite = "";
        if (charArray[0] == '-') {
            positive = false;
        } else if (charArray[0] == '+') {
            positive = true;
        } else {
            throw new NumberFormatException("only numbers not alphabet");
        }
        for (int i = 1; i < charArray.length; i++) {
            if ((48 <= charArray[i]) && (charArray[i] <= 57)) {
                overWrite += charArray[i];
            } else {
                throw new NumberFormatException("only numbers not alphabet");
            }
        }
        int integer = Integer.parseInt(overWrite);
        if ((-32767 <= integer) && (integer <= 32767)) {
            return positive ? integer : -integer;
        } else {
            throw new OutOfMemoryError("between -32767 and 32767");
        }
    }
}
