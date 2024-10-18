package src;

import java.util.List;

/**
 * Almacena una secuencia de archivos de audio.
 * Permite buscar pistas por diferentes criterios.
 */
public class MusicOrganizer
{
    // An ArrayList for storing music files.
    private List<Track> tracks;

    /**
     * @post Crear un organizador de música vacío.
     */
    public MusicOrganizer()
    {

    }

    /**
     * @post Agregar una pista al final de la colección.
     */
    public void addTrack(Track track)
    {

    }

    /**
     * @post Retorna el número de pistas en la colección.
     */
    public int getNumberOfTracks()
    {

    }

    /**
     * @pre 0 <= 'index' < getNumberOfTracks(). Lanzar IllegalArgumentException
     *     si pre no se satisface.
     * @post Retorna la pista en la posición 'index'.
     */
    public Track getTrack(int index)
    {

    }

    /**
     * @post Retorna la primera pista cuyo título contiene la cadena
     *   'searchString'. Retorna null si no exista ninguna pista cuyo  
     *   título contiene 'searchString'.
     */
    public Track findByTitle(String searchString)
    {

    }
    
    /**
     * @post Retorna la primera pista cuyo artista contiene la cadena
     *   'searchString'. Retorna null si no exista ninguna pista cuyo  
     *   artista contiene 'searchString'.
     */
    public Track findByArtist(String searchString)
    {

    }

    /**
     * @pre 0 <= 'index' < getNumberOfTracks(). Lanzar IllegalArgumentException
     *     si pre no se satisface.
     * @post Elimina la pista en la posición 'index' de la colección.
     */
    public void removeTrack(int index)
    {

    }

    /**
     * @post Retorna verdadero si y solo si la colección
     *   contiene una pista con el mismo título y artista que
     *   'track'.
     */
    public boolean containsTrack(Track track)
    {

    }
    
}
