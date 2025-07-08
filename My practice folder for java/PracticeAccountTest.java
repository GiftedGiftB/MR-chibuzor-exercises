import PracticeCoount.PracticeAccount;
import com.sun.media.sound.SoftMainMixer;
import org.junit.jupiter.api.Test;

public class PracticeAccountTest {

    @Test
    public void testAccountBalanceIsZero(){
        PracticeAccount account = new PracticeAccount;
        assertEqual(0, account.getBalance());

    }
}
