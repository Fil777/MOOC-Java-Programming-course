
public class Main {

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            System.out.print(part + " = ");
            if (abbreviations.hasAbbreviation(part)) {
                System.out.println(abbreviations.findExplanationFor(part));
            }
        }
    }
}
