public class HotelRoom {
    public int roomNumber;
    public Person guestOne;
    public Person guestTwo;
    public int roomCap;
    public int numOfPeople = 0;

    HotelRoom(int num){       //declares HotelRoom object
        roomNumber = num;
    }

    void checkIn(Person guest){  //checks in guests
        if(guestOne == null){    //checks if guestOne is available
            guestOne = guest;
            numOfPeople += 1;    //counts the number of people in room
        }
        else if(guestTwo == null){  //checks if guestTwo is available if guestOne is not
            guestTwo = guest;
            numOfPeople += 1;  
        }
        else{
            System.out.println("This room can only hold 2 people.");
        }
    }

    void checkOut(Person guest){  //checks out guests
        if(guestOne == guest){    //checks who is being checked out
            guestOne = null;      //wipes guestOne
            numOfPeople += -1;    //counts people in room
        }
        else if(guestTwo == guest){
            guestTwo = null;
            numOfPeople += -1;
        }
        else{
            System.out.println("There's no one to check out from this room.");
        }
    }
    
    int checkCapacity(){
        return (numOfPeople);   //uses numOfPeople that is counted through checking in/out
    }

    void printGuestInfo(){     //prints info of both guests in a room
        if (guestOne != null){
            System.out.println("Name: " + guestOne.name);
            System.out.println("Age: " + guestOne.age);
            System.out.println("Height: " + guestOne.height);
            System.out.println("Hair Color: " + guestOne.hairColor);
        }
        if (guestTwo != null){
            System.out.println("");
            System.out.println("Name: " + guestTwo.name);
            System.out.println("Age: " + guestTwo.age);
            System.out.println("Height: " + guestTwo.height);
            System.out.println("Hair Color: " + guestTwo.hairColor);
        }
    }  

}



