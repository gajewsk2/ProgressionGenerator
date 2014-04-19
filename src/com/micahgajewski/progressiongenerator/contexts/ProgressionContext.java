package com.micahgajewski.progressiongenerator.contexts;

import com.micahgajewski.progressiongenerator.interfaces.IProgressionStrategy;
import jm.JMC;
import jm.music.data.CPhrase;
import jm.music.data.Part;

/**
 * Created by Micah on 4/17/2014.
 */
public class ProgressionContext implements JMC {

    private IProgressionStrategy strategy;

    public void setProgressionStrategy(IProgressionStrategy strategy)
    {
        this.strategy = strategy;
    }

    public Part createProgression(Part part , int numberOfChords, int root)
    {
        CPhrase chord = null;
        for(int i = 0; i<numberOfChords; ++i){
            chord = strategy.getChord(root, QN);
            part.addCPhrase(chord);
        }

        return part;
    }
}
