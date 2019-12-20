import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.util.*;

class MessageDialog extends JPanel
{
	private ImageIcon d_background;
	private float d_alpha;
	private JPanel d_top;
	private Font d_font;
	private CustomEventImpl d_customEvent;
	private Color d_bg;
	private Color d_fg;
	private MouseAdapter d_listener;
	
	public MessageDialog(String title, String message)
	{
		init(title, message, true);
	}
	
	public MessageDialog(String title, String message, boolean okonly)
	{
		init(title, message, okonly);
	}
	
	private void init(String title, String message, boolean okonly)
	{
		d_alpha = 0.6f;
		d_font = new Font("Sans", Font.PLAIN, 14);
		d_customEvent = new CustomEventImpl();
		d_fg = Color.white;
		d_bg = Color.black;
		d_listener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				MessageDialog.this.done(0);
			}
		};

		initSize();
		setLayout(new BorderLayout());
		setOpaque(false);
		
		build(title, message, okonly);
	}
	
	private void build(String title, String message, boolean okonly)
	{
		// Add top/title
		d_top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		d_top.setOpaque(false);
		JLabel tit = new JLabel(title);

		tit.setFont(d_font.deriveFont(Font.BOLD));
		tit.setForeground(d_fg);

		d_top.add(tit);		
		add(d_top, BorderLayout.NORTH);
		
		// Add center/message
		JEditorPane area = new JEditorPane("text/html", message);
		area.setOpaque(false);
		//area.setLineWrap(true);
		//area.setEnabled(false);
		area.setEditable(false);
		area.setHighlighter(null);
		area.setMargin(new Insets(5, 5, 5, 5));
		area.setFont(d_font);
		//area.setWrapStyleWord(true);
		
		//area.setDisabledTextColor(d_fg);
		area.setForeground(d_fg);
		add(area, BorderLayout.CENTER);
		
		// Add bottom/button
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		bottom.setOpaque(false);
		
		if (okonly)
		{
			JButton ok = new JButton("OK");
			ok.setPreferredSize(new Dimension(100, 30));
			
			ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					MessageDialog.this.done(1);
				}
			});
			
			bottom.add(ok);
		}
		else
		{
			JButton yes = new JButton("Yes");
			yes.setPreferredSize(new Dimension(100, 30));
			yes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					MessageDialog.this.done(1);
				}
			});
			
			bottom.add(yes);
			
			JButton no = new JButton("No");
			no.setPreferredSize(new Dimension(100, 30));
			no.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					MessageDialog.this.done(0);
				}
			});
			
			bottom.add(no);			
		}
		
		add(bottom, BorderLayout.SOUTH);
		area.addMouseListener(d_listener);
		addMouseListener(d_listener);
	}
	
	private void done(int status)
	{
		d_customEvent.fire(Integer.class, new CustomEvent.Event<Integer>(this, status));
	}
	
	private void initSize()
	{
		int width = 400;
		int height = 250;
		
		setMinimumSize(new Dimension(width, height));
		setPreferredSize(new Dimension(width, height));
		setSize(new Dimension(width, height));
	}

	private Graphics2D initGraphics(Graphics g) {
		RenderingHints renderHints = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		renderHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		Graphics2D result = (Graphics2D)g.create();
		result.setRenderingHints(renderHints);

		return result;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = initGraphics(g);
		Insets insets = getInsets();
		
		g2d.setColor(d_bg);
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, d_alpha * 0.5f));
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, d_alpha));
		g2d.fillRoundRect(insets.top, insets.left, getWidth() - insets.left - insets.right, getHeight() - insets.top - insets.bottom, 15, 15);
		
		g2d.setColor(d_fg);
		g2d.drawLine(insets.left + 5, d_top.getHeight() + insets.top, getWidth() - (insets.left + insets.right) - 10, d_top.getHeight() + insets.top + 1);
		g2d.dispose();
		
		super.paintComponent(g);
	}
	
	public Insets getInsets()
	{
		return new Insets(5, 5, 5, 5);
	}
	
	// This methods allows classes to register for MyEvents
	public <T> void addDoneListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		d_customEvent.addListener(cl, listener);
	}

	// This methods allows classes to unregister for MyEvents
	public <T> void removeDoneEventListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		d_customEvent.removeListener(cl, listener);
	}
}

