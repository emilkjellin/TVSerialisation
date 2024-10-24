import java.util.ArrayList;
import java.io.Serializable;
import java.util.Scanner;

public class TvSeries implements Serializable {
   private String name;
   private ArrayList<Integer> episodes = new ArrayList<>();
   private int rating;
   public TvSeries() {

   }

   public TvSeries (String inName)
   {
   this.name = inName;
   }



}
