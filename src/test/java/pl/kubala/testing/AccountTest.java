package pl.kubala.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testNewAccountNotActive(){
        Account account = new Account();
        assertFalse(account.isActive());
    }

    @Test
    void testAccountActiveAfterActivation(){
        Account account = new Account();
        account.activate();
        assertTrue(account.isActive());
    }

}