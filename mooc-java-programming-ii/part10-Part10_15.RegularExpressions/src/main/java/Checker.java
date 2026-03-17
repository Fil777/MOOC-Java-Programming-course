
public class Checker {

    public boolean isDayOfWeek(String string) {
        String regEx = "mon|tue|wed|thu|fri|sat|sun";
        return string.matches(regEx);
    }

    public boolean allVowels(String string) {
        String regEx = "[aeiou]*";
        return string.matches(regEx);
    }
    
    public boolean timeOfDay(String string){
        String regEx = "^([0-1]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
        return string.matches(regEx);
        
    }
}
