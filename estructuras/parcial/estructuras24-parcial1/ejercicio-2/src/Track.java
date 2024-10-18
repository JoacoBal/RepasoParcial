package src;

/**
 * Almacena los detalles de una pista de audio,
 * incluyendo el artista, título y nombre de archivo.
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    
    /**
     * @post Crea una pista con los datos provistos.
     */
    public Track(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }
    
    /**
     * @post Retorna el artista.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * @post Retorna el título.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @post Retorna el nombre de archivo.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * @post Retorna los detalles de la pista como un String.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")";
    }
        
    public boolean equals(Object other) {
        Track t = (Track) other;
        return title.equals(t.title) && artist.equals(t.artist);
    }
    
}
