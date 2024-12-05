package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class AbstractMouseListener implements MouseListener {
	
	// Override hết tất cả hàm trừ mousePressed
	// --> class con chỉ cần override mousePressed
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
}
