package com.micahgajewski.progressiongenerator.contexts;

import com.micahgajewski.progressiongenerator.interfaces.IProgressionStrategy;

/**
 * Created by Micah on 4/17/2014.
 */
public class ProgressionContext {

    private IProgressionStrategy strategy;

    public void setProgressionStrategy(IProgressionStrategy strategy)
    {
        this.strategy = strategy;
    }

    //use the strategy
//    public void createArchive(ArrayList<File> files)
//    {
//        strategy.compressFiles(files);
//    }
}
