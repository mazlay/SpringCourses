package button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
@Qualifier(value = "changeColorButtonListenerTwo")
public class ChangeColorButtonListenerTwo implements ActionListener {

	@Autowired
	@Qualifier("uiFrame")
	protected JFrame uiFrame;
	
	@Autowired
	@Qualifier("changeColorButtonTwo")
	protected JButton uiButton;

	@Override
	public void actionPerformed(ActionEvent e) {
		uiFrame.getContentPane()
				.setBackground(uiFrame.getContentPane().getBackground().equals(Color.GREEN) ? Color.BLUE : Color.GREEN);
		uiButton.setText(uiButton.getText().equals("GREEN") ? "BLUE" : "GREEN");
	}
}
