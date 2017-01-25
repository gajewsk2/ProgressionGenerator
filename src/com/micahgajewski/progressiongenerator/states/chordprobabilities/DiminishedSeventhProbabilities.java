package com.micahgajewski.progressiongenerator.states.chordprobabilities;

import com.micahgajewski.progressiongenerator.interfaces.IChordProbabilityState;
import com.micahgajewski.progressiongenerator.types.Chord;
import com.micahgajewski.progressiongenerator.types.chords.*;
import jm.music.data.CPhrase;

/**
 * Created by Micah on 4/17/2014.
 */
public class DiminishedSeventhProbabilities extends ChordProbabilities implements IChordProbabilityState {

    private Chord[] majorTriad = {Chord.MAJOR_FIRST, Chord.MINOR_THIRD, Chord.PERFECT_FIFTH};
    private Chord[] minorTriad = {Chord.MAJOR_FIRST, Chord.MINOR_SECOND, Chord.MINOR_THIRD, Chord.PERFECT_FOURTH,
            Chord.PERFECT_FIFTH, Chord.MINOR_SIXTH, Chord.DIMINISHED_SEVENTH};
    private Chord[] majorSeventhTriad = {Chord.MAJOR_FIRST, Chord.MINOR_SECOND, Chord.MINOR_THIRD, Chord.PERFECT_FOURTH,
            Chord.PERFECT_FIFTH, Chord.MINOR_SIXTH, Chord.DIMINISHED_SEVENTH};
    private Chord[] minorSeventhTriad = {Chord.MAJOR_FIRST, Chord.MINOR_SECOND, Chord.MINOR_THIRD, Chord.PERFECT_FOURTH,
            Chord.PERFECT_FIFTH, Chord.MINOR_SIXTH, Chord.DIMINISHED_SEVENTH};

    public DiminishedSeventhProbabilities(int root, double duration) {
        super(root, duration);
        super.majorTriad = majorTriad;
        super.minorTriad = minorTriad;
        super.minorSeventhTriad = minorSeventhTriad;
        super.majorSeventhTriad = majorSeventhTriad;
    }

    @Override
    public CPhrase getChord() {
        CPhrase chord = new CPhrase();
        int[] notes = new DiminishedSeventh().getNotes(root);
        chord.addChord(notes, duration);
        return chord;
    }
}
