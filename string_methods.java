public class string_methods {
    public static void main(String[] args) {
        String name = "Varun";
        //length
        System.out.print("string length : ");
        System.out.println(name.length());
        //lower case
        System.out.print(" lower case string : ");
        System.out.println(name.toLowerCase());
        //upper case
        System.out.print("upper case string : ");
        System.out.println(name.toUpperCase());
        //trim method
        String new_name = "   varun    ";
        System.out.println("Before trim : "+new_name);
        System.out.print("After trim : ");
        System.out.println(new_name.trim());
        //substring
        System.out.print("substring : ");
        System.out.println(name.substring(2));

        System.out.print("substring method 2 : ");
        System.out.println(name.substring(2,4));
        //replace method
        System.out.print("replace : ");
        System.out.println(name.replace('r','p'));

        //StartsWith method
        System.out.print("start with : ");
        System.out.println(name.startsWith("Va"));
        //EndsWith method
        System.out.print("ends with : ");
        System.out.println("nu");
        //CharAt mehtod
        System.out.print("chatAt : ");
        System.out.println(name.charAt(1));
        //Index method
        System.out.print("Index : " );
        System.out.println(name.indexOf("ru"));

        System.out.print("index second method : ");
        System.out.println(name.indexOf("va",2));
        //last index method
        System.out.print("last index method : ");
        System.out.println(name.lastIndexOf("u"));

        System.out.print("last index method 2 : ");
        System.out.println(name.lastIndexOf("u",2));

        //Equal method
        System.out.print("equal method : ");
        System.out.println(name.equals("singh"));
         //equal ignore case method
        System.out.print("equal ignore case : ");
        System.out.println(name.equalsIgnoreCase("VARUn"));
    }

}
