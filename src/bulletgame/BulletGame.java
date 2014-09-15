package bulletgame;

import java.util.LinkedList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;



public class BulletGame extends BasicGame{
	
	private LinkedList<Entity> entities;
	
	public BulletGame(String title) {
		super(title);
		entities = new LinkedList<Entity>();
	}

	
	 @Override
	  public void render(GameContainer container, Graphics g) throws SlickException {
	    for (Entity entity : entities) {
	      entity.render(g);
	    }
	  }
	 
	  @Override
	  public void update(GameContainer container, int delta) throws SlickException {
	    for (Entity entity : entities) {
	      entity.update(delta);
	    }
	  }
	  
	  @Override
	  public void init(GameContainer container) throws SlickException {
		//entities.add(new SineBullet(320,240,0,10));
		  //entities.add(new DirectionalBullet(320,240,0,10));
		    entities.add(new StarBullet(320,240,5, new DirectionalBulletFactory()));
		  entities.add(new StarBullet(420,140,4, new SineBulletFactory()));
		   entities.add(new StarBullet(220,340,7, new RandomDirectionalBulletFactory()));
		  }
	 
	public static void main(String[] args) {
	    try {   	
	    	BulletGame game = new BulletGame("BulletGame");
	        AppGameContainer container = new AppGameContainer(game);
	      container.setDisplayMode(640, 480, false);
	      container.setMinimumLogicUpdateInterval(1000 / 30);
	      container.start();
	    } catch (SlickException e) {
	      e.printStackTrace();
	    }
	  }

}
