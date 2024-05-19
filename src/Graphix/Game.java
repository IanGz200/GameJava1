/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Graphix;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author songo
 */
public class Game extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Game
     * @param graphix
     */
    public Game(Graphix graphix) {
        initComponents();
        
        String charLevel = Integer.toString(graphix.pdb.getSelectedPlayers().get(0).getLevel());
        String charName = graphix.pdb.getSelectedPlayers().get(0).getName();
        
        CharLevelLabel.setText(" Lvl: "+charLevel);
        CharNameLabel.setText(charName);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ActionsPanel = new javax.swing.JPanel();
        AttackButton = new javax.swing.JButton();
        DefendButton = new javax.swing.JButton();
        PotionButton = new javax.swing.JButton();
        PotionCuantityButton = new javax.swing.JLabel();
        RunButton = new javax.swing.JButton();
        PlayerPanel = new javax.swing.JPanel();
        CharNameLabel = new javax.swing.JLabel();
        CharLevelLabel = new javax.swing.JLabel();
        MonsterPanel = new javax.swing.JPanel();
        MonNameLabel = new javax.swing.JLabel();
        MonLevelLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        DirectionPanel = new javax.swing.JPanel();
        LeftMovButton = new javax.swing.JButton();
        AheadMovButton = new javax.swing.JButton();
        RightMovButton = new javax.swing.JButton();
        MapPanel = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        AttackButton.setText("Attack");
        ActionsPanel.add(AttackButton);

        DefendButton.setText("Defend");
        ActionsPanel.add(DefendButton);

        PotionButton.setText("Potion");
        PotionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotionButtonActionPerformed(evt);
            }
        });
        ActionsPanel.add(PotionButton);

        PotionCuantityButton.setText("jLabel1");
        ActionsPanel.add(PotionCuantityButton);

        RunButton.setText("Run");
        ActionsPanel.add(RunButton);

        getContentPane().add(ActionsPanel, java.awt.BorderLayout.PAGE_END);

        CharNameLabel.setPreferredSize(new java.awt.Dimension(60, 20));
        PlayerPanel.add(CharNameLabel);

        CharLevelLabel.setPreferredSize(new java.awt.Dimension(50, 20));
        PlayerPanel.add(CharLevelLabel);

        getContentPane().add(PlayerPanel, java.awt.BorderLayout.WEST);

        MonNameLabel.setPreferredSize(new java.awt.Dimension(60, 20));
        MonsterPanel.add(MonNameLabel);

        MonLevelLabel.setPreferredSize(new java.awt.Dimension(50, 20));
        MonsterPanel.add(MonLevelLabel);

        getContentPane().add(MonsterPanel, java.awt.BorderLayout.LINE_END);

        jPanel6.setLayout(new java.awt.BorderLayout());

        LeftMovButton.setText("Left");
        LeftMovButton.setEnabled(false);
        DirectionPanel.add(LeftMovButton);

        AheadMovButton.setText("Ahead");
        AheadMovButton.setEnabled(false);
        DirectionPanel.add(AheadMovButton);

        RightMovButton.setText("Right");
        RightMovButton.setEnabled(false);
        DirectionPanel.add(RightMovButton);

        jPanel6.add(DirectionPanel, java.awt.BorderLayout.PAGE_END);

        MapPanel.setLayout(new java.awt.BorderLayout());

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        MapPanel.add(StartButton, java.awt.BorderLayout.CENTER);

        jPanel6.add(MapPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PotionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PotionButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        StartButton.setVisible(false);
        
        JLabel img = new JLabel("");
        ImageIcon image = new ImageIcon("C:\\Users\\songo\\Documents\\GitHub\\GameJava1\\build\\classes\\Graphix");
        MapPanel.add(img);
        
        img.setIcon(image);
        img.setSize(500, 500);
        img.setLocation(550,20);
        img.setVisible(true);
        
    }//GEN-LAST:event_StartButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionsPanel;
    private javax.swing.JButton AheadMovButton;
    private javax.swing.JButton AttackButton;
    private javax.swing.JLabel CharLevelLabel;
    private javax.swing.JLabel CharNameLabel;
    private javax.swing.JButton DefendButton;
    private javax.swing.JPanel DirectionPanel;
    private javax.swing.JButton LeftMovButton;
    private javax.swing.JPanel MapPanel;
    private javax.swing.JLabel MonLevelLabel;
    private javax.swing.JLabel MonNameLabel;
    private javax.swing.JPanel MonsterPanel;
    private javax.swing.JPanel PlayerPanel;
    private javax.swing.JButton PotionButton;
    private javax.swing.JLabel PotionCuantityButton;
    private javax.swing.JButton RightMovButton;
    private javax.swing.JButton RunButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}