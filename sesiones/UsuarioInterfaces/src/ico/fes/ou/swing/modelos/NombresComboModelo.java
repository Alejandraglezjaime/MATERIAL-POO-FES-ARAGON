/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ou.swing.modelos;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/*Los metodos de esta clase seran invocados de forma AUTOMATICA POR EL OBJETO DE LA VISA, en este caso
un JComboBox. Nosotros como programadores le proporcionaremos la info. que requiere la cista para 
mostrarle la info al usuario*/

/**
 *
 * @author alejandraglezj
 */
public class NombresComboModelo implements ComboBoxModel<String> {
    private ArrayList<String> datos;
    private String selectedItem;

    public NombresComboModelo() {
    }

    public NombresComboModelo(ArrayList<String> datos, String selectedItem) {
        this.datos = datos;
        this.selectedItem = selectedItem;
    }

    public ArrayList<String> getDatos()  {
        return datos;
    }
    
    public void setDatos (ArrayList<String> datos) {
    this.datos=datos;
    }
    

    @Override
    public void setSelectedItem(Object o) {
       this.selectedItem = (String)o;
    }

    @Override
    public Object getSelectedItem() {
       return this.selectedItem;
    }

    @Override
    public int getSize() {
       return datos.size();
    }

    @Override
    public String getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
      
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
