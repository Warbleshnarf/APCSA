public class Main {
    public static void main(String[] args) {
        
        person personOne = new person(5.7,16,"Brian","black");
        hotel roomOne = new hotel(001);

        System.out.println(personOne);

        roomOne.checkIn(personOne);

        System.out.println(personOne.height);

    }
}
