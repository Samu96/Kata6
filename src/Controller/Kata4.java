package Controller;

import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import java.io.IOException;
import java.util.List;

public class Kata4 {

    public static void main(String[] args){
        Kata4 kata = new Kata4();
    }
    
    private List<Mail> mailList;
    private Histogram<String> histogram;
    public void execute() throws IOException{
        input();
        process();
        output();
        
    }
    
    private void input() throws IOException {
        String filename = new String(".\\src\\Controller\\emails.txt");
        mailList = MailListReader.read(filename);
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
   
    
}
