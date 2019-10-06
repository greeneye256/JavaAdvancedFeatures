package Enums;

import enums.PrinterType;
import org.junit.Assert;
import org.junit.Test;

public class EnumTest {
    @Test
    public void testGetDescription(){
        Assert.assertEquals(PrinterType._3D,PrinterType.matchPrinterType("Imprimanta 3d"));
    }

    @Test (expected = PrinterType.UnknownPrinter.class)
    public void testException(){
        PrinterType.matchPrinterType("fdd");
    }
}
