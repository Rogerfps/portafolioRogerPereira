/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda.demo.dao;

import tienda.demo.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author roger
 */
public interface VentaDao extends JpaRepository <Venta,Long>{
}
