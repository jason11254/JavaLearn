package com.lab.ocp.day19.playgame;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class FightJFrame extends javax.swing.JFrame {

    boolean isReady = true;
    boolean isRunning = false;

    private ImageIcon[] icon_ready = {
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\ready_0.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\ready_1.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\ready_2.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\ready_3.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\ready_4.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\ready_5.png")
    };

    private ImageIcon[] icon_fight = {
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\fight_0.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\fight_1.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\fight_2.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\fight_3.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\fight_4.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\fight_5.png")
    };

    private ImageIcon[] icon_run = {
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_0.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_1.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_2.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_3.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_4.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_5.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_6.png"),
        new ImageIcon("src\\main\\java\\com\\lab\\ocp\\day19\\playgame\\images\\running_7.png")
    };

    class Ready extends Thread {

        @Override
        public void run() {
            for (int i = 0;;) {
                if (isRunning) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    continue;
                }
                i = i % icon_ready.length;
                if (isReady) {
                    actor.setIcon(icon_ready[i]);
                } else {
                    actor.setIcon(icon_fight[i]);
                }
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                i++;
            }
        }

    }

    class Running extends Thread {

        int x, y;

        {
            x = actor.getX();
            y = actor.getY();
        }

        @Override
        public void run() {
            for (int i = 0;;) {
                if (!isRunning) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    continue;
                }
                i = i % icon_run.length;
                //移動
                x += 10;
                actor.setLocation(x, y);
                System.out.println(actor.getX());

                actor.setIcon(icon_run[i]);
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                }
                i++;

            }
        }
    }

    public FightJFrame() {
        initComponents();
        actor.setIcon(icon_ready[0]);
        new Ready().start();
        new Running().start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actor = new javax.swing.JLabel();
        actor_run = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actorMousePressed(evt);
            }
        });
        actor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                actorKeyPressed(evt);
            }
        });

        actor_run.setText("跑步");
        actor_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actor_runActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actor_run)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(actor_run)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actorKeyPressed
        int keyCode = evt.getKeyCode();
        if (keyCode == KeyEvent.VK_Z) {  //右鍵
            isReady = !isReady;
        }
    }//GEN-LAST:event_actorKeyPressed

    private void actorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actorMousePressed
        isReady = !isReady;
        isRunning = false;
    }//GEN-LAST:event_actorMousePressed

    private void actor_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actor_runActionPerformed
        isRunning = !isRunning;
    }//GEN-LAST:event_actor_runActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actor;
    private javax.swing.JButton actor_run;
    // End of variables declaration//GEN-END:variables
}
