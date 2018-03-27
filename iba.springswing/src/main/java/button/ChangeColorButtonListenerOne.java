package button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ChangeColorButtonListenerOne implements ActionListener {

	protected JFrame uiFrame;
	protected JButton uiButton;

	@Override
	public void actionPerformed(ActionEvent e) {
		doAction();
	}
	
	public void doAction() {}
}
