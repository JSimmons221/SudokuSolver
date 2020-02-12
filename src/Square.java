public class Square {

    private Boolean[] possible;
    private int correctNumber;
    private Boolean startFilled;

    public Square(int i){
        correctNumber = i;
        startFilled = (correctNumber != 0);
        possible = new Boolean[9];

    }




}
