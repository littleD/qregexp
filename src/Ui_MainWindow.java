/********************************************************************************
 ** Form generated from reading ui file 'MainWindow.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.7.0
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QLineEdit LE_regexp;
    public QTextEdit TE_in;
    public QTextEdit TE_out;
    public QPushButton PB_process;
    public QMenuBar menubar;
    public QStatusBar statusbar;

    public Ui_MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(631, 702).expandedTo(MainWindow.minimumSizeHint()));
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        verticalLayout = new QVBoxLayout(centralwidget);
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(centralwidget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        LE_regexp = new QLineEdit(centralwidget);
        LE_regexp.setObjectName("LE_regexp");

        horizontalLayout.addWidget(LE_regexp);


        verticalLayout.addLayout(horizontalLayout);

        TE_in = new QTextEdit(centralwidget);
        TE_in.setObjectName("TE_in");

        verticalLayout.addWidget(TE_in);

        TE_out = new QTextEdit(centralwidget);
        TE_out.setObjectName("TE_out");
        TE_out.setMinimumSize(new QSize(300, 0));

        verticalLayout.addWidget(TE_out);

        PB_process = new QPushButton(centralwidget);
        PB_process.setObjectName("PB_process");

        verticalLayout.addWidget(PB_process);

        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 631, 20));
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Regexp:", null));
        PB_process.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Process", null));
    } // retranslateUi

}

