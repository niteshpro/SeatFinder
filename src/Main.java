import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner seatInput = new Scanner(System.in);
            System.out.println("Please enter your seat number");
            int seatNumber = seatInput.nextInt();
            if(seatNumber>8){
                int resultSeat = seatNumber % 8;
                SeatFinder(resultSeat);
            }
            else
                SeatFinder(seatNumber);
            System.out.println("Thank You for using");
        }
        catch ( Exception e){
            System.out.println("Enter a valid Seat number, E.g. (5,10,55,67)");
        }

    }

    private static void SeatFinder(int value) {
        switch (value){
            case 1:
                SeatPosition("Lower Berth");
                break;
            case 2:
                SeatPosition("Middle Berth");
                break;
            case 3:
                SeatPosition("Upper Berth");
                break;
            case 4:
                SeatPosition("Lower Berth");
                break;
            case 5:
                SeatPosition("Middle Berth");
                break;
            case 6:
                SeatPosition("Upper Berth");
                break;
            case 7:
                SeatPosition("Side Lower Berth");
                break;
            case 8:
                SeatPosition("Side Upper Berth");
                break;
        }
    }

    private static void SeatPosition(String berth) {
        System.out.println("seat Position is: " + berth);
    }
}