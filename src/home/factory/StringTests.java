package home.factory;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class StringTests {
    @Test
    public void SymbolReplacememt (){
        Assert.assertEquals(MathFunctions.RemoveSymbols("qWeqWeqWeqWeqWeqWeqWe", 3, 'e'), "qWeqWeqWeqWeqWqWqW");
    }

    @Test
    public void StringInvertWithStringArray(){
        Assert.assertEquals(MathFunctions.Invert1("qwertyuiop"), "poiuytrewq");
    }

    @Test
    public void StringInvertWithChart(){
        Assert.assertEquals(MathFunctions.Invert2("qwertyuiop"), "poiuytrewq");
    }
    @Test
    public void StringInvertDuplication (){
        Assert.assertEquals(MathFunctions.InvertDuplication("qwertyuiop"), "poiuytrewq");
    }

    @Test
    public void StringArrayInversionForEach (){
        String[] input =  {"abc", "cde", "efg"};
        String[] output =  {"cba", "edc", "gfe"};
        Assert.assertEquals(MathFunctions.StringArrayInversionForEach(input), output);
    }


}
