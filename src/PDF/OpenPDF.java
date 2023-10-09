/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author cuong
 */
public class OpenPDF {

    public static void openByID(String ID) {
        try {
            if ((new File("D:\\"+ID+".pdf")).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler D:\\" + ID + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File không tồn tại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
