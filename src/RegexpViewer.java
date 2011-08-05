
import com.trolltech.qt.gui.*;
import com.trolltech.qt.sql.*;
import java.util.regex.*;

class MainWindow extends Ui_MainWindow {
	void process() {
		Pattern wiersz_p = Pattern.compile(LE_regexp.text());
		System.out.println(TE_in.toPlainText());
		Matcher wiersz_m = wiersz_p.matcher(TE_in.toPlainText());
		while (wiersz_m.find() != false) {
			TE_out.append("Match: "+ wiersz_m);
			for (int i = 0; i < wiersz_m.groupCount(); i++) {
				TE_out.append(i+" "+wiersz_m.group(i)+"/n");
			}
		}
	}
	void setupNext() {
		PB_process.clicked.connect(this,"process()");
	}
}

public class RegexpViewer {
	public static void main(String[] args) {
		QApplication.initialize(args);
		QMainWindow mw = new QMainWindow();
		MainWindow ui = new MainWindow();
		ui.setupUi(mw);
		ui.setupNext();
		mw.show();
		QApplication.exec();
	}
}
