package com.micahgajewski.progressiongenerator.states.chordprobabilities;

import com.micahgajewski.progressiongenerator.interfaces.IChordProbabilityState;
import com.micahgajewski.progressiongenerator.interfaces.IProgressionStrategy;
import com.micahgajewski.progressiongenerator.types.Progression;
import com.micahgajewski.progressiongenerator.types.chords.MajorFirst;
import jm.music.data.CPhrase;

import static com.micahgajewski.progressiongenerator.types.Progression.MAJOR_TRIAD;
//import chords;

/**
 * Created by Micah on 4/17/2014.
 */
public class MajorFirstProbabilities implements IChordProbabilityState {

    @Override
    public CPhrase getChord(int root, double duration) {
        CPhrase chord = new CPhrase();
        int[] notes = new MajorFirst().getNotes(root);
        chord.addChord(notes, duration);
        return chord;
    }

    @Override
    public IChordProbabilityState nextChord(Progression name) {
        swith(name){
            case MAJOR_TRIAD:
//                break;
        }
    }
}
