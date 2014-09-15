package bulletgame;

public class DirectionalBullet extends Bullet {
	  protected float dir;
	  protected float velocity;
	  private float trackX;
	  private float trackY;
	  
	  protected float getTrackX() {
		    return trackX;
		  }
		 
		  protected float getTrackY() {
		    return trackY;
		  }
		  
	  public DirectionalBullet(float x, float y, float dir, float velocity) {
	    super(x, y);
	    this.dir = dir;
	    this.velocity = velocity;
	    trackX = x;
	    trackY = y;
	  }
	 
	  public float getVelocity() {
	    return velocity;
	  }
	 
	  public float getDir() {
	    return dir;
	  }
	
	  public void update(int delta) {
		    updateTrack();
		    updatePosition(delta);
		  }
		 
	   protected void updatePosition(int delta) {
		    setXY(trackX, trackY);
	      }
		
		private void updateTrack() {
		    trackX += velocity * (float)(Math.cos(Math.PI*dir/180));
		    trackY -= velocity * (float)(Math.sin(Math.PI*dir/180));;
		  }
}