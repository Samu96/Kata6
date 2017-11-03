package Controller;

import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import java.io.IOException;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String filename = new String(".\\src\\Controller\\emails.txt");
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
        
        
        
    }
    
}
