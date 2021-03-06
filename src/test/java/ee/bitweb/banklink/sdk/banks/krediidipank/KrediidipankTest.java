package ee.bitweb.banklink.sdk.banks.krediidipank;

import ee.bitweb.banklink.sdk.BankLinkTestStub;
import ee.bitweb.banklink.sdk.banks.seb.Seb;
import ee.bitweb.banklink.sdk.protocol.Protocol;
import ee.bitweb.banklink.sdk.protocol.Vendor;
import ee.bitweb.banklink.sdk.protocol.iPizza.Mac;
import ee.bitweb.banklink.sdk.protocol.iPizza.iPizzaProtocol;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * Created by tobre on 20/03/2017.
 */
public class KrediidipankTest extends BankLinkTestStub {

    @Before
    public void setUp() throws Exception {
        createStubProtocol();
    }

    @Test
    public void canConstructWithProtocol() throws Exception {
        new Krediidipank(protocol);
    }

    @Test
    public void canConstructWithProtocolArguments() {
        new Krediidipank(protocol, "UTF-8", "EST", "EUR");
    }
}