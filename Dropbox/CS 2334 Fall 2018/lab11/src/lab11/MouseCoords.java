package lab11;

public class MouseCoords 

    extends java.applet.Applet 

    implements java.awt.event.MouseListener 

{ 

  /**
     * 
     */
    private static final long serialVersionUID = 1L;
String strpaint = "No click as yet" ; 

 

  public MouseCoords () 

  { 

    addMouseListener ( this ) ; 

 

    setBackground ( java.awt.Color.orange ) ; 

  } 

 

  public void paint ( java.awt.Graphics  gr ) 

  { 

    gr.drawString ( strpaint , 10 , 20 ); 

  } 

 

  public void mouseClicked 

   ( java.awt.event.MouseEvent  ev  ) 

  { 

    int x ,y ; 

     

    x = ev.getX() ;     

    y = ev.getY() ;     

 

    strpaint = " x = "   +  x  +   " , y = "   +  y  ; 

    repaint (); 

  } 

   

  public void mousePressed(java.awt.event.MouseEvent ev) { } 

  public void mouseReleased(java.awt.event.MouseEvent ev) { } 

  public void mouseEntered(java.awt.event.MouseEvent ev) { } 

  public void mouseExited(java.awt.event.MouseEvent ev) { } 

} 