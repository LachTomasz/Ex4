public class ProgramowanieStr {
    public static void main(String[] args) {
        String text = "programowanie";
        System.out.println("Oryginalny ciag znaków: \t"+text);
        System.out.println();
        System.out.println("zamiana pierwszej litery na wielką:");
        System.out.println(text.replace("p","P"));
        System.out.println();
        System.out.println("zamiana wszystkich znaków na wielkie:");
        System.out.println(text.toUpperCase());
    }
}
