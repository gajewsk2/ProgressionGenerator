package com.micahgajewski.progressiongenerator.strategies;

import com.micahgajewski.progressiongenerator.interfaces.IChordState;
import com.micahgajewski.progressiongenerator.interfaces.IProgressionStrategy;
import com.micahgajewski.progressiongenerator.states.chordprobabilities.MajorFirstProbabilities;
import jm.JMC;
import jm.music.data.CPhrase;

/**
 * Created by Micah on 4/17/2014.
 */
public class MajorTriadProgression implements IProgressionStrategy, JMC {

    private IChordState state;

    public MajorTriadProgression(){
        state = new MajorFirstProbabilities();
    }

    @Override
    public CPhrase getChord(int root, double duration) {
        IChordState temp = state;
        state = state.nextChord();
        return temp.getChord(root, duration);
    }
}
