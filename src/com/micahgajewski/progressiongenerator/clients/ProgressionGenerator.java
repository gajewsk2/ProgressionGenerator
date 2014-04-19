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

    public static void main(String[] args) {
        new ProgressionGenerator();
    }

    public ProgressionGenerator() {
        ProgressionContext context = new ProgressionContext();
        context.setProgressionStrategy(new MajorTriadProgression());
        p = context.createProgression(p, 1, C4);
        s.addPart(p);
        View.notate(p);
        Write.midi(s, "Progression.mid");
        Play.midi(s);
    }

}
