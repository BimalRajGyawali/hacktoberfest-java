package org.example.swing.CliqueSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class RoundButton extends JButton {
    public boolean changeColor;
    public Shape shape;
    public RoundButton() {
        this(null);
    }

    public RoundButton(String text) {
        super(text);
        Dimension size = getPreferredSize();
        setPreferredSize(new Dimension(56, 56));
        setContentAreaFilled(false);
        changeColor = false;
    }

    protected void paintComponent( Graphics g ) {
        if( getModel().isArmed() ) {
            g.setColor( Color.lightGray );
        } else if (!changeColor) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.blue);
        }
        g.fillOval( 0,0,getSize().width-1,getSize().height-1 );
        super.paintComponent( g );
    }

    protected void paintBorder( Graphics g ) {
        g.setColor( getForeground() );
        g.drawOval( 0,0,getSize().width-1,getSize().height-1 );
    }

    public boolean contains( int x,int y ) {
        if( shape == null || !shape.getBounds().equals(getBounds()) ) {
            shape = new Ellipse2D.Float( 0,0,getWidth(),getHeight() );
        }
        return( shape.contains( x,y ) );
    }
}
