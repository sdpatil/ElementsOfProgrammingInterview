package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class ConvertBaseTest {

    ConvertBase convertBase;

    @Before
    public void setup(){
        convertBase = new ConvertBase();
    }

    @Test
    public void convertFromStringToIntTest(){
        assert convertBase.convertFromStringToBase("123",10)==123;
        assert convertBase.convertFromStringToBase("111",2)==7;
        assert convertBase.convertFromStringToBase("64",16)==100;
    }



    @Test
    public void convertFromBases(){
        assert convertBase.convertBase("100",10,16).equals("64");
    }

    @Test
    public void convertBase(){
        System.out.println(convertBase.convertFromStringToBase("1000",-2));

    }
}
