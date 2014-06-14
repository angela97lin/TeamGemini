import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;

public class Key implements MouseMotionListener, MouseListener{

   
    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){
    }


    public void mouseReleased(MouseEvent e){

    }

    public void mouseDragged(MouseEvent e){

    }
    public void mouseClicked(MouseEvent e){
	Point p = e.getPoint();
	//I think this goes here..
	//if the state == the settings one
	//then set profPic to the image that is currently in the boundaries
	if(GamePlay.state == 1){//game mode
	    if () //if on a specific card

	}
	if(GamePlay.state == 2){//settings page

	}
	if(GamePlay.state == 3){

	}
	
    }

    public void mouseMoved(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
    }







}
