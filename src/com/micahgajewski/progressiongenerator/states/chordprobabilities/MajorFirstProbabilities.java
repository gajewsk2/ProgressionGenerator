package com.micahgajewski.progressiongenerator.states.chordprobabilities;

import com.micahgajewski.progressiongenerator.interfaces.IChordState;
import com.micahgajewski.progressiongenerator.types.chords.MajorFirst;
import jm.music.data.CPhrase;
//import chords;

/**
 * Created by Micah on 4/17/2014.
 */
public class MajorFirstProbabilities implements IChordState{

    @Override
    public CPhrase getChord(int root, double duration) {
        CPhrase chord = new CPhrase();
        int[] notes = new MajorFirst().getNotes(root);
        chord.addChord(notes, duration);
        return chord;
    }

    @Override
    public IChordState nextChord() {
        return null;
    }
}
