import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFinder {

  public static File findfile() {
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "CSV files", "csv");
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(chooser);
    File file = chooser.getSelectedFile();
    return file;
  }
}
