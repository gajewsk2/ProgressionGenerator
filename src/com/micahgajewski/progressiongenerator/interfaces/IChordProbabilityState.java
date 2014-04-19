package com.micahgajewski.progressiongenerator.interfaces;

import com.micahgajewski.progressiongenerator.types.Progression;
import jm.music.data.CPhrase;

/**
 * Created by Micah on 4/17/2014.
 */
public interface IChordProbabilityState {
    CPhrase getChord(int root, double duration);
    IChordProbabilityState nextChord(Progression name);
}
