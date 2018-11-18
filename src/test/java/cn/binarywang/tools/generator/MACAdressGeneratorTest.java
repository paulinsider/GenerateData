package cn.binarywang.tools.generator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class MACAdressGeneratorTest {
    @Test
    public void testGenerate() {
        String MACAdress = MACAdressGenerator.getInstance().generate();
        assertNotNull(MACAdress);
        System.err.println(MACAdress);
    }
}
