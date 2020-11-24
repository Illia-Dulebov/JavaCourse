public class SlotsAmountException extends Exception {
    private MotherBoard boardEx;

    public SlotsAmountException(String message, MotherBoard boardEx){
        super(message);
        this.boardEx = boardEx;
    }

    public String getMotherboard() {
        return this.toString();
    }

    public MotherBoard getBoardEx() {
        return boardEx;
    }
}
