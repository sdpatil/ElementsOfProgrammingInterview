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
        assert convertBase.convertFromStringToInt("123",10)==123;
        assert convertBase.convertFromStringToInt("111",2)==7;
        assert convertBase.convertFromStringToInt("64",16)==100;
    }

    @Test
    public void convertFromIntToString(){
        assert convertBase.constructFromBase(123,10).equals("123");
        assert convertBase.constructFromBase(7,2).equals("111");
        assert convertBase.constructFromBase(100,16).equals("64");
    }

    @Test
    public void convertFromBases(){
        assert convertBase.convertBase("100",10,16).equals("64");
    }

    @Test
    public void convertBase(){
        System.out.println(convertBase.convertFromStringToInt("1000",-2));
        System.out.println(convertBase.constructFromBase(-8,-2));

    }
}
