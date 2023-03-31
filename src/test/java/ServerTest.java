import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;


public class ServerTest {
    Guest guest;
    Server server;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("V", 18, 56.00, 59, false, '£', "COLA");
    }



    @Test
    public void canCheckGuest(){
        server.canServeGuest(guest);
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }


    // TODO: test that guest can only get served if over 18
    @Test
    public void canCheckOverAge(){
        server.checkID(guest);
        assertThat(server.checkID(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canBuyDrinks(){
        server.hasEnoughMoney(guest);
        assertThat(server.hasEnoughMoney(guest)).isEqualTo(true);
    }


    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canCheckSobriety(){
        server.guestSobriety(guest);
        assertThat(server.guestSobriety(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void canCheckIfBanned(){
        server.banned(guest);
        assertThat(server.banned(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void canCheckCurrency(){
        server.checkCurrency(guest);
        assertThat(server.checkCurrency(guest)).isEqualTo(true);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
