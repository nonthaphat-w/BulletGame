package bulletgame;

import org.newdawn.slick.Graphics;

public class Bullet implements Entity {
	 
	  private static final float BULLET_SIZE = 5;
	  private float x;
	  private float y;
	 
	  public Bullet(float x, float y) {
	    this.setXY(x,y);    
	  }
	 
	  @Override
	  public void render(Graphics g) {
	    g.fillOval(getX(), getY(), BULLET_SIZE, BULLET_SIZE);
	  }
	 
	  @Override
	  public void update(int delta) {
	    y += 10;
	  }
	 
	  public float getX() {
	    return x;
	  }
	 
	  public float getY() {
	    return y;
	  }
	 
	  protected void setXY(float x, float y) {
	    this.x = x;
	    this.y = y;
	  }

	}
