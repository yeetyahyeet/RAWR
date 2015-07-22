import java.awt.Graphics;

public class Map {
   private int myNumTilesWide, myNumTilesHigh,
                    myTileWidth, myTileHeight;

   public Map(int numTilesWide, int numTilesHigh, 
                   int tileWidth, int tileHeight) {
      myNumTilesWide = numTilesWide;
      myNumTilesHigh = numTilesHigh;
      myTileWidth = tileWidth;
      myTileHeight = tileHeight;
   }

   public void draw(Graphics pen) {}

   public void readData(String file) {}

   public int getTileWidth() {
      return myTileWidth;      
   }
   public int getTileHeight() {
      return myTileHeight;
   }
   public int getNumTilesWide() {
      return myNumTilesWide;
   }
   public int getNumTilesHigh() {
      return myNumTilesHigh;
   }
}