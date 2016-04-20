/*
                              __      _____________
                             /  \    /  \_   _____/
                             \   \/\/   /|    __)_ 
                              \        / |        \
                               \__/\  / /_______  /
                                    \/          \/ 
                         ______________ ______________
                         \__    ___/   |   \_   _____/
                           |    | /    ~    \    __)_ 
                           |    | \    Y    /        \
                           |____|  \___|_  /_______  /
                                         \/        \/ 
                   _____________________ ____________________
                   \______   \_   _____//   _____/\__    ___/
                    |    |  _/|    __)_ \_____  \   |    |   
                    |    |   \|        \/        \  |    |   
                    |______  /_______  /_______  /  |____|   
                           \/        \/        \/            
*/
package weTheBest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class DJKhaled{
	
// part of means to invoke infinite while loop
private static String statement = "We The Best";
  
// recursive function/method
public static void saysAnotherOne() throws Exception {  
	// execute threaded methods in 2050 ms
	playAnotherOne();
	printAnotherOne();
	Thread.sleep(2050);
	// condition invokes infinite while loop. Recursion occurs.
	while (statement == "We The Best") {
		  saysAnotherOne();
	}
  }
  
private static void playAnotherOne(){
  Thread t = new Thread(new Runnable(){
    public void run(){
      try{
        // create stream with file being specified
        String playAnotherOne = "anotherone.au";
        InputStream stream = new FileInputStream(playAnotherOne);        
        // create audiostream
        AudioStream audioStream = new AudioStream(stream);
        // audio plays
        AudioPlayer.player.start(audioStream);
      }
      catch (Exception e){
          e.printStackTrace();
      }
    }
  });
  t.start();
}
  
private static void printAnotherOne(){
  Thread t = new Thread(new Runnable(){
    public void run(){
      try{
        // print string obtained from returnStringOfAnotherOne()
        System.out.println(returnStringOfAnotherOne());
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
  });
  t.start();
}
  
  // returns String prior to printing at printAnotherOne()
private static String returnStringOfAnotherOne(){
  return String.format("Another one. \n");
	}
}