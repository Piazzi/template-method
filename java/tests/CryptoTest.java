import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CryptoTest {

    @Test
    public void shouldReturnApprovedTransaction() {
        Crypto bitcoin = new Crypto();
        bitcoin.setTax(0.0f);
        bitcoin.setAmountToPay(7);
        bitcoin.setPayment(7);
        assertEquals("Approved", bitcoin.verifyTransaction());
    }

    @Test
    public void shouldReturnDeniedTransaction() {
        Crypto bitcoin = new Crypto();
        bitcoin.setTax(0.0f);
        bitcoin.setAmountToPay(10);
        bitcoin.setPayment(9);
        assertEquals("Denied", bitcoin.verifyTransaction());
    }

    @Test
    public void shouldReturnTransactionData() {
        Crypto bitcoin = new Crypto();
        bitcoin.setTax(0.0f);
        bitcoin.setAmountToPay(10);
        bitcoin.setMethod("BTC");
        bitcoin.setPayment(10);
        assertEquals("Decentralized payment{amount=10.0, method='BTC', transaction=Approved, tax=0.0}", bitcoin.getData());
    }
}