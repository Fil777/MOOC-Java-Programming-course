public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
    this.name = name;
    this.birthday = birthday;
    }
    
    public Person(String name) {
    this.name = name;
    this.birthday = new MyDate();
    }
    
    public int age() {
    // calculate the age based on the birthday and the current day
        MyDate nowDate = new MyDate();
        return nowDate.differenceInYears(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
