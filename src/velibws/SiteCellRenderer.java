/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velibws;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import org.apache.commons.lang.WordUtils;
import velibp.Carto.Markers.Marker;

/**
 *
 * @author paul
 */
public class SiteCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Marker) {
            setText(WordUtils.capitalizeFully(((Marker)value).getName(), new char[]{' ', '(', '/'}));
        }
        return this;
    }
}
