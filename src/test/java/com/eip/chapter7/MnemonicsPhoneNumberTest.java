package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class MnemonicsPhoneNumberTest {
    MnemonicsPhoneNumber mnemonicsPhoneNumber;

    @Before
    public void setup(){
        mnemonicsPhoneNumber = new MnemonicsPhoneNumber();
    }

    @Test
    public void simpleTest(){
        List<String> mnemonicsList = mnemonicsPhoneNumber.phoneMnemonic("2276696");
        System.out.println("Number of Mnemonics " + mnemonicsList.size());
        for(String m: mnemonicsList)
            System.out.println(m);

    }

    @Test
    public void complexTest(){
        List<String> mnemonicsList = mnemonicsPhoneNumber.phoneMnemonic("5103293523");

        for(String m: mnemonicsList)
            System.out.println(m);

    }
}
