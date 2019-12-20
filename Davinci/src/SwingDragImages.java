/* Copyright (c) 2006 Timothy Wall, All Rights Reserved
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/** Install default drag images for JTable, JTree, JList, and JTextComponent.
 * 
 * @author twall
 */

public class SwingDragImages {   
    static class NumberRendererIcon implements Icon {
        private Area clip;
        private NumberRenderer number;

        public NumberRendererIcon(NumberRenderer number) {
            this.number = number;
        }

        public int getIconWidth() {
            return number.getWidth();
        }

        public int getIconHeight() {
            return number.getHeight();
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            g = g.create();
            g.translate(x, y);

            try {
                number.setDoubleBuffered(false);
                number.paint(g);
            }
            finally {
                number.setDoubleBuffered(true);
            }
        }
    }

    static class GlobalImageProvider implements DragSourceListener, DragSourceMotionListener {
        private GhostedDragImage ghost;
        
        public GlobalImageProvider() {
            DragSource.getDefaultDragSource().addDragSourceListener(this);
            DragSource.getDefaultDragSource().addDragSourceMotionListener(this);
        }
        
        private void check(DragSourceDragEvent e) {
            Component src = e.getDragSourceContext().getComponent();

            if (ghost == null && src instanceof JComponent) {
                JComponent c = (JComponent)src;
                Point screen = e.getLocation();
                Point origin = c.getLocationOnScreen(); 
                Point imageOffset = new Point(-25,
                                              -25);
                Icon icon = null;
                boolean opaque = false;

                if (src instanceof NumberRenderer) {
                    NumberRenderer number = (NumberRenderer)c;
                    icon = new NumberRendererIcon(number);
                }
                if (icon != null) {
                    ghost = new GhostedDragImage(c, e.getLocation(), icon, imageOffset);
                    if (opaque)
                        ghost.setAlpha(1f);
                }
            }
        }
        public void dragEnter(DragSourceDragEvent e) {
            check(e);
            if (ghost != null) {
                ghost.move(e.getLocation());
            }
        }
        public void dragOver(DragSourceDragEvent e) {
            check(e);
            if (ghost != null)
                ghost.move(e.getLocation());
        }
        public void dropActionChanged(DragSourceDragEvent e) {
            check(e);
            if (ghost != null)
                ghost.move(e.getLocation());
        }
        public void dragDropEnd(DragSourceDropEvent e) {
            if (ghost != null) {
                if (e.getDropSuccess()) {
                    ghost.dispose();
                }
                else {
                    ghost.returnToOrigin();
                }
                ghost = null;
            }
        }
        public void dragExit(DragSourceEvent e) {
        }
        public void dragMouseMoved(DragSourceDragEvent e) {
            check(e);
            if (ghost != null)
                ghost.move(e.getLocation());
        }
    }
}
