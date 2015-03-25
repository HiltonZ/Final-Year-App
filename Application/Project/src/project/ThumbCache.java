/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zak
 */
public class ThumbCache {

    public static void Exstract() {

        try {

            byte[] Off_set = new byte[4];
            byte[] Total_Size = new byte[4];
            byte[] File_Size = new byte[4];
            byte[] Number_OF_Files = new byte[4];
            int count = 0;
            String Hex = "";
            String md5 = "";
            int First_cache = 0;
            int TotSize = 0;
            int Cache_entry_size = 0;
            int Data_Length = 0;
            int Data_L = 0;
            int Image_Start = 0;
            int Image_End = 0;
            int Off_Set = 0;
            int filenum = 0;
            Path path = Paths.get(Frame.Thumb_FileLoc_TextField.getText());
            byte[] data = Files.readAllBytes(path);
            int EndByte = data.length;

            JOptionPane.showMessageDialog(null, "For slower devices please wait around 30 seconds for the table to populate");

            //adds bytes 20-24 to Num of files, these bytes indicate how many files are in the cache 
            for (int i = 20; i < 24;) {

                Number_OF_Files[count] = data[i];
                i++;
                count++;
            }

            // converts to littleEndian
            littleEndian(Number_OF_Files);

            //stores bytes into a hex string
            for (int i = 0; i < Number_OF_Files.length;) {

                Hex = Hex + Hex.format("%02X", Number_OF_Files[i]);

                i++;
            }

            //converts hex string into decimal value
            filenum = Integer.parseInt(Hex, 16);

            Hex = "";

            count = 0;

            //This loop adds the bytes 12 to 15 to Off_set, these bytes indicate the starting ofset of the first cache (image) header
            for (int i = 12; i < 16;) {
                Off_set[count] = data[i];
                i++;
                count++;
            }

            for (int z = 1; z <= filenum; z++) {

                if (z == 1) {

                    //converts to little endien
                    littleEndian(Off_set);

                    //stores bytes into a hex string
                    for (int i = 0; i < Off_set.length;) {
                        Hex = Hex + Hex.format("%02X", Off_set[i]);
                        i++;
                    }

                    //converts string of hex to decimal 
                    First_cache = Integer.parseInt(Hex, 16);

                }
                count = 0;
                Hex = "";
                //////////////////////////////////////////////////////////////////////////////////////////////// OFSET COMPLETE			
                Off_Set = First_cache;

                if (Off_Set >= EndByte) {
                    break;
                }

                Cache_entry_size = First_cache + 4;

                for (int i = Cache_entry_size; i < Cache_entry_size + 4;) {
                    Total_Size[count] = data[i];
                    count++;
                    i++;
                }

                littleEndian(Total_Size);

                for (int i = 0; i < Total_Size.length;) {
                    Hex = Hex + Hex.format("%02X", Total_Size[i]);
                    i++;
                }

                TotSize = Integer.parseInt(Hex, 16);

                count = 0;
                Hex = "";
        ///////////////////////////////////////////////////////////////////////////////////////////Cache entry size complete

                Data_Length = First_cache + 24;

                for (int i = Data_Length; i < Data_Length + 4;) {
                    File_Size[count] = data[i];
                    count++;
                    i++;
                }

                littleEndian(File_Size);

                for (int i = 0; i < File_Size.length;) {
                    Hex = Hex + Hex.format("%02X", File_Size[i]);
                    i++;
                }

                Data_L = Integer.parseInt(Hex, 16);

                ///////////////////////////////////////////////////////////////////////////////////////length done
                count = 0;
                Hex = "";

                Image_Start = TotSize - Data_L;
                Image_Start = Image_Start + First_cache;

                Image_End = Image_Start + Data_L - 1;

                First_cache = Image_End + 1;

                Save_File(data, Image_Start, Data_L, z);

                String path2 = (Frame.Thumb_SaveLoc_TextField.getText() + "/" + z + ".JPEG");

                new File(Frame.Thumb_SaveLoc_TextField.getText() + "/Temp").mkdirs();

                if (Frame.jCheckBox6.isSelected()) {
                    FileInputStream fis;
                    fis = new FileInputStream(new File(path2.toString()));
                    md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);

                    fis.close();
                } else {
                    md5 = "Option Not Selected";
                }

                Pop_Table(z, path2, md5, Off_Set, Image_Start, Data_L);

                TotSize = 0;
                Cache_entry_size = 0;
                Data_Length = 0;
                Data_L = 0;
                Image_Start = 0;
                Image_End = 0;

            }

// saves copy of image as JPG for displaying on the GUI
            File[] files = new File(Frame.Thumb_SaveLoc_TextField.getText() + "/").listFiles();
//If this pathname does not denote a directory, then listFiles() returns null. 

            for (File file : files) {
                if (file.isFile()) {

                    BufferedImage image = ImageIO.read(new File(file.getAbsolutePath()));

                    if (image == null) {
                        ///// Doesnt try to copy image
                    } else {

                        File outputfile = new File(Frame.Thumb_SaveLoc_TextField.getText() + "/Temp/" + file.getName());

                        ImageIO.write(image, "jpg", outputfile);

                    }
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static byte[] littleEndian(byte[] convert) {

        for (int i = 0, j = convert.length - 1; i < j; i++, j--) {

            byte b = convert[i];
            convert[i] = convert[j];
            convert[j] = b;

        }

        return convert;

    }

    public static void Pop_Table(int ext, String path2, String md5, int Off_Set, int Image_Start, int Data_L) {
        Object[] row = {ext, path2, md5, Off_Set, Image_Start, Data_L};

        DefaultTableModel model = (DefaultTableModel) Frame.Thumb_Table.getModel();

        model.addRow(row);
    }

    public static void Save_File(byte[] data, int Image_Start, int Data_L, int z) {

        try {

            //convert file into array of bytes
            FileOutputStream fileOuputStream = new FileOutputStream(Frame.Thumb_SaveLoc_TextField.getText() + "/" + z + ".JPEG");
            fileOuputStream.write(data, Image_Start, Data_L);
            fileOuputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
