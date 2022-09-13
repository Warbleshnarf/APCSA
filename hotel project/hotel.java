public class hotel {
    public int roomNum;
    public person guestOne;
    public person guestTwo;
        hotel(int num){
        roomNum = num;
    }

    void checkIn(person guest){
        if(guestOne == null){
            guestOne = guest;
        }
        else if(guestTwo == null){
            guestTwo = guest;
        }
        else{
            System.out.println("This room can only hold 2 people.");
        }
    }

    void checkOut(person guest){
        if(guestOne == guest){
            guestOne = null;
        }
        else if(guestTwo == guest){
            guestTwo = null;
        }
        else{
            System.out.println("There's no one to check out from this room.");
        }
    int checkCapacity(){
        if(guestOne != null && guestTwo == null){
            
        }
    }

    }
}


