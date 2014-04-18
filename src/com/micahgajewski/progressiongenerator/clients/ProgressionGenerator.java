package com.micahgajewski.progressiongenerator.clients;

import com.micahgajewski.progressiongenerator.contexts.ProgressionContext;
import com.micahgajewski.progressiongenerator.statictype.Interval;
import jm.JMC;
import jm.music.data.CPhrase;
import jm.music.data.Part;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.View;
import jm.util.Write;
/**
 * Created by Micah on 4/17/2014.
 */
public final class ProgressionGenerator implements JMC, Interval {
    private  Score s = new Score("CPhrase class example");
    private  Part p = new Part("Piano", 0, 0);

    private double[] rhythms = new double[] {0.25, 0.5, 1.0, 2.0, 4.0};

    public static void main(String[] args) {
        ProgressionContext context = new ProgressionContext();
//        context.setProgressionStrategy(new MajorProgression());
        int a = AUGMENTED_UNISON;
        System.out.print(a);
        new ProgressionGenerator();
    }

    public ProgressionGenerator() {
//        for (int i = 0; i < 8; i++) {
//            triad(C4);
//        }
//        Chords c = new Chords();
        //pack the part into a score
        CPhrase chord = new CPhrase();
        int[] arr = {C4,C4+MAJOR_THIRD,C4+PERFECT_FIFTH};
        chord.addChord(arr, rhythms[(int)(Math.random() * rhythms.length)]);
        p.addCPhrase(chord);
        s.addPart(p);

        //display the music
        View.show(s);

        // write the score to a MIDIfile
        Write.midi(s, "ChordsAndBass.mid");
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
