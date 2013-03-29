
package graphics;
import java.io.*;
import lib.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author pungi-man
 */
public class Elements {
    private static Props p;
    private static Log logging;
    public static void showElement(final String element){
        try{
            logging = new Log();
            p = new Props("data/" + element);
	    logging.logIt("Now showing the dialog box for the element " + element);
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
		    logging.logIt("Now building the actual GUI for it.");
                    makeGUI(element);
                }
            });
        }
        catch(FileNotFoundException fnfe){
        	System.err.println("Sorry did not find the file");
        	logging.logIt("Sorry did not find the file named");
        	System.out.println(fnfe.getMessage());
        	logging.logIt(fnfe.getMessage());
        }
        catch(UnsupportedOperationException uoe){
        	System.err.println("Sorry an unsupported Exception occured.");
        	System.out.println(uoe.getMessage());
        	logging.logIt(uoe.getMessage());
        }
        catch(SecurityException se){
        	System.err.println("Sorry an security exception occured.");
        	System.err.println("Did not have permission to read and write the file.");
        	System.out.println(se.getMessage());
        	logging.logIt(se.getMessage());
        }
        catch(Exception e){
        	System.out.println("Sorry an unidentified exception occured.");
        	System.out.println(e.getMessage());
        	logging.logIt(e.getMessage());
        }
    }
    
    private static void makeGUI(String element){
    	//preparing the frame for the Graphics.
	logging.logIt("Preparing the Frame.");
        JFrame frame = new JFrame("Foodie : " + element);
	frame.setVisible(true);
	frame.setSize(1000, 800);
	frame.setLayout(new FlowLayout());
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.setVisible(true);
	JScrollPane generalScroll;
	//done preparing the frame now performing operations on it.
	logging.logIt("Done preparing the frame.");
	logging.logIt("Now performing operations on it.");
	//getting all the properties of the element.
	logging.logIt("Loading the properties of the element.");
        final String IUPAC_Name = p.getProperty("IUPAC_Name");
        //System.out.println("IUPAC_Name : " + IUPAC_Name);
        final String Discovery_date = p.getProperty("Discovery_date");
        //System.out.println("Discovery date : " + Discovery_date);
        final String Discovered_by = p.getProperty("Discovered_by");
        //System.out.println("Discovered by : " + Discovered_by);
        final String Origin = p.getProperty("Origin_of_the_name");
        //System.out.println("Origin of the name : " + Origin);
        final String allotropes = p.getProperty("allotropes");
        //System.out.println("allotropes : " + allotropes);
        final String Group = p.getProperty("Group");
        //System.out.println("Group : " + Group);
        final String Period = p.getProperty("Period");
        //System.out.println("Period : " + Period);
        final String Block = p.getProperty("Block");
        //System.out.println("Block : " + Block);
        final String Atomic_number = p.getProperty("Atomic_Number");
        //System.out.println("Atomic_number : " + Atomic_number);
        final String State = p.getProperty("State_at_room_temperature");
        //System.out.println("State : " + State);
        final String electron_config = p.getProperty("Electron_configuration");
        //System.out.println("Electron_config : " + electron_config);
        final String ChemSpiderID = p.getProperty("ChemSpider_ID");
        //System.out.println("ChemSpiderID : " + ChemSpiderID);
        final String melting_point = p.getProperty("Melting_Point");
        //System.out.println("melting_point : " + melting_point);
        final String boiling_point = p.getProperty("Boiling_point");
        //System.out.println("boiling_point : " + boiling_point);
        final String Density = p.getProperty("<html>Density_(kg_m<sup>-3</sup>)</html>");
        //System.out.println("Density : " + Density);
        final String RelativeAtomicMass = p.getProperty("Relative_atomic_mass");
        //System.out.println("RelativeAtomicMass : " + RelativeAtomicMass);
        final String isotopes = p.getProperty("Key_isotopes");
        //System.out.println("isotopes : " + isotopes);
        final String CAS_number = p.getProperty("CAS_number");
        //System.out.println("CAS_number : " + CAS_number);
        final String Appearance = p.getProperty("Appearance");
        //System.out.println("Appearance : " + Appearance);
        final String Uses = p.getProperty("Uses");
        //System.out.println("Uses : " + Uses);
        final String BiologicalUses = p.getProperty("Biological_role");
        //System.out.println("Biological Uses : " + BiologicalUses);
        final String NaturalAbundance = p.getProperty("Natural_abundance");
        //System.out.println("Natural Abundance : " + NaturalAbundance);
        final String Atomic_radius = p.getProperty("Atomic_radius_(Angstrom)");
        //System.out.println("Atomic_radius : " + Atomic_number);
        final String Electronic_affinity = p.getProperty("<html>Electronic_affinity_(kJ_mol<sup>-1</sup>)</html>");
        //System.out.println("Electronic_affinity : " + Electronic_affinity);
        final String Ionisation_energy = p.getProperty("<html>Ionisation_energies_(kJ_mol<sup>-1</sup>)</html>");
        //System.out.println("Ionisation_energy : " + Ionisation_energy);
        final String Covalent_radius = p.getProperty("Covalent_radius_(Angstrom)");
        //System.out.println("Covalent_radius : " + Covalent_radius);
        final String Electronegativity = p.getProperty("Electronegativity_(Pauling_scale)");
        //System.out.println("Electronegativity : " + Electronegativity);
        final String Oxidation = p.getProperty("Common_oxidation_states");
        //System.out.println("Oxidation : " + Oxidation);
        final String MolarHeatCapacity = p.getProperty("<html>Molar_heat_capacity_(J_mol<sup>-1</sup>_K<sup>-1</sup>)</html>");
        //System.out.println("MolarHeatCapacity : " + MolarHeatCapacity);
        final String Shear_modulus = p.getProperty("Shear_modulus_(GPa)");
        //System.out.println("Shear_modulus : " + Shear_modulus);
        final String Young_modulus = p.getProperty("Young_modulus_(GPa)");
        //System.out.println("Young_modulus : " + Young_modulus);
        final String Bulk_modulus = p.getProperty("Bulk_modulus");
        //System.out.println("Bulk_modulus : " + Bulk_modulus);
        //done getting all the properties of the elements.
        logging.logIt("Done getting the properties of the elements.");
	logging.logIt("Now configuring all the tabs to show all the information collected.");
        
        //now configuring all the tabs to show
        //showing the properties collected above.
        JTabbedPane tabPane = new JTabbedPane();
        JComponent generalPanel = new General(IUPAC_Name,Discovery_date,Discovered_by,Origin,allotropes);
        generalScroll = new JScrollPane(generalPanel);
        JComponent factBox = new FactBox(Group,Period,Block,Atomic_number,State,electron_config,ChemSpiderID,melting_point,boiling_point,Density,RelativeAtomicMass,isotopes,CAS_number);
        frame.add(generalScroll, BorderLayout.CENTER);
        tabPane.addTab("General",generalPanel);
        tabPane.addTab("Fact Box",factBox);
        tabPane.addTab("Interesting Facts", new InterestingFacts(Appearance, Uses, BiologicalUses, NaturalAbundance));
        tabPane.addTab("Atomic Data", new AtomicData(Atomic_radius,Electronic_affinity,Ionisation_energy,Covalent_radius,Electronegativity));
        tabPane.addTab("Advanced", new Advanced(Oxidation, MolarHeatCapacity, Shear_modulus, Young_modulus, Bulk_modulus));
        //done configuring the tabulated Pane.
        logging.logIt("Done configuring the tabulated Pane");
        
	logging.logIt("Now just add some lingerie effects to the Frame.");
        //just the finishing touch up for the frame.
        panel.add(tabPane);
        tabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    public static void main(String args[]){
    	Elements.showElement("Cobalt.element");
    }
}
