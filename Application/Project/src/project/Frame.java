
package project;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.commons.io.FileUtils;
import static project.Detector.Artefact_Choice;
import static project.ThumbCache.Exstract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zak
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Design1
     */
    public Frame() {
        initComponents();

    }

    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Artefact_Search_Directory = new javax.swing.JTextField();
        Art_SaveLoc_TxtField = new javax.swing.JTextField();
        Art_SaveLoc_Button = new javax.swing.JButton();
        Art_SearchDir_Button = new javax.swing.JButton();
        Save_Art_CheckBox = new javax.swing.JCheckBox();
        Art_Hash_CheckBox = new javax.swing.JCheckBox();
        Art_Select_ComboBox = new javax.swing.JComboBox();
        Artefact_Selection_Label = new javax.swing.JLabel();
        RecursiveSrch_CheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Art_Table = new javax.swing.JTable();
        Run_Art_Detector = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Thumb_FileLoc_TextField = new javax.swing.JTextField();
        Thumb_SaveLoc_TextField = new javax.swing.JTextField();
        Thumb_SaveLoc_Button = new javax.swing.JButton();
        Thumb_FileLoc_Button = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        Thumb_Table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Image_Num_Label = new javax.swing.JLabel();
        Location_Label = new javax.swing.JLabel();
        Hash_Label = new javax.swing.JLabel();
        Offset_Label = new javax.swing.JLabel();
        OffSet_Label = new javax.swing.JLabel();
        File_Size_Label = new javax.swing.JLabel();
        Thumb_Run_Button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        Exit_App = new javax.swing.JMenuItem();
        Save_Art_Table = new javax.swing.JMenuItem();
        Save_Thumbcache_Table = new javax.swing.JMenuItem();
        Thumb_Cache_Hash_Analysis = new javax.swing.JMenuItem();
        Artifact_Hash_Analysis = new javax.swing.JMenuItem();
        Edit_Menu = new javax.swing.JMenu();
        Clear_Art_Table = new javax.swing.JMenuItem();
        Clear_Thumbcache_Table = new javax.swing.JMenuItem();
        Options_Menu = new javax.swing.JMenu();
        Art_Help = new javax.swing.JMenuItem();
        Thumbcache_Help = new javax.swing.JMenuItem();
        Hash_Help = new javax.swing.JMenuItem();
        About_menu = new javax.swing.JMenu();
        App_Help = new javax.swing.JMenuItem();
        Bug_Menu = new javax.swing.JMenu();
        Report_Bug = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Artefact_Search_Directory.setText("Search Directory");

        Art_SaveLoc_TxtField.setText("Save Location");

        Art_SaveLoc_Button.setText("Select");
        Art_SaveLoc_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Art_SaveLoc_ButtonActionPerformed(evt);
            }
        });

        Art_SearchDir_Button.setText("Select");
        Art_SearchDir_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Art_SearchDir_ButtonActionPerformed(evt);
            }
        });

        Save_Art_CheckBox.setText("Save Found Artefacts");

        Art_Hash_CheckBox.setText("Hash Results");

        Art_Select_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NTuser", "ThumbCache", "SHD", "SPL", "PST", "LNK" }));
        Art_Select_ComboBox.setName(""); // NOI18N

        Artefact_Selection_Label.setText("Artefact");

        RecursiveSrch_CheckBox.setText("recursive search");

        Art_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "File Type", "File Size", "Location", "Created Date", "Last Modified", "Last Accessed", "Hash", "Changed Type"
            }
        ));
        jScrollPane1.setViewportView(Art_Table);

        Run_Art_Detector.setText("Run");
        Run_Art_Detector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Run_Art_DetectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Art_SaveLoc_TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Art_SaveLoc_Button))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Artefact_Search_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Art_SearchDir_Button)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecursiveSrch_CheckBox)
                            .addComponent(Art_Hash_CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Art_Select_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Artefact_Selection_Label)
                        .addGap(545, 545, 545)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save_Art_CheckBox)
                    .addComponent(Run_Art_Detector, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Artefact_Search_Directory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Art_SearchDir_Button)
                    .addComponent(Save_Art_CheckBox)
                    .addComponent(RecursiveSrch_CheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Art_SaveLoc_TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Art_SaveLoc_Button)
                    .addComponent(Art_Hash_CheckBox))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Art_Select_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Artefact_Selection_Label)))
                    .addComponent(Run_Art_Detector, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Artefact Detector", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Thumb_FileLoc_TextField.setText("ThumbCache File Location");

        Thumb_SaveLoc_TextField.setText("Save Location");

        Thumb_SaveLoc_Button.setText("Select");
        Thumb_SaveLoc_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_SaveLoc_ButtonActionPerformed(evt);
            }
        });

        Thumb_FileLoc_Button.setText("Select");
        Thumb_FileLoc_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_FileLoc_ButtonActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Hash Results");

        Thumb_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Image Number", "Location", "Hash", "OffSet", "Data Offset", "File Size"
            }
        ));
        Thumb_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thumb_TableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Thumb_Table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/p.JPEG"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setMinimumSize(new java.awt.Dimension(20, 20));

        Image_Num_Label.setText("Image Number:");

        Location_Label.setText("Location:");

        Hash_Label.setText("Hash:");

        Offset_Label.setText("OffSet:");

        OffSet_Label.setText("Data OffSet:");

        File_Size_Label.setText("File Size:");

        Thumb_Run_Button.setText("Run");
        Thumb_Run_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_Run_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Location_Label)
                                    .addComponent(Image_Num_Label)
                                    .addComponent(Hash_Label)
                                    .addComponent(Offset_Label)
                                    .addComponent(OffSet_Label)
                                    .addComponent(File_Size_Label))))
                        .addContainerGap(274, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Thumb_SaveLoc_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Thumb_SaveLoc_Button))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Thumb_FileLoc_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Thumb_FileLoc_Button)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Thumb_Run_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(268, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Thumb_FileLoc_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thumb_FileLoc_Button)
                            .addComponent(jCheckBox6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Thumb_SaveLoc_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thumb_SaveLoc_Button)))
                    .addComponent(Thumb_Run_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Image_Num_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Location_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hash_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Offset_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OffSet_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(File_Size_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thumbcache Extraction", jPanel2);

        File_Menu.setText("File");

        Exit_App.setText("Exit Application");
        Exit_App.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_AppActionPerformed(evt);
            }
        });
        File_Menu.add(Exit_App);

        Save_Art_Table.setText("Save Artifact Table");
        Save_Art_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Art_TableActionPerformed(evt);
            }
        });
        File_Menu.add(Save_Art_Table);

        Save_Thumbcache_Table.setText("Save ThumbCache Table");
        Save_Thumbcache_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Thumbcache_TableActionPerformed(evt);
            }
        });
        File_Menu.add(Save_Thumbcache_Table);

        Thumb_Cache_Hash_Analysis.setText("Hash Analysis ThumbCache Table");
        Thumb_Cache_Hash_Analysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_Cache_Hash_AnalysisActionPerformed(evt);
            }
        });
        File_Menu.add(Thumb_Cache_Hash_Analysis);

        Artifact_Hash_Analysis.setText("Hash Analysis Artifact Table");
        Artifact_Hash_Analysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artifact_Hash_AnalysisActionPerformed(evt);
            }
        });
        File_Menu.add(Artifact_Hash_Analysis);

        jMenuBar1.add(File_Menu);

        Edit_Menu.setText("Edit");

        Clear_Art_Table.setText("Clear Artifact Table");
        Clear_Art_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Art_TableActionPerformed(evt);
            }
        });
        Edit_Menu.add(Clear_Art_Table);

        Clear_Thumbcache_Table.setText("Clear Thumbcache Table");
        Clear_Thumbcache_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Thumbcache_TableActionPerformed(evt);
            }
        });
        Edit_Menu.add(Clear_Thumbcache_Table);

        jMenuBar1.add(Edit_Menu);

        Options_Menu.setText("Help");

        Art_Help.setText("Artefact Detector Help");
        Art_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Art_HelpActionPerformed(evt);
            }
        });
        Options_Menu.add(Art_Help);

        Thumbcache_Help.setText("Thumbcache Help");
        Thumbcache_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumbcache_HelpActionPerformed(evt);
            }
        });
        Options_Menu.add(Thumbcache_Help);

        Hash_Help.setText("Hash Analysis Help");
        Hash_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hash_HelpActionPerformed(evt);
            }
        });
        Options_Menu.add(Hash_Help);

        jMenuBar1.add(Options_Menu);

        About_menu.setText("About");

        App_Help.setText("Application Info");
        App_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                App_HelpActionPerformed(evt);
            }
        });
        About_menu.add(App_Help);

        jMenuBar1.add(About_menu);

        Bug_Menu.setText("Bug Report");

        Report_Bug.setText("Report Bug");
        Report_Bug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Report_BugActionPerformed(evt);
            }
        });
        Bug_Menu.add(Report_Bug);

        jMenuBar1.add(Bug_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Button initiates Artefact detection
    private void Run_Art_DetectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Run_Art_DetectorActionPerformed
/// When button is pressed checks are first made to ensure all options are correctly selected, if correct the artefact detection begins
        Path Search = Paths.get(Artefact_Search_Directory.getText());
        Path Save = Paths.get(Art_SaveLoc_TxtField.getText());

        if (Save_Art_CheckBox.isSelected() && Files.exists(Save) || !Save_Art_CheckBox.isSelected()) {
            if (Files.exists(Search)) {
                Artefact_Choice();

            } else {

                JOptionPane.showMessageDialog(null, "please select Valid search location");
            }
        } else {
            JOptionPane.showMessageDialog(null, "please select Valid save location");
        }

    }//GEN-LAST:event_Run_Art_DetectorActionPerformed
//Initiates When table entry is selected
    private void Thumb_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thumb_TableMouseClicked
        // When table entry is selected these values are loaded, they dispay the select entries image along with its details
        jLabel2.setIcon(new ImageIcon(Thumb_SaveLoc_TextField.getText() + "/Temp/" + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 0).toString() + ".JPEG")); // NOI18N
        Image_Num_Label.setText("Image Number: " + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 0).toString());
        Location_Label.setText("Location: " + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 1).toString());
        Hash_Label.setText("Hash: " + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 2).toString());
        Offset_Label.setText("OffSet: " + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 3).toString());
        OffSet_Label.setText("Data OffSet: " + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 4).toString());
        File_Size_Label.setText("File Size: " + Thumb_Table.getValueAt(Thumb_Table.getSelectedRow(), 5).toString());


    }//GEN-LAST:event_Thumb_TableMouseClicked
//Button initiates Thumbnail Extraction
    private void Thumb_Run_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_Run_ButtonActionPerformed
        // When button is pressed checks are first made to ensure all options are correctly selected, if correct the exstraction begins     
        Path Save = Paths.get(Thumb_SaveLoc_TextField.getText());
        File File_Loc = new File(Thumb_FileLoc_TextField.getText());
        File Save_Loc = new File(Thumb_SaveLoc_TextField.getText());

        if (File_Loc.exists() && !File_Loc.isDirectory()) {

            if (!Files.exists(Save) || Save_Loc.list().length > 0) {
                JOptionPane.showMessageDialog(null, "please select Save Location, If save location is selected please ensure it is empty");

            } else {

                Exstract();

            }

        } else {
            JOptionPane.showMessageDialog(null, "please select Valid Thumbcache File");

        }


    }//GEN-LAST:event_Thumb_Run_ButtonActionPerformed
// Button selects Thumbcache file location
    private void Thumb_FileLoc_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_FileLoc_ButtonActionPerformed
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(".db Files ", "db");
        j.setFileFilter(xmlfilter);
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = j.showOpenDialog(getParent());
        Thumb_FileLoc_TextField.setText(j.getSelectedFile().getPath());

    }//GEN-LAST:event_Thumb_FileLoc_ButtonActionPerformed

// Button  selects Thumbcache image save location
    private void Thumb_SaveLoc_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_SaveLoc_ButtonActionPerformed
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = j.showSaveDialog(getParent());
        Thumb_SaveLoc_TextField.setText(j.getSelectedFile().getPath());
    }//GEN-LAST:event_Thumb_SaveLoc_ButtonActionPerformed

//Button selects artefact search location
    private void Art_SearchDir_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Art_SearchDir_ButtonActionPerformed
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = j.showSaveDialog(getParent());

        Artefact_Search_Directory.setText(j.getSelectedFile().getPath() + "\\");

    }//GEN-LAST:event_Art_SearchDir_ButtonActionPerformed

//Button  selects artefact save location
    private void Art_SaveLoc_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Art_SaveLoc_ButtonActionPerformed
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = j.showSaveDialog(getParent());

        Art_SaveLoc_TxtField.setText(j.getSelectedFile().getPath() + "\\");
    }//GEN-LAST:event_Art_SaveLoc_ButtonActionPerformed

// Button saves artefact table
    private void Save_Art_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Art_TableActionPerformed
        File FileT;
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = j.showSaveDialog(getParent());
        FileT = new File(j.getSelectedFile().toString() + ".xls");
        toExcel(Art_Table, FileT);
    }//GEN-LAST:event_Save_Art_TableActionPerformed

// Button  saves thumbcache table
    private void Save_Thumbcache_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Thumbcache_TableActionPerformed
        File FileT;
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = j.showSaveDialog(getParent());
        System.out.println(j.getSelectedFile());
        FileT = new File(j.getSelectedFile().toString() + ".xls");
        toExcel(Thumb_Table, FileT);       
    }//GEN-LAST:event_Save_Thumbcache_TableActionPerformed

// Button exits application removing any tempory files
    private void Exit_AppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_AppActionPerformed
        File Save_Loc = new File(Thumb_SaveLoc_TextField.getText() + "/Temp");
        Path Save = Paths.get(Thumb_SaveLoc_TextField.getText());

        if (Files.exists(Save)) {
            try {
                FileUtils.deleteDirectory(Save_Loc);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.exit(ABORT);        
    }//GEN-LAST:event_Exit_AppActionPerformed

// Button  clears artefact table
    private void Clear_Art_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_Art_TableActionPerformed
        DefaultTableModel dm = (DefaultTableModel) Art_Table.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
    }//GEN-LAST:event_Clear_Art_TableActionPerformed

// Button clears thumbcache table
    private void Clear_Thumbcache_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_Thumbcache_TableActionPerformed
        DefaultTableModel dm = (DefaultTableModel) Thumb_Table.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
    }//GEN-LAST:event_Clear_Thumbcache_TableActionPerformed

// Button displays application help
    private void App_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_App_HelpActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Developer: Zak Hilton<br>Version:1.0 <br>Contact: Zakhilton@msn.com</html>", "About", 1);        // TODO add your handling code here:
    }//GEN-LAST:event_App_HelpActionPerformed

// Button displays artefact detector help    
    private void Art_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Art_HelpActionPerformed
        String msg = "<html>Options description:<ul> <b>Recursive Search:</b> If selected all folders inside the selected folder will also be searched"
                + "<br> <b>Save Found Artifacts:</b> Artifacts found during search will be saved to selected location "
                + "<br><b>Hash Results:</b> Generates an MD5 hash of each artefact found</html>";

        JLabel label = new JLabel(msg);
        label.setFont(new Font("serif", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null, label);

    }//GEN-LAST:event_Art_HelpActionPerformed

// Button displays Thumbcache help     
    private void Thumbcache_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumbcache_HelpActionPerformed
        String msg = "<html>Options description:<ul> <b>Hash Results:</b> Generates an MD5 hash of each artefact found"
                + "</ul> (Note save location must be an empty folder)</html>";
        JLabel label = new JLabel(msg);
        label.setFont(new Font("serif", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null, label);          // TODO add your handling code here:
    }//GEN-LAST:event_Thumbcache_HelpActionPerformed

// Button Initiates thumbcache analysis
    private void Thumb_Cache_Hash_AnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_Cache_Hash_AnalysisActionPerformed
        try {

            JFileChooser j = new JFileChooser();
            FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(".txt files ", "txt");
            j.setFileFilter(xmlfilter);
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnVal = j.showOpenDialog(getParent());

            String Match = "";
            ArrayList<String> yourArrayList = new ArrayList<String>();
            File Selected_File = new File(j.getSelectedFile().getPath());

            if (Selected_File.exists() && !Selected_File.isDirectory()) {
                String fileName = j.getSelectedFile().getPath();
                List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());

                for (int i = 1; i < Thumb_Table.getRowCount(); i++) {

                    for (String line : lines) {
                        if (line.equals(Thumb_Table.getValueAt(i, 2))) {
                            Match += i + ", ";
                        }
                    }

                }

                String msg = "<html>Matched Hashes Found At:<ul>" + Match + "</html>";

                JLabel label = new JLabel(msg);
                label.setFont(new Font("serif", Font.PLAIN, 14));
                JOptionPane.showMessageDialog(null, label);
            } else {

                String msg = "<html>No Hash File Located</html>";

                JLabel label = new JLabel(msg);
                label.setFont(new Font("serif", Font.PLAIN, 14));
                JOptionPane.showMessageDialog(null, label);

            }
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_Thumb_Cache_Hash_AnalysisActionPerformed

// Button Initiates artifact analysis    
    private void Artifact_Hash_AnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artifact_Hash_AnalysisActionPerformed
// TODO add your handling code here:
        try {

            JFileChooser j = new JFileChooser();
            FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(".txt files ", "txt");
            j.setFileFilter(xmlfilter);
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnVal = j.showOpenDialog(getParent());

            String other = "";
            ArrayList<String> yourArrayList = new ArrayList<String>();
            File f = new File(j.getSelectedFile().getPath());

            if (f.exists() && !f.isDirectory()) {
                String fileName = j.getSelectedFile().getPath();;
                List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());

                for (int i = 1; i < Art_Table.getRowCount(); i++) {

                    for (String line : lines) {
                        if (line.equals(Art_Table.getValueAt(i, 2))) {
                            other += i + ", ";
                        }
                    }

                }

                String msg = "<html>Matched Hashes Found At:<ul>" + other + "</html>";
                JLabel label = new JLabel(msg);
                label.setFont(new Font("serif", Font.PLAIN, 14));
                JOptionPane.showMessageDialog(null, label);
            } else {

                String msg = "<html>No Hash File Located</html>";

                JLabel label = new JLabel(msg);
                label.setFont(new Font("serif", Font.PLAIN, 14));
                JOptionPane.showMessageDialog(null, label);

            }
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Artifact_Hash_AnalysisActionPerformed

    private void Report_BugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Report_BugActionPerformed
        final BugReport Bug = new BugReport();
        Bug.setVisible(true);

        Bug.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                Bug.dispose();
                Bug.setDefaultCloseOperation(Bug.DO_NOTHING_ON_CLOSE);

            }
        });

    }//GEN-LAST:event_Report_BugActionPerformed

    private void Hash_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hash_HelpActionPerformed
        String msg = "<html>Hash Analysis description:<ul>  Once the text file containing the hashes has been selected they are compaired against those in the table to see if any match</html>";

        JLabel label = new JLabel(msg);
        label.setFont(new Font("serif", Font.PLAIN, 14));
        JOptionPane.showMessageDialog(null, label);           // TODO add your handling code here:
    }//GEN-LAST:event_Hash_HelpActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    public void toExcel(JTable table, File file) {
        try {
            TableModel model = table.getModel();
            FileWriter excel = new FileWriter(file);

            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i) + "\t");
            }

            excel.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString() + "\t");
                }
                excel.write("\n");
            }

            excel.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About_menu;
    private javax.swing.JMenuItem App_Help;
    public static javax.swing.JCheckBox Art_Hash_CheckBox;
    private javax.swing.JMenuItem Art_Help;
    private javax.swing.JButton Art_SaveLoc_Button;
    public static javax.swing.JTextField Art_SaveLoc_TxtField;
    private javax.swing.JButton Art_SearchDir_Button;
    public static javax.swing.JComboBox Art_Select_ComboBox;
    public static javax.swing.JTable Art_Table;
    public static javax.swing.JTextField Artefact_Search_Directory;
    private javax.swing.JLabel Artefact_Selection_Label;
    private javax.swing.JMenuItem Artifact_Hash_Analysis;
    private javax.swing.JMenu Bug_Menu;
    private javax.swing.JMenuItem Clear_Art_Table;
    private javax.swing.JMenuItem Clear_Thumbcache_Table;
    private javax.swing.JMenu Edit_Menu;
    private javax.swing.JMenuItem Exit_App;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JLabel File_Size_Label;
    private javax.swing.JMenuItem Hash_Help;
    private javax.swing.JLabel Hash_Label;
    public static javax.swing.JLabel Image_Num_Label;
    private javax.swing.JLabel Location_Label;
    private javax.swing.JLabel OffSet_Label;
    private javax.swing.JLabel Offset_Label;
    private javax.swing.JMenu Options_Menu;
    public static javax.swing.JCheckBox RecursiveSrch_CheckBox;
    private javax.swing.JMenuItem Report_Bug;
    private javax.swing.JButton Run_Art_Detector;
    public static javax.swing.JCheckBox Save_Art_CheckBox;
    private javax.swing.JMenuItem Save_Art_Table;
    private javax.swing.JMenuItem Save_Thumbcache_Table;
    private javax.swing.JMenuItem Thumb_Cache_Hash_Analysis;
    private javax.swing.JButton Thumb_FileLoc_Button;
    public static javax.swing.JTextField Thumb_FileLoc_TextField;
    private javax.swing.JButton Thumb_Run_Button;
    private javax.swing.JButton Thumb_SaveLoc_Button;
    public static javax.swing.JTextField Thumb_SaveLoc_TextField;
    public static javax.swing.JTable Thumb_Table;
    private javax.swing.JMenuItem Thumbcache_Help;
    public static javax.swing.JCheckBox jCheckBox6;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

 // Method that saves tables to Excel   
}
