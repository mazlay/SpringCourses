package button;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import annotation.UIAnnotation;
import lombok.Setter;

@UIAnnotation
public class ChangeColorButtonOne extends JButton{
	private static final long serialVersionUID = 1L;
		
	@Setter
	private ActionListener actionListener;
	
	public void init() {
        this.addActionListener(actionListener);
    }
}
