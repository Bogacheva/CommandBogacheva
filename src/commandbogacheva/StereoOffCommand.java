/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandbogacheva;

import bsuir.mycommand.Command;

/**
 *
 * @author Alexander
 */
public class StereoOffCommand implements Command{
    Stereo stereo;
    
    public StereoOffCommand( Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute() {
        stereo.off();
        
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
