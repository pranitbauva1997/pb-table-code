#!/usr/bin/env python2
global dataValues
dataValues = ["IUPAC_Name","Discovery_date","Discovered_by","Origin_of_the_name","allotropes", "Group", "Period", "Block", "Atomic_Number", "State_at_room_temperature", "Electron_configuration", "ChemSpider_ID", "Melting_Point", "Boiling_point",
	"<html>Density_(kg_m<sup>-3</sup>)</html>", "Relative_atomic_mass", "Key_isotopes", "CAS_number", "Appearance", "Uses", "Biological_role",
	"Natural_abundance", "Atomic_radius_(Angstrom)", "<html>Electronic_affinity_(kJ_mol<sup>-1</sup>)</html>", "<html>Ionisation_energies_(kJ_mol<sup>-1</sup>)</html>", "Covalent_radius_(Angstrom)",
	"Electronegativity_(Pauling_scale)", "Common_oxidation_states", "<html>Molar_heat_capacity_(J_mol<sup>-1</sup>_K<sup>-1</sup>)</html>", "Shear_modulus_(GPa)", "Young_modulus_(GPa)", "Bulk_modulus"]

#now begins the main thing!!!!

nums = int(raw_input("How many files do you want?: "))
for blah in range(1,nums+1):
	fileName = raw_input("Enter file name: ")
	fileName += ".element"
	fileObject = open(fileName, 'w', 1)
	for i in dataValues:
		r = raw_input("Enter "+i+": ")
		fileObject.write(i+"="+r+"\n")
	fileObject.close()
