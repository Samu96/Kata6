package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("Kata 3: HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    public void execute(){
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private JPanel createPanel() {
        ChartPanel charPanel = new ChartPanel(createChart(createDataset()));
        charPanel.setPreferredSize(new Dimension(500,400));
        return charPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart FreeChart = ChartFactory.createBarChart(
                "Histograma JFreeChart",
                "Dominios Email",
                "Nº Emails",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return FreeChart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15,"","Hotmail.es");
        dataset.addValue(27,"","gmail.es");
        dataset.addValue(15,"","ulpgc.es");
        return dataset;
    }
    
}
