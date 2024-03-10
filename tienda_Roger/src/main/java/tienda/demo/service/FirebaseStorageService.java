/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda.demo.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;


/**
 *
 * @author roger
 */
@Service
public interface FirebaseStorageService {
    
    public String cargarImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "techshop-70262.appspot.com";
    
    //Esta es la ruta basica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";
    
    //Ubicacion donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-70262-firebase-adminsdk-ftnwx-0442f8d411.json";
}
