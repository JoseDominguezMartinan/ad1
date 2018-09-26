/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // crear un directorio chamado arquivosdir e dentro de el o ficheiro Products2.txt
        String uri="arquivosdir";
        String ruta="/home/oracle/Desktop/compartido/arquivos/arquivosdir/Products1.txt";
       Metodos metodo=new Metodos();
       metodo.crearDirectorio(uri);
       metodo.crearArquivos(ruta);
       
       // crear dentro de arquivos dir o directorio subdir e o ficheiro Products2.txt
       String uri2="/home/oracle/Desktop/compartido/arquivos/arquivosdir/subdir";
       String ruta2="/home/oracle/Desktop/compartido/arquivos/arquivosdir/subdir/Products2.txt";
       metodo.crearDirectorio(uri2);
       metodo.crearArquivos(ruta2);
       
       // amosar o contido dun directorio
       metodo.amosarContidoDirectorio(uri);
       
       //amosar a ruta completa dun nome de directorio ou ficheiro que pasamos
       metodo.amosarRuta("arquivosdir");
       
       // amosar a información dun arquivo en concreto
       metodo.amosarInformacion(ruta);
       
       // pasar o arquivo a so lectura
       metodo.soLectura(ruta);
       // pasar o arquivo a poder ser editable
       metodo.arquivoLectura(ruta);
       // borrar un arquivo 
       metodo.borrarArquivo(ruta);
       // borrar todos os arquivos
       metodo.borrarTodo(uri);
    }
    
}
