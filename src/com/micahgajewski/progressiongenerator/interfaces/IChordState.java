package com.micahgajewski.progressiongenerator.interfaces;

import jm.music.data.CPhrase;

/**
 * Created by Micah on 4/17/2014.
 */
public interface IChordState {
    CPhrase getChord(int root, double duration);
    IChordState nextChord();
}
