package spotifi;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.*;


public class musicStuff {
    
    
    
    static musicStuff player = new musicStuff(); 
    
    
    String musicLocation;

    
    List<song> userPlaylist = new ArrayList();
    Scanner scan = new Scanner(System.in);
    
   
    //Credit to YouTuber Max O'Didily whose video helped with the development of this code 
    //that allows for the program to play music. 
    
    void playMusic(song sample)
    {
        

        long currentPosition;
        boolean loop =  false;
        String input;

       musicLocation = sample.path;
       
        try{
            
            File musicPath = new File(musicLocation);
            
            if(musicPath.exists()){ 
            
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                
                System.out.println("Now Playing " + sample.name);
                while(true){
                    loop = false;
                    currentPosition = clip.getMicrosecondPosition();
                    System.out.println("Controls:  PAUSE     PLAY     NEXT    LOOP");
                    
                    input = scan.nextLine();
                    
                    if(input.equalsIgnoreCase("PAUSE")){
                        currentPosition = clip.getMicrosecondPosition();
                        clip.stop();
                    }
                    
                    if(input.equalsIgnoreCase("PLAY")){
                        clip.setMicrosecondPosition(currentPosition); 
                        clip.start();
                    }
                    
                    if(input.equalsIgnoreCase("NEXT")){
                        clip.stop();
                        break;
                    }
                    
                    if(input.equalsIgnoreCase("LOOP")){
                        loop = true;
                    }
    
                    if((clip.getMicrosecondPosition() == clip.getMicrosecondLength())){
                        if(loop == true){
                            clip.start();
                        }
                        else{
                            clip.stop();
                            return;
                        }
                    }
                    
                    
                }
                
                
                
            }
            else{
            System.out.println("Can't find file");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
        
        
    }
    
    
    //Creating the part of the code that handles the user experience for the music player
    void musicPlayer(){
        
        while(true){
        System.out.println("SEARCH    PLAY USER PLAYLIST    PRINT USER PLAYLIST    QUIT");
        String input = scan.nextLine();
        
        
        if(input.equalsIgnoreCase("SEARCH")){
            
            System.out.println("Enter the name of the song");
            String substring = scan.nextLine();
            Boolean found = false;
            for(int i = 0; i < Spotifi.allSongs.length; i++){
                if(Spotifi.allSongs[i].name.toLowerCase().contains(substring.toLowerCase())){
                    found = true;
                    
                    song foundSong = Spotifi.allSongs[i];
                    System.out.println("We found this song: " + foundSong.name);
                    System.out.println("PLAY    ADD TO PLAYLIST    IGNORE");
                    
                    input = scan.nextLine();
                    
                    if(input.equalsIgnoreCase("ADD TO PLAYLIST")){
                        userPlaylist.add(foundSong);
                        break;
                    }
                    if(input.equalsIgnoreCase("PLAY")){
                        playMusic(foundSong);
                        break;
                        
                    }

                    
                    }
               }
            if(found == false){
                       System.out.println("Sorry, we could not find that song");
                    }
            
        }

        if(input.equalsIgnoreCase("PLAY USER PLAYLIST")){                  
             playUserPlaylist();

                    }
                    
        if(input.equalsIgnoreCase("PRINT USER PLAYLIST")){
            System.out.println(printPlaylist());
        }
        
        if(input.equalsIgnoreCase("QUIT")){
            return;
        }
       }
    
    }
    
    
    
    //Plays all songs in user created playlist in the order in which they were added 
    public void playUserPlaylist(){
        
        for(int i = 0; i<userPlaylist.size(); i++){
            playMusic(userPlaylist.get(i));
        }
        
       
    
    }
    
    //Prints out all songs in user created playlist 
    public String printPlaylist(){
        String playlist = "";
        for(int i = 0; i<userPlaylist.size(); i++){
                playlist = playlist + (i+1) + ". " + userPlaylist.get(i).name + "\n";
            }
        return playlist; 
    }
    
}


