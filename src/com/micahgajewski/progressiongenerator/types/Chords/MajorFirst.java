package com.micahgajewski.progressiongenerator.types.chords;

import com.micahgajewski.progressiongenerator.interfaces.IChords;
import com.micahgajewski.progressiongenerator.types.Interval;
import jm.JMC;

/**
 * Created by Micah on 4/18/2014.
 */
public class MajorFirst implements Interval, IChords, JMC{
    public int[] getNotes(int root){
        int[] notes = {root, root+MAJOR_THIRD, root+PERFECT_FIFTH};
        return notes;
    }
}
