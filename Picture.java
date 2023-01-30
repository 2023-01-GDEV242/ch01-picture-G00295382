/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Bradley Risack
 * created using template by Michael Kšlling and David J. Barnes
 * @version 2023.01.30
 */
public class Picture
{
    private Square sky;
    private Triangle mountain1;
    private Triangle mountain2;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        mountain1 = new Triangle(); 
        mountain2 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.changeSize(20000);
            sky.moveHorizontal(-400);
            sky.moveVertical(-200);
            sky.makeVisible();
            
            mountain1.changeColor("green");
            mountain1.changeSize(100, 360);
            mountain1.moveHorizontal(-30);
            mountain1.moveVertical(60);
            mountain1.makeVisible();
            
            mountain2.changeColor("green");
            mountain2.changeSize(100, 360);
            mountain2.moveHorizontal(140);
            mountain2.moveVertical(60);
            mountain2.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-170);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        mountain1.changeColor("black");
        mountain2.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        mountain1.changeColor("green");
        mountain2.changeColor("green");
        sun.changeColor("yellow");
    }
}
