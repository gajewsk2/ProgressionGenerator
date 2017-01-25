package com.micahgajewski.progressiongenerator.states.chordprobabilities;

import com.micahgajewski.progressiongenerator.interfaces.IChordProbabilityState;
import com.micahgajewski.progressiongenerator.types.Chord;
import com.micahgajewski.progressiongenerator.types.Progression;

/**
 * Created by Micah on 4/19/2014.
 */
public abstract class ChordProbabilities implements IChordProbabilityState {

    protected int root;
    protected double duration;
    protected Chord[] majorTriad;
    protected Chord[] minorTriad;
    protected Chord[] majorSeventhTriad;
    protected Chord[] minorSeventhTriad;

    public ChordProbabilities(int root, double duration){
        this.root = root;
        this.duration = duration;
    }

    protected IChordProbabilityState initializeProbability(Chord chord){
        IChordProbabilityState state = null;
        switch (chord) {
            case MAJOR_FIRST:
                state = new MajorFirstProbabilities(root, duration);
                break;
            case MINOR_SECOND:
                state = new MinorSecondProbabilities(root, duration);
                break;
            case MINOR_THIRD:
                state = new MinorThirdProbabilities(root, duration);
                break;
            case PERFECT_FOURTH:
                state = new PerfectFourthProbabilities(root, duration);
                break;
            case PERFECT_FIFTH:
                state = new PerfectFifthProbabilities(root, duration);
                break;
            case MINOR_SIXTH:
                state = new MinorSixthProbabilities(root, duration);
                break;
            case DIMINISHED_SEVENTH:
                state = new DiminishedSeventhProbabilities(root, duration);
                break;
            default:
                break;
        }
        return state;
    }

    @Override
    public IChordProbabilityState nextChord(Progression name) {
        Chord chord;
        Chord[] possibleChords = null;
        switch(name){
            case MAJOR_TRIAD:
                possibleChords = majorTriad;
                break;
            case MINOR_TRIAD:
                break;
            case MAJOR_SEVENTH:
                break;
            case MINOR_SEVENTH:
                break;
            default:
                break;
        }
        int total = possibleChords.length;
        int index = (int)(Math.random()*total);
        chord = possibleChords[index];

        return initializeProbability(chord);
    }
}
