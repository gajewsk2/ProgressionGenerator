package com.micahgajewski.progressiongenerator.strategies;

import com.micahgajewski.progressiongenerator.interfaces.IChordProbabilityState;
import com.micahgajewski.progressiongenerator.interfaces.IProgressionStrategy;
import com.micahgajewski.progressiongenerator.states.chordprobabilities.MajorFirstProbabilities;
import com.micahgajewski.progressiongenerator.types.Progression;
import jm.JMC;
import jm.music.data.CPhrase;

/**
 * Created by Micah on 4/17/2014.
 */
public class MajorTriadProgression implements IProgressionStrategy, JMC {

    private IChordProbabilityState state;
    private Progression name = Progression.MAJOR_TRIAD;

    public MajorTriadProgression(int root, double duration){
        state = new MajorFirstProbabilities(root, duration);
    }

    @Override
    public CPhrase getChord(int root, double duration) {
        CPhrase chord = state.getChord();
        state = state.nextChord(name);
        return chord;
    }

    @Override
    public Progression getName() {
        return name;
    }
}
