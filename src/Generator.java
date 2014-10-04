import java.util.List;

public abstract class Generator {
    /**
     * Generate a list of hexes. {@link CatanGenerator} contains some useful static fields to help with this.
     * @return The generated list of hexes
     * @see CatanGenerator#SEA_HEXES
     * @see CatanGenerator#LAND_HEXES
     * @see CatanGenerator#ALL_LOCATIONS
     * @see CatanGenerator#ALL_NUMBERS
     */
    public abstract List<Hex> generateHexes();
}
