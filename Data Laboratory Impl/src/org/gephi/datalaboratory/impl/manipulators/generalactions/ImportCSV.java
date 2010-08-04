/*
Copyright 2008-2010 Gephi
Authors : Eduardo Ramos <eduramiba@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.datalaboratory.impl.manipulators.generalactions;

import javax.swing.Icon;
import org.gephi.datalaboratory.impl.manipulators.generalactions.ui.ImportCSVUIWizardAction;
import org.gephi.datalaboratory.spi.ManipulatorUI;
import org.gephi.datalaboratory.spi.generalactions.GeneralActionsManipulator;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;

/**
 * GeneralActionsManipulator shows a wizard UI for importing a CSV file to nodes/edges table.
 * @author Eduardo Ramos <eduramiba@gmail.com>
 */
@ServiceProvider(service=GeneralActionsManipulator.class)
public class ImportCSV implements GeneralActionsManipulator{

    public void execute() {
        Lookup.getDefault().lookup(ImportCSVUIWizardAction.class).performAction();
    }

    public String getName() {
        return NbBundle.getMessage(ImportCSV.class, "ImportCSV.name");
    }

    public String getDescription() {
        return "";
    }

    public boolean canExecute() {
        return true;
    }

    public ManipulatorUI getUI() {
        return null;
    }

    public int getType() {
        return 100;
    }

    public int getPosition() {
        return 100;
    }

    public Icon getIcon() {
        return ImageUtilities.loadImageIcon("org/gephi/datalaboratory/impl/manipulators/resources/table-excel.png", true);
    }
}
