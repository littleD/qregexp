
import com.trolltech.qt.gui.*;
import com.trolltech.qt.sql.*;
import java.util.regex.*;

class MainWindow extends Ui_MainWindow {
	void process() {
		try {
			Pattern wiersz_p = Pattern.compile(LE_regexp.text());
			Matcher wiersz_m = wiersz_p.matcher(TE_in.toPlainText());
			TE_out.clear();
			int match_count = 0;
			while (wiersz_m.find() != false) {
				TE_out.append("Match "+ (match_count++) +": "+ wiersz_m.group());
				for (int i = 1; i <= wiersz_m.groupCount(); i++) {
					TE_out.append("\t"+i+": "+wiersz_m.group(i));
				}
			}
		}
		catch(PatternSyntaxException e) { TE_out.clear();TE_out.append(e.getMessage()); }
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
