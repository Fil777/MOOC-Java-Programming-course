package dictionary;

public class Main {

    public static void main(String[] args) {

        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("apina", "apfe");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        System.out.println(dictionary.translate("banana"));
//
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("ohjelmointi", "programming");
//        dictionary.delete("apina");
//        dictionary.delete("banana");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("banaani"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        

        if (dictionary.load()) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        dictionary.print();
        System.out.println("----------------------\n");

        dictionary.add("banaani", "banana");
        dictionary.add("genius", "fil");

        dictionary.print();
        System.out.println("----------------------\n");
        
        if (dictionary.save()) {
            System.out.println("Successfully saved the dictionary to file");
        }
        
    }
}
