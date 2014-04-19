package com.micahgajewski.progressiongenerator.clients;

import com.micahgajewski.progressiongenerator.contexts.ProgressionContext;
import com.micahgajewski.progressiongenerator.types.Interval;
import com.micahgajewski.progressiongenerator.strategies.MajorTriadProgression;
import jm.JMC;
import jm.music.data.Part;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;

/**
 * Created by Micah on 4/17/2014.
 */

public final class ProgressionGenerator implements JMC, Interval {
    private  Score s = new Score("Auto-Generated Progression");
    private  Part p = new Part("Piano", 0, 0);
//    private Phrase phrase = new Phrase(0.0);
//    private double[] rhythms = new double[] {0.25, 0.25, 0.25, 0.25};

    public static void main(String[] args) {
        new ProgressionGenerator();
    }

    public ProgressionGenerator() {
        ProgressionContext context = new ProgressionContext();
        context.setProgressionStrategy(new MajorTriadProgression());
        p = context.createProgression(p, 4, C4);

//
//        CPhrase chord = new CPhrase();
//        int[] arr = {C4,C4+MAJOR_THIRD,C4+PERFECT_FIFTH};
//        chord.addChord(arr, QN);
//        p.addCPhrase(chord);
//        int[] arr2 = {G4,G4+MAJOR_THIRD,G4+PERFECT_FIFTH};
//        chord.addChord(arr2, QN);
//        p.addCPhrase(chord);

        s.addPart(p);
        View.show(s);
        Write.midi(s, "Progression.mid");
        Play.midi(s);
    }

//
//    private  void triad(int rootPitch) {
//        // build the chord from the rootPitch
//        int[] pitchArray = new int[3];
//        pitchArray[0] = rootPitch;
//        if(Math.random() > 0.5) {
//            pitchArray[1] = rootPitch + 4; // major
//        } else pitchArray[1] = rootPitch + 3; // minor
//        pitchArray[2] = rootPitch + 7;
//        //add chord to the part
//        CPhrase chord = new CPhrase();
//        chord.addChord(pitchArray, rhythms[(int)(Math.random() * rhythms.length)]);
//        p.addCPhrase(chord);
//    }
}
