import java.awt.Graphics;

public class Map {
   public static int SOLID = -1;
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
   
   public class Tile {
      private String myFileName;
      private int myWeight;

      public Tile(String fileName, int weight) {
         myFileName = fileName;
         myWeight = weight;
      }

      public void draw(Graphics pen, int x, int y,
                            int width, int height) {}
      public String getFileName() {
         return myFileName;
      }
      public void setFileName(String fileName) {
         myFileName = fileName;
      }
      public int getWeight() {
         return myWeight;
      }
      public void setWeight(int weight) {
         myWeight = weight;
      }
   }
}