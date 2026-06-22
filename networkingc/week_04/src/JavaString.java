public class JavaString {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name);

//  length

        System.out.println(name.length());

//  charAt(int index)
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));
        System.out.println(name.charAt(7));

//  toUpperCase
        System.out.println(name.toUpperCase());

//  toLowerCase
        System.out.println();
        System.out.println(name.toLowerCase());

//  equals
        System.out.println(name.equals("John Doe"));
    }
}
