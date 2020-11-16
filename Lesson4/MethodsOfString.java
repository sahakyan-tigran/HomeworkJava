package HomeworkJava1.Lesson4;

import java.util.Arrays;

public class MethodsOfString {
    public static void main(String[] args) {
        String s = "Tigran Sahakyan";

        System.out.println(s.length());

        System.out.println(s.charAt(0));

        char buf[] = new char[7];
        s.getChars(8, s.length(), buf, 0);
        System.out.print("From index 8 to end: ");
        System.out.println(buf);

        buf = s.toCharArray();
        System.out.println("String in char array: " + Arrays.toString(buf));

        String s1 = "picsart academy";
        System.out.println("\"" + s + "\"" + " equals " + "\"" + s1 + "\"" + " -> " +
                s.equals(s1));
        System.out.println("\"" + s + "\"" + " equalsIgnoreCase " + "\"" + s1 + "\"" + " -> " +
                s.equalsIgnoreCase(s1));

        System.out.println("\"PicsArt\" and \"picsart\" without ignoring case is equal: " + s.regionMatches(0, s1, 0, 7));
        System.out.println("\"PicsArt\" and \"picsart\" with ignoring case is equal: " + s.regionMatches(true, 0, s1, 0, 7));

        String start = "pics";
        String end = "emy";

        System.out.println("\"PicsArt Academy\" starts with " + start + ": " + s.startsWith(start));
        System.out.println("\"PicsArt Academy\" ends with " + end + ": " + s.endsWith(end));

        if (s.compareTo(s1) < 0) {
            System.out.println("\"" + s + "\"" + " is less than " + "\"" + s1 + "\"");
        } else if (s.compareTo(s1) > 0) {
            System.out.println("\"" + s + "\"" + " is greater than " + "\"" + s1 + "\"");
        } else {
            System.out.println("\"" + s + "\"" + " equal to " + "\"" + s1 + "\"");
        }

        System.out.println("First index of c is: " + s.indexOf("c"));
        System.out.println("Last index of c is: " + s.lastIndexOf("c"));

        System.out.println("Substring from 2 to 5 index is: " + s.substring(2, 5));

        System.out.println("Replacing Academy with academics: " + s.replace("Academy", "Academics"));

        String t = "   PicsArt   ";
        System.out.println("Ignoring spaces before and after main string in \"" + t + "\": " + t.trim());

        String v = String.valueOf(123);
        System.out.println("Converting number 123 to string: " + (v + 9));

        System.out.println("All characters in \"" + s + "\" to upper case: " + s.toUpperCase());

        System.out.println("Unicode of \'" + s.charAt(2) + "\': " + s.codePointAt(2));
    }
}
