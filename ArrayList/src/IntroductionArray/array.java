package IntroductionArray;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class array {

    public ArrayList list;

    public array() {
        list = new ArrayList();
    }

    public void save(String element) {
        if (element.equals("") || element.equals(null) || element.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "type something");
        } else {
            list.add(element);
            JOptionPane.showMessageDialog(null, element + ", saved sucessfully");

        }
    }

    public String listing() {
        String element = "list of perfumes \n";
        if (list.isEmpty()) {
            return "no perfumes were posted";
        } else {
            for (int i = 0; i < list.size(); i++) {
                element += (i + 1) + " - " + list.get(i) + "\n";
            }
            return element;
        }

    }

    public void alter(int i, String newElement) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "list is empty");

        } else if (i > list.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "perfume doesnt exist");

        } else {
            list.set(i, newElement);
        JOptionPane.showMessageDialog(null, "altered sucessfully");
        
        }
        

    }

    public void erase(int i) {
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "list is empty");

        } else if (i > list.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "perfume doesnt exist");

        } else {
            list.remove(i);
        }
        JOptionPane.showMessageDialog(null, "deleted sucessfully");
    }
}
