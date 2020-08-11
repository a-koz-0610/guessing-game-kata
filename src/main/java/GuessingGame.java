public class GuessingGame {

    public String gameResponse(int secretNumber) {
        if (secretNumber == 5) {
            return "You Win";
        }
        return "";
    }
}
