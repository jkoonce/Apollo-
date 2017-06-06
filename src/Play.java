import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Play {

	public static void main(String args[]) {
		
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("BYNON  Bishøp - Hey Hey.mp3");
			Player player = new Player(fileInputStream);
			player.play();
			System.out.println("Playing song...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			
		}
	}
}
