package com.micahgajewski.progressiongenerator.types.chords;

import com.micahgajewski.progressiongenerator.interfaces.IChord;
import com.micahgajewski.progressiongenerator.types.Interval;
import jm.JMC;

/**
 * Created by Micah on 4/19/2014.
 */
public class DiminishedSeventh implements Interval, IChord, JMC {
    public int[] getNotes(int root){
        int[] notes = {root, root+MINOR_THIRD, root+DIMINISHED_FIFTH};
        return notes;
    }
}
