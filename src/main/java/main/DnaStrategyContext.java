package main;

import com.sun.istack.internal.Nullable;
import extra.DnaStrand;
import strategies.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:14 AM
 */
public class DnaStrategyContext {

    String dnaStrandInput;

    public DnaStrategyContext(String dnaStrandInput) {
        this.dnaStrandInput = dnaStrandInput;
    }

    public String getRnaTranscription() {
        Map<String, DnaStrategy> dnaStrategyMap = this.getDnaStrategyMaps();
        return dnaStrategyMap.getOrDefault(dnaStrandInput, new DefaultDnaStrategy()).getRnaTranscription(dnaStrandInput);
    }

    protected Map<String, DnaStrategy> getDnaStrategyMaps() {
        Map<String, DnaStrategy> dnaStrategyMap = new HashMap<>();
        dnaStrategyMap.putIfAbsent(DnaStrand.CYTOSINE, new CytosineDnaStrategy());
        dnaStrategyMap.putIfAbsent(DnaStrand.GUANINE, new GuanineDnaStrategy());
        dnaStrategyMap.putIfAbsent(DnaStrand.THYMINE, new ThymineStrategy());
        dnaStrategyMap.putIfAbsent(DnaStrand.ADENINE, new AdenineStrategy());
        return dnaStrategyMap;
    }
}
