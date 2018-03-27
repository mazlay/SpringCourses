package button;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
@Qualifier(value="changeColorButtonTwo")
public class ChangeColorButtonTwo extends JButton{
	private static final long serialVersionUID = 1L;
	
	@Setter
	@Autowired
	@Qualifier("changeColorButtonListenerTwo")
	private ActionListener actionListener;
	
	public void init() {
        this.addActionListener(actionListener);
    }
}
