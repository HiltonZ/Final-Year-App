/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author zak
 */
public class Detector {

    public static void Artefact_Choice() {
        String resultReg = "72656766";
        String resultSHD = "68490000";
        String resultSPL = "00000100";
        String resultEmail = "2142444E";
        String resultThumbCache = "434D4D4D";
        String resultLNK = "4C000000";
        String RegType = "dat";
        String SHDType = "SHD";
        String SPLType = "SPL";
        String EmailType = "PST";
        String ThumbType = "db";
        String LNKType = "LNK";
        String path = Frame.Artefact_Search_Directory.getText();
        final String Selected_Directory = path;

        if (Frame.Art_Select_ComboBox.getSelectedItem().equals("LNK")) {
            try {
                FindArt(Selected_Directory, resultLNK, LNKType);

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

        if (Frame.Art_Select_ComboBox.getSelectedItem().equals("NTuser")) {
            try {

                FindArt(Selected_Directory, resultReg, RegType);

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

        if (Frame.Art_Select_ComboBox.getSelectedItem().equals("ThumbCache")) {
            try {
                FindArt(Selected_Directory, resultThumbCache, ThumbType);

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

        if (Frame.Art_Select_ComboBox.getSelectedItem().equals("SHD")) {
            try {
                FindArt(Selected_Directory, resultSHD, SHDType);

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

        if (Frame.Art_Select_ComboBox.getSelectedItem().equals("SPL")) {
            try {
                FindArt(Selected_Directory, resultSPL, SPLType);

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        if (Frame.Art_Select_ComboBox.getSelectedItem().equals("PST")) {
            try {
                FindArt(Selected_Directory, resultEmail, EmailType);

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

    }

    public static String checkH(String dir) throws Exception {
        String ans = "";
        FileInputStream fin = new FileInputStream(dir);

        byte data[] = new byte[16];

        fin.read(data);
				    // Read bytes until EOF is encountered.

        for (int i = 0; i < 4; i++) {
            ans = ans + ans.format("%02X", data[i]);

        }

        return ans;

    }

    public static void FindArt(String sDir, String Sig, String Type) throws Exception {
        File[] faFiles = new File(sDir).listFiles();
        File FileL;
        File FileD;
        String md5 = "";
        String Change = "";

        for (File file : faFiles) {

            if (file.getName().matches("^(.*?)") && !file.isDirectory() && Sig.equals(checkH(file.getAbsolutePath()))) {

                String ext = FilenameUtils.getExtension(file.getAbsolutePath());
                System.out.println(ext);
                if (ext.equals(Type)) {
                    Change = "False";
                } else {
                    Change = "True";
                }

                Path filee = Paths.get(file.getAbsolutePath());

                BasicFileAttributes attr = Files.readAttributes(filee, BasicFileAttributes.class);

                String Creationtime = attr.creationTime().toString();
                String Modifiedtime = attr.lastModifiedTime().toString();
                String Acccessedtime = attr.lastAccessTime().toString();

                System.out.println(Creationtime.substring(0, Creationtime.length() - 3));

                if (Frame.Art_Hash_CheckBox.isSelected()) {

                    FileInputStream fis;
                    fis = new FileInputStream(new File(file.getAbsolutePath()));
                    md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);

                    fis.close();
                } else {
                    md5 = "Option Not Selected";
                }

                Pop_Table(file, ext, Creationtime, Modifiedtime, Acccessedtime, md5, Change);

                if (Frame.Save_Art_CheckBox.isSelected()) {
                    FileL = new File(file.getAbsolutePath());
                    FileD = new File(Frame.Art_SaveLoc_TxtField.getText() + file.getName());

                    try {
                        copyFileUsingChannel(FileL, FileD);

                    } catch (IOException e1) {

                        e1.printStackTrace();
                    }

                }

            }
            if (Frame.RecursiveSrch_CheckBox.isSelected()) {
                if (file.isDirectory()) {

                    FindArt(file.getAbsolutePath(), Sig, Type);
                }
            }
        }
    }

    private static void copyFileUsingChannel(File source, File dest) throws IOException {

        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            sourceChannel.close();
            destChannel.close();
        }
    }

    public static void Pop_Table(File file, String ext, String Creationtime, String Modifiedtime, String Acccessedtime, String md5, String Change) {
        Object[] row = {file.getName(), ext, file.length() + " Bytes", file.getAbsolutePath(), Creationtime.substring(0, Creationtime.indexOf("T")), Modifiedtime.substring(0, Modifiedtime.indexOf("T")), Acccessedtime.substring(0, Acccessedtime.indexOf("T")), md5, Change};

        DefaultTableModel model = (DefaultTableModel) Frame.Art_Table.getModel();

        model.addRow(row);
    }

}
