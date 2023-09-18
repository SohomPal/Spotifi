package spotifi;

/**
 *  
 * 
 */
public class Spotifi {
    
  public static song[] allSongs = new song[30];
  
  public static void main(String[] args) {
    
    
    
    musicStuff musicObject = new musicStuff();
    

    //Creating all song objects
    song song1 = new song("Daft Punk - Get Lucky", "Get Lucky.wav");
    song song2 = new song("Foster The People - Pumped Up Kicks", "Foster The People - Pumped Up Kicks (Official Video).wav");
    song song3 = new song("Capital Cities - Safe And Sound", "Capital Cities - Safe And Sound (Official Music Video).wav");
    song song4 = new song("Backstreet Boys - I Want It That Way", "I Want It That Way - Backstreet Boys (Lyrics) 🎵.wav");
    song song5 = new song("Masked Wolf - Astronaut In The Ocean", "Masked Wolf - Astronaut In The Ocean (Official Music Video).wav");
    song song6 = new song("Electric Light Orchestra - Mr. Blue Sky", "Mr. Blue Sky.wav");
    song song7 = new song("Nic D - Icee Pop", "Nic D - Icee Pop (Official Video).wav");
    song song8 = new song("OneRepublic - Counting Stars", "OneRepublic - Counting Stars (Official Music Video).wav");
    song song9 = new song("Eurythmics - Sweet Dreams (Are Made of This)", "Sweet Dreams (Are Made of This) (Remastered).wav");
    song song10 = new song("Toto - Africa", "Africa.wav");
    song song11 = new song("Rocky IV Soundtrack - Burning Heart", "Burning Heart (From 'Rocky IV' Soundtrack).wav");
    song song12 = new song("Daryl Hall & John Oates - Maneater", "Daryl Hall & John Oates - Maneater (Official Video).wav");
    song song13 = new song("Survivor - Eye of the Tiger", "Eye of the Tiger.wav");
    song song14 = new song("Phil Collins - I Don't Care Anymore", "I Don't Care Anymore (2016 Remaster).wav");
    song song15 = new song("Phil Collins - In The Air Tonight", "In The Air Tonight.wav");
    song song16 = new song("Kansas - Carry on Wayward Son", "Kansas - Carry on Wayward Son (Official Video).wav");
    song song17 = new song("Men At Work - Down Under", "Men At Work - Down Under (Video).wav");
    song song18 = new song("Pet Shop Boys - West End Girls", "Pet Shop Boys - West End Girls (Official Video) [HD REMASTERED].wav");
    song song19 = new song("Rick Astley - Never Gonna Give You Up", "Rick Astley - Never Gonna Give You Up (Official Music Video).wav");
    song song20 = new song("Simple Minds - Don't You (Forget About Me)", "Simple Minds - Don't You (Forget About Me).wav");
    song song21 = new song("Toto - Hold The Line", "Toto - Hold The Line (Official Video).wav");
    song song22 = new song("Blue Oyster Cult - (Don't Fear) The Reaper", "Blue Oyster Cult - (Don't Fear) The Reaper (Audio).wav");
    song song23 = new song("Cream - White Room", "Cream - White Room - Lyrics.wav");
    song song24 = new song("Bastille - Pompeii", "Bastille - Pompeii (Official Music Video).wav");
    song song25 = new song("Foreigner - I Want to Know What Love Is", "I Want to Know What Love Is (1999 Remaster).wav");
    song song26 = new song("Tears For Fears - Everybody Wants To Rule The World", "Tears For Fears Everybody Wants To Rule The World w_ Lyrics.wav");
    song song27 = new song("The Black Eyed Peas - I Gotta Feeling", "The Black Eyed Peas - I Gotta Feeling (Lyrics).wav");
    song song28 = new song("The Rolling Stones - Gimme Shelter", "The Rolling Stones - Gimme Shelter (Official Lyric Video).wav");
    song song29 = new song("The Rolling Stones - Paint It, Black", "The Rolling Stones - Paint It, Black (Official Lyric Video).wav");
    song song30 = new song("The Animals - House Of The Rising Sun", "House Of The Rising Sun.wav");
    
    //Adding all songs to a list 
    allSongs[0] = song1;
    allSongs[1] = song2;
    allSongs[2] = song3;
    allSongs[3] = song4;
    allSongs[4] = song5;
    allSongs[5] = song6;
    allSongs[6] = song7;
    allSongs[7] = song8;
    allSongs[8] = song9;
    allSongs[9] = song10;
    allSongs[10] = song11;
    allSongs[11] = song12;
    allSongs[12] = song13;
    allSongs[13] = song14;
    allSongs[14] = song15;
    allSongs[15] = song16;
    allSongs[16] = song17;
    allSongs[17] = song18;
    allSongs[18] = song19;
    allSongs[19] = song20;
    allSongs[20] = song21;
    allSongs[21] = song22;
    allSongs[22] = song23;
    allSongs[23] = song24;
    allSongs[24] = song25;
    allSongs[25] = song26;
    allSongs[26] = song27;
    allSongs[27] = song28;
    allSongs[28] = song29;
    allSongs[29] = song30;
    
    //Starting the music player                         
    musicObject.musicPlayer();

  }
}