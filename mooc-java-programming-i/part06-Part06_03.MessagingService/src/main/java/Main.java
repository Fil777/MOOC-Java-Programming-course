
public class Main {

    public static void main(String[] args) {

        MessagingService ms = new MessagingService();
        String s50 = "01234567890123456789012345678901234567890123456789";
        String s300 = s50 + s50 + s50 + s50 + s50 + s50;
        
        ms.add(new Message("FIL", s300));
        
        System.out.println(ms.getMessages().get(0).getContent().length());
    }
}
