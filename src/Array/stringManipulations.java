package src.Array;

public class stringManipulations {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        String str2 = new String("World");
        System.out.println(str2);
        String str3 = helloWorld + str2;
        System.out.println(str3);

        System.out.println(helloWorld.concat(str2));
        System.out.println(helloWorld.equals(str2));
        System.out.println(helloWorld.contains(str2));
        System.out.println(helloWorld.length());
        System.out.println(helloWorld.substring(0, 5));
        System.out.println(helloWorld.toLowerCase());
        System.out.println(helloWorld.toUpperCase());
        System.out.println(str3.trim());

    }
}
