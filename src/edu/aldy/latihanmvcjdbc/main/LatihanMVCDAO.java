/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aldy.latihanmvcjdbc.main;

import edu.aldy.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.aldy.latihanmvcjdbc.entity.Pelanggan;
import edu.aldy.latihanmvcjdbc.error.PelangganException;
import edu.aldy.latihanmvcjdbc.service.PelangganDao;
import edu.aldy.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 * Aldy Putra H
 *  10119047
 *  IF2
 */
public class LatihanMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable(){ 
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
