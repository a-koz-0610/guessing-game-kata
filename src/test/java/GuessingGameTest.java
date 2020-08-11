import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessingGameTest {


    @Test
    public void shouldReturnYouWinWhenUserGuessesTheSecretNumber(){
        int secretNumber = 5;
        GuessingGame underTest = new GuessingGame();
        String response = underTest.gameResponse(secretNumber);
        assertEquals("You Win", response);
    }

    //Test #2: shouldReturnTooLowWhenGuessIsBelowSecretNumber

    //Test #3: shouldReturnTooHighWhenGuessIsAboveSecretNumber

    //Test #4: shouldReturnInvalidWhenGuessIsBelowZero

    //Stretch tasks...
    //Stretch Test #1: shouldReturnYouLoseWhenUserHas3IncorrectGuessAttempts

    //Stretch Text #2: shouldResetAttemptsWhenUserWins



}
