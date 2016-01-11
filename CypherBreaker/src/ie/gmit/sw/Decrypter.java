package ie.gmit.sw;

import java.util.concurrent.BlockingQueue;

public class Decrypter implements Runnable{ // implements runnable 
	
	private BlockingQueue<Resultable> queue;
	private String cypherText;
	private int key;
	
	public Decrypter(BlockingQueue<Resultable> queue, String cypherText) {
		super();
		this.queue = queue;
		this.cypherText = cypherText;
	}

	public void run() {
		RailFence rf = new RailFence();
		String plainText = rf.decrypt(cypherText, key);
		//Get the Score
		
		Resultable r = null; // Creates result
		try {
			queue.put(r);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
