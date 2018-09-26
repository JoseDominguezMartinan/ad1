/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oracle
 */
public class Metodos {
    /**
     * método para crear un directorio na carpeta do proxecto
     */
    public void crearDirectorio(String arquivo){
     File directorio=new File(arquivo); // creamos un novo File co nome que lle queremos dar ao directorio
     boolean existe=directorio.isDirectory(); // comprobamos se existe un directorio xa con ese nome 
     if(existe==false){
     directorio.mkdir(); // se non existe o directorio creamos un e mandamos un mensaxe , en caso de erro mensaxe informando co erro 
        System.out.println("directorio creado con exito");
     }
     else
            System.out.println("o directorio xa existe");
    }
    /**
     * metodo para crear arquivos nunha ruta determinada
     */
    public void crearArquivos(String ruta){
       
            File arquivo=new File(ruta); // creamos o obxeto file pasandolle a ruta enteira 
            boolean existeArquivo=arquivo.isFile(); // comprobamos se o arquivo que queremos crear xa existe 
            if (existeArquivo==false){ // se non existe o creamos e lanzamos os mensaxes pertinentes segun o que pase 
             try {
             arquivo.createNewFile(); // chamamos ao metodo create new file e capturamos a excepcion enviando un mensaxe de erro en caso de que non pudera ser creado
                 System.out.println("o arquivo foi creado con exito");
             } catch (IOException ex) {
            System.out.println("non foi posible crear o arquivo");
             }
        }
            else { // se xa existe informamos por pantalla 
                System.out.println("o arquivo que quere crear xa existe");
            }
        
    }
    // metodo para listar os directorios e arquivos que hay dentro de un directorio que lle pasamos con anterioridade
    public void amosarContidoDirectorio(String directorio){
       File directorioComp=new File(directorio); // creamos un obxeto de tipo File para o directorio que queremos listar o contido 
        String[] list = directorioComp.list(); // recollemos o resultado do metodo list para obter un array co contido 
        
        for( int i=0;i<list.length;i++){ // creamos un bucle para recorrer e amosar o array co contido 
            System.out.println(list[i]);
        }
    }
    /**
     * metodo para amosar a ruta do nome que pasamos 
     * @param elemento nome que pasamos de arquivo o directorio do cal queremos obter a sua ruta absoluta
     */
    public void amosarRuta(String elemento){
        File ruta=new File(elemento); // creamos un obxeto de tipo file co nome proporcionado 
        // chamamos co obxeto ao metodo correspondente e o metemos dentro dun sout para visualizar a ruta 
        System.out.println(ruta.getAbsolutePath());
        
    }
    /**
     * metodo para amosar determinada informacion dun ficheiro en concreto 
     * @param ficheiro 
     */
    public void amosarInformacion(String ficheiro){
        File ficheiroInfo=new File(ficheiro); // obxeto file do ficheiro do que queremos amosar a informacion 
        //nome:
        System.out.println(ficheiroInfo.getName());
        // ruta:
        System.out.println(ficheiroInfo.getAbsolutePath());
        //se podemos escribir no arquivo ou non 
        boolean editable=ficheiroInfo.canWrite(); // devolvemos true no caso de que sea editable e false no caso de que non o sexa
        if (editable==true)
            System.out.println("O ficheiro é editable");
        else
            System.out.println("O ficheiro non é editable");
        // se podemos ler del ou non 
        boolean lexible=ficheiroInfo.canRead();
        if(lexible==true)
            System.out.println("o ficheiro é lexible");
        else
            System.out.println("o ficheiro non é lexible");
        // a sua extensión en bytes
        System.out.println(ficheiroInfo.length());
    }
    /**
     * facer o arquivo que pasamos como de so lectura
     * @param ficheiro arquivo que queremos que sexa de so lectura 
     */
    
    public void soLectura(String ficheiro){
        File ficheiroLectura=new File(ficheiro);
        ficheiroLectura.setReadOnly();
        
    }
    /**
     * pasar de novo o arquivo a arquivo de lectura
     * @param ficheiro arquivo que queremos que volva a ser de lectura
     */
    public void arquivoLectura(String ficheiro){
        File ficheiroLectura=new File(ficheiro);
        ficheiroLectura.setWritable(true);
    }
    /**
     * borrar un arquivo en concreto 
     */
    public void borrarArquivo(String ficheiro){
        File ficheiroBorrar=new File(ficheiro);
        ficheiroBorrar.delete();
    }
    /**
     * borrar todos os arquivos e directorios creados anteriormente, todos estan dentro dun en concreto
     */
    public void borrarTodo(String directorio){
        File directorioContenedor=new File(directorio);
        // comprobamos se o que lle enviamos e un ficheiro ou un directorio
         boolean existeDirectorio=directorioContenedor.isDirectory();
         boolean existeArquivo=directorioContenedor.isFile(); 
         boolean bandera=true;
         if(existeDirectorio==true){
             String[] list = directorioContenedor.list(); // recollemos o resultado do metodo list para obter un array co contido 
           
        
             do{
        bandera=true;
        for( int i=0;i<list.length;i++){ // creamos un bucle para recorrer e amosar o array co contido 
            File dentroContenedor=new File(list[i]);
            boolean existeArquivo2=dentroContenedor.isFile(); 
                if (existeArquivo2==true){
                    dentroContenedor.delete();
                   
                }  
//                else{
//                    list=dentroContenedor.list();
//                    bandera=false;
//                }
                
        }
        }while(bandera==false);
         }else directorioContenedor.delete();
        
        
    }
   
}
