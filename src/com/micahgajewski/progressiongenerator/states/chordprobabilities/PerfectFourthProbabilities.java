package com.micahgajewski.progressiongenerator.states.chordprobabilities;

import com.micahgajewski.progressiongenerator.interfaces.IChordProbabilityState;
import com.micahgajewski.progressiongenerator.types.Chord;
import com.micahgajewski.progressiongenerator.types.Interval;
import com.micahgajewski.progressiongenerator.types.chords.PerfectFourth;
import jm.music.data.CPhrase;

/**
 * Created by Micah on 4/17/2014.
 */
public class PerfectFourthProbabilities extends ChordProbabilities implements IChordProbabilityState {

    private Chord[] majorTriad = {Chord.MAJOR_FIRST,  Chord.MINOR_SECOND, Chord.PERFECT_FIFTH, Chord.DIMINISHED_SEVENTH};
    private Chord[] minorTriad = {Chord.MAJOR_FIRST, Chord.MINOR_SECOND, Chord.MINOR_THIRD, Chord.PERFECT_FOURTH,
            Chord.PERFECT_FIFTH, Chord.MINOR_SIXTH, Chord.DIMINISHED_SEVENTH};
    private Chord[] majorSeventhTriad = {Chord.MAJOR_FIRST, Chord.MINOR_SECOND, Chord.MINOR_THIRD, Chord.PERFECT_FOURTH,
            Chord.PERFECT_FIFTH, Chord.MINOR_SIXTH, Chord.DIMINISHED_SEVENTH};
    private Chord[] minorSeventhTriad = {Chord.MAJOR_FIRST, Chord.MINOR_SECOND, Chord.MINOR_THIRD, Chord.PERFECT_FOURTH,
            Chord.PERFECT_FIFTH, Chord.MINOR_SIXTH, Chord.DIMINISHED_SEVENTH};

    public PerfectFourthProbabilities(int root, double duration) {
        super(root, duration);
        super.majorTriad = majorTriad;
        super.minorTriad = minorTriad;
        super.minorSeventhTriad = minorSeventhTriad;
        super.majorSeventhTriad = majorSeventhTriad;
    }

    @Override
    public CPhrase getChord() {
        CPhrase chord = new CPhrase();
        int[] notes = new PerfectFourth().getNotes(root + Interval.PERFECT_FOURTH);
        chord.addChord(notes, duration);
        return chord;
    }
}
