package pquiz;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



public class Puntaje {
    
    int suma;
    String llamado;

    //Puntos respectivos por categoria
    
    public void sumaPuntosF() {

        JOptionPane.showMessageDialog(null,"Excelente! Obtienes 1 punto");
        suma++;
    
    }

    public void sumaPuntosM() {

        JOptionPane.showMessageDialog(null,"Asombroso! Obtienes 2 puntos");
        suma += 2;
    
    }

    public void sumaPuntosD() {

        JOptionPane.showMessageDialog(null,"Magistral! Obtienes 3 puntos");
        suma += 3;
    
    }

    public void sumaPuntosE() {

        JOptionPane.showMessageDialog(null,"Eres un genio! Obtienes 4 puntos");
        suma += 4;
    
    }
    
    public void sumaPuntosDios() {

        JOptionPane.showMessageDialog(null,"Lo lograste! Obtienes 5 puntos");
        suma += 5;
    
    }

    //Finales alternativos de partida

    public void terminoPartida() throws FileNotFoundException, IOException {

        if(suma<15) {
            
        JOptionPane.showMessageDialog(null,"Gran intento! Tus puntos son: " + suma);
        
        llamado = JOptionPane.showInputDialog("Por favor, registra tu nombre");
        
        //Ruta y creación de archivo. (Por defecto Directorio de Usuario)
        
        String rutaArchivo = System.getProperty("user.home")+"/Puntaje.xls";
        
        File archivoExcel = new File(rutaArchivo);
        
        if(archivoExcel.exists()) archivoExcel.delete();
        
        archivoExcel.createNewFile();
        
        Workbook libro = new HSSFWorkbook();
        
        FileOutputStream archivo = new FileOutputStream(archivoExcel);
        
        Sheet page = libro.createSheet("Puntaje");
        
        for(int i=0;i<2;i++){
            
            Row fila1 = page.createRow(i);
            
            for(int j=0;j<1;j++){
                
                Cell celda = fila1.createCell(j);
                
                if(i==0){
                    
                    celda.setCellValue(llamado);
                   
                } else {
                    
                    celda.setCellValue("Puntos: " + suma);
                            
                    
                }
            
            }
            
        }
        
        libro.write(archivo);
        
        archivo.close();
        
        Desktop.getDesktop().open(archivoExcel); }
        
    }
    
    public void perdioPartida () throws FileNotFoundException, IOException {
        
        JOptionPane.showMessageDialog(null,"Has perdido, te quedas sin puntos!");
        
        llamado = JOptionPane.showInputDialog("Por favor, registra tu nombre");
        
         //Ruta y creación de archivo. (Por defecto Directorio de Usuario)
        
        String rutaArchivo = System.getProperty("user.home")+"/Puntaje.xls";
     
        File archivoExcel = new File(rutaArchivo);
        
        if(archivoExcel.exists()) archivoExcel.delete();
        
        archivoExcel.createNewFile();
        
        Workbook libro = new HSSFWorkbook();
        
        FileOutputStream archivo = new FileOutputStream(archivoExcel);
        
        Sheet page = libro.createSheet("Puntaje");
        
        for(int i=0;i<2;i++){
            
            Row fila = page.createRow(i);
            
            for(int j=0;j<1;j++){
                
                Cell celda = fila.createCell(j);
                
                if(i==0){
                    
                    celda.setCellValue(llamado);
                   
                } else{
                    
                    celda.setCellValue("0");
                    
                }
            }
        }
        
        libro.write(archivo);
        
        archivo.close();
        
        Desktop.getDesktop().open(archivoExcel);
        
        
        
    }
    

    public void terminoPartidaDios() throws FileNotFoundException, IOException {

        if(suma==15) {
                       
        JOptionPane.showMessageDialog(null,"Eres un dios! Has obtenido: " + suma + ", la mayor puntuación!"); 
        
        llamado = JOptionPane.showInputDialog("Por favor, registra tu nombre");
        
         //Ruta y creación de archivo. (Por defecto Directorio de Usuario)
        
        String rutaArchivo = System.getProperty("user.home")+"/Puntaje.xls";
     
        File archivoExcel = new File(rutaArchivo);
        
        if(archivoExcel.exists()) archivoExcel.delete();
        
        archivoExcel.createNewFile();
        
        Workbook libro = new HSSFWorkbook();
        
        FileOutputStream archivo = new FileOutputStream(archivoExcel);
        
        Sheet page = libro.createSheet("Puntaje");
        
        for(int i=0;i<2;i++){
            
            Row fila = page.createRow(i);
            
            for(int j=0;j<1;j++){
                
                Cell celda = fila.createCell(j);
                
                if(i==0){
                    
                    celda.setCellValue(llamado);
                   
                } else{
                    
                    celda.setCellValue("Puntos: " + suma);
                    
                }
            }
        }
        
        libro.write(archivo);
        
        archivo.close();
        
        Desktop.getDesktop().open(archivoExcel);
        
        }
        
    }  
    
}
