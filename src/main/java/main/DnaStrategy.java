package main;

import com.sun.istack.internal.Nullable;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         02-Mar-17 @ 10:09 AM
 */
public interface DnaStrategy {
    /**
     * Get RNA Transcription of dna strand
     *
     * @param dnaStrandInput the dna strand input used to get it's equivalent RNA transcription
     * @return the Rna transcription of dna strand.
     */
    String getRnaTranscription(@Nullable String dnaStrandInput);
}
