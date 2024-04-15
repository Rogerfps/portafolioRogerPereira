
package tienda.demo.domain;

/**
 *
 * @author roger
 */
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class Venta {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;
    private Long idFactura;
    private Londucto ;
    Week 13 Carrito2private double precio;
    private int cantidad;

    public Venta() {
    }

    public Venta(Long idFactura, Long idProducto, double precio, int cantidad

    
        ) {
this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

}
