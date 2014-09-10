package bulletgame;

public class SinceBullet extends DirectionalBullet {
	  private float trackX;
	  private float trackY;
	  private int angelXY = 90;
	  
	  
	public SinceBullet(float x, float y, float dir, float velocity) {
		super(x, y, dir, velocity);
		this.trackX = velocity * (float)(Math.sin(Math.PI*dir/180)); // rw it sarub gun
		this.trackY = velocity * (float)(Math.cos(Math.PI*dir/180));
     }

	 public void update(int delta) {
		 super.update(delta);
		 angelXY+=15;
		 x-= trackX * (float)(Math.sin(Math.PI*angelXY/180));
		 y-= trackY * (float)(Math.sin(Math.PI*angelXY/180));
		System.out.println(trackX + " " + trackY + " " + angelXY);
	 }
}
