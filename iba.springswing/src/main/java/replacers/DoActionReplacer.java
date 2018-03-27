package replacers;

import java.awt.Color;
import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

import button.ChangeColorButtonListenerOne;

public class DoActionReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		ChangeColorButtonListenerOne listener = (ChangeColorButtonListenerOne) arg0;
		listener.getUiFrame().getContentPane().setBackground(
				listener.getUiFrame().getContentPane().getBackground().equals(Color.RED) ? Color.YELLOW : Color.RED);
		listener.getUiButton().setText(listener.getUiButton().getText().equals("YELLOW") ? "RED" : "YELLOW");
		
		return null;
	}

}
