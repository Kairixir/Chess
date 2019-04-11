package game;

public class Board {
    private Tile[][] tiles;

    public Board(int sizeX, int sizeY) {
        tiles = new Tile[sizeX][sizeY];
        for (int i = 0;i<sizeX;i++){
            for(int j=0;j<sizeY;j++){
                tiles[i][j] = new Tile(i,j);
            }
        }

    }

    /**
     * Gets the multidimensional array of Tiles
     * @return multidimensional array of Tiles
     */
    public Tile[][] getTiles() {
        return tiles;
    }

    /**
     * Return concrete Tile at location
     * @param x location of Tile in the array
     * @param y location of Tile in the array
     * @return
     */
    public Tile getTile(int x, int y){
        return tiles[x][y];
    }
}
