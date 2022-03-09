<<<<<<< HEAD
public class DemoString {
    public static void main(String[] args) {
        
=======
import java.util.SortedMap;

public class DemoString {
    public static void main(String[] args) {
        String Text1 = "Zadania z programowania.";
        char[] znaki = {'Z','a','d','a','n','i','a',' ','z',' ','p','r','o','g','r','a','m','o','w','a','n','i','a','.'};
        String Text2 = new String(znaki);

        System.out.println(Text1);
        System.out.println();
        System.out.println(Text2);
        System.out.println(Text1.charAt(0));
        System.out.println(Text1.length());
        System.out.println(Text2.length());
        System.out.println(Text1.charAt(23));
        System.out.println(Text2.toUpperCase());
        System.out.println(Text1.toLowerCase());
        System.out.println(Text2.indexOf('z'));
        System.out.println(Text1.indexOf("prog"));
        System.out.println(Text1.replace('.','?'));
        System.out.println(Text2.replace("adania","dania"));
        System.out.println(Text2.replaceAll("ania","anka"));
        System.out.println(Text1.replaceFirst("ania", "anka"));
        System.out.println(Text2.substring(10));
        System.out.println(Text1.substring(10,17));
        System.out.println(Text2.concat("\b z podpowiedziami."));
        System.out.println(Text1+"\b"+" z odpowiedziami.");
>>>>>>> 281740e (Initial commit)
    }
}
