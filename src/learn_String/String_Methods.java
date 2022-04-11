package learn_String;

public class String_Methods {
    public static void main(String[] args) {

        // Declaring String
        String s1 = "Belayet Hossain";
        String s2 = new String("Belayet Hossain");

        if (s1==s2){        //  not Equal because "==" compare object not value
            System.out.println("Both String Equal");
        }else {
            System.out.println("Both String not Equal");
        }

        //.equals Method()
        boolean equal=s1.equals(s2);
        System.out.println("'"+s1+"' and '"+s2+"' equals = "+equal);

        // .length Method()
        int ln=s1.length();
        System.out.println(s1+" : length is = "+ln);

        // . equalsIgnoreCase()
        System.out.println("miru".equalsIgnoreCase("Miru"));

        // .contains()
        System.out.println("Hossain".contains("ain"));

        // .empty()
        System.out.println("This String '' empty = "+"".isEmpty());

        // .concat()
        System.out.println(s1.concat(s2));

        //.toUpperCase()
        System.out.println("Convert Upper Case : "+s1.toUpperCase());

        //.toLowerCase()
        System.out.println("Convert Lower Case : "+s2.toLowerCase());

        //.startsWith()
        System.out.println(s1+" Starts with 'Be' = "+s1.startsWith("Be"));

        //.endsWith()
        System.out.println(s2+" Ends with 'ain' = "+s2.endsWith("ain"));
    }
}
