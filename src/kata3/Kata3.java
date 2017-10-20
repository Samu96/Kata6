package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        for (int i = 0; i < 15; i++) {
            histogram.increment("gmail.com");            
        }
       
        for (int i = 0; i < 5; i++) {
            histogram.increment("ulpgc.com");           
        }
        for (int i = 0; i < 20; i++) {
            histogram.increment("ull.com");           
        }
        histogram.increment("hotmail.com");
        new HistogramDisplay(histogram).execute();
        
        
    }
    
}
