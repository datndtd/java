package person;

public class Nguoi {
    public static void main(String[] args){
        Person p1 = new Student("Dat", 21, "Dong Hoi", 10);
        Person p2 = new Teacher("Dung", 21, "Dong Hoi", 10);
        p1.display();
        p2.display();
    }
}
