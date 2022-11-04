package hacs;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Heli Vachhani
 * @version 1.0
 */

import javax.swing.*;

@SuppressWarnings("serial")
abstract public class AssignmentMenu extends JDialog {
    abstract void showMenu(Assignment ass, Person per);

    public AssignmentMenu() {
        setModal(true);
        setSize(575, 330);
    }
}