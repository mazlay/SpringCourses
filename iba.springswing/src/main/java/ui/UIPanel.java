package ui;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import lombok.Setter;

@Setter
public class UIPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private List<JComponent> panelComponents;
    private int axis;
    
    public void init() {
        setLayout(new BoxLayout(this, axis));
        panelComponents.stream().forEach(component -> add(component));
     }
}
