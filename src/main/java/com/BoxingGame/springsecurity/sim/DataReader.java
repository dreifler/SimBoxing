/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoxingGame.springsecurity.sim;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import com.BoxingGame.springsecurity.entity.Boxer;

/**
 *
 * @author darrenreifler
 */
public class DataReader {
    private static final String BoxerIN =  "boxerIn.txt";
    private Set<Boxer> boxerSet = new HashSet<Boxer>();
    
    public Set CreateBoxers() throws IOException {
        String name;
        String thisLine;
        String boxer[];
        Style style;
        this.boxerSet.clear();
        
        try(
            BufferedReader br =
                    Files.newBufferedReader(Paths.get(BoxerIN))){
            //SortedMap mapping boxer object to names
            while((thisLine = br.readLine()) != null) {
               boxer = thisLine.split(";");
               name = boxer[0];
               style = Style.valueOf(boxer[1]);
               this.boxerSet.add(new Boxer(name, style));
            }
           
        }
        return this.boxerSet;
    }
    
}
