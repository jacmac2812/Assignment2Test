public class StringUtillities {
    public static String reverseText(String hej) {
        String reverse="";
        for (int i = hej.length()-1; i>=0; i--) {
            reverse=reverse+hej.charAt(i);
        }
        return reverse;
    }

    public static String capitilize(String hej) {
        char strArr[] = hej.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }

        }
        return String.valueOf(strArr);
    }

    public static String lowercase(String hej) {
        char strArr[] = hej.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                strArr[i] = (char) ((int) strArr[i] + 32);
            }

        }
        return String.valueOf(strArr);
    }
}
