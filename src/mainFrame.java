import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class mainFrame {
	Frame frame = new Frame("Base64 En/Decoder v0.1");
	public void createFrame() {
		frame.setSize(400, 200);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		TextArea encodedText = new TextArea("Encoded text", 3, 40);
		TextArea decodedText = new TextArea("Decoded text", 3, 40);
		
		Button decodingButton = new Button("Decoding");
		decodingButton.setPreferredSize(new Dimension(60,60));
		decodingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = encodedText.getText();
				String deText = base64.decoding(text);
				decodedText.setText(deText);
				copyText.toClipboard(deText);
				JOptionPane.showMessageDialog(null, "클립보드에 복사되었습니다.", "알림", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		Button encodingButton = new Button("Encoding");
		encodingButton.setPreferredSize(new Dimension(60,60));
		encodingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = decodedText.getText();
				String enText = base64.encoding(text);
				encodedText.setText(enText);
				copyText.toClipboard(enText);
				JOptionPane.showMessageDialog(null, "클립보드에 복사되었습니다.", "알림", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		frame.add(encodedText);
		frame.add(decodingButton);
		frame.add(decodedText);
		frame.add(encodingButton);
		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			@Override
			public void windowClosed(WindowEvent e) {
			}
			@Override
			public void windowIconified(WindowEvent e) {
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			@Override
			public void windowActivated(WindowEvent e) {
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
		});
		
		frame.setVisible(true);
		
	}
}
