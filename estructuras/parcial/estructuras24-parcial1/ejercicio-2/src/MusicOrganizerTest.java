package src;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The test class MusicOrganizerTest.
 */
public class MusicOrganizerTest
{
    @Test
    public void test0()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        assertEquals(3, organizer.getNumberOfTracks());
    }
    
    @Test
    public void test1()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        assertEquals(true, organizer.containsTrack(track1));
        assertEquals(true, organizer.containsTrack(track2));
        assertEquals(true, organizer.containsTrack(track3));
    }
    
    @Test
    public void test2()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        organizer.removeTrack(2);
        assertEquals(2, organizer.getNumberOfTracks());
    }
    
    @Test
    public void test3()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        organizer.removeTrack(2);
        assertEquals(true, organizer.containsTrack(track1));
        assertEquals(true, organizer.containsTrack(track2));
        assertEquals(false, organizer.containsTrack(track3));
    }
    
    @Test
    public void test4()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        assertThrows(IllegalArgumentException.class, 
            () -> organizer.removeTrack(3));
    }
    
    @Test
    public void test5()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        assertThrows(IllegalArgumentException.class, 
            () -> organizer.getTrack(3));
    }
    
    @Test
    public void test6()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.getTrack(1);
        assertEquals("Queen", res.getArtist());
        assertEquals("The show must go on", res.getTitle());
    }

    @Test
    public void test7()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.findByTitle("show");
        assertEquals("Queen", res.getArtist());
        assertEquals("The show must go on", res.getTitle());
    }
    
    @Test
    public void test8()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.findByTitle("aaaa");
        assertEquals(null, res);
    }
 
    @Test
    public void test9()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.findByArtist("Beatles");
        assertEquals("The Beatles", res.getArtist());
        assertEquals("Love me do", res.getTitle());
    }
    
    @Test
    public void test10()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.findByArtist("aaaa");
        assertEquals(null, res);
    }
    
    @Test
    public void test11()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.findByArtist("Beatles");
        Track expected = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        assertEquals(expected, res);
    }
    
    @Test
    public void test12()
    {
        MusicOrganizer organizer = new MusicOrganizer();
        Track track1 = new Track("The Beatles", "Love me do", "The Beatles-Love me do.mp3");
        Track track2 = new Track("Queen", "The show must go on", "Queen-The show must go on.mp3");
        Track track3 = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        organizer.addTrack(track1);
        organizer.addTrack(track2);
        organizer.addTrack(track3);
        Track res = organizer.findByTitle("Desarma");
        Track expected = new Track("Charly Garcia", "Desarma y sangra", "Charly Garcia-Desarma y sangra.mp3");
        assertEquals(expected, res);
    }
}

