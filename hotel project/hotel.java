public class hotel {
    int roomNum;
    person guestOne;
    person guestTwo;
    
    hotel(int num){
        roomNum = num;

    }

    void checkIn(person newGuest){
        guestOne = newGuest;
    }

    void checkOut(){

    }

}
