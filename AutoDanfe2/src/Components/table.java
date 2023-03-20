package Components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class table extends JTable {

    public table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(43,49,53));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                header.setForeground(new Color(225,225,225));
                header.setBackground(new Color(214,70,14));
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                com.setBackground(new Color(34,34,34));
                setBorder(noFocusBorder);
                setHorizontalAlignment(CENTER);
                if (selected) {
                    com.setForeground(new Color(10,107,162));
                } else {
                    com.setForeground(new Color(225,225,225));
                }
                return com;
            }
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setBorder(null);
        scroll.setVerticalScrollBar(new JScrollBar());
        scroll.getVerticalScrollBar().setBackground(Color.BLACK);
        scroll.getViewport().setBackground(Color.BLACK);
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        p.setBackground(Color.BLACK);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    }
}
