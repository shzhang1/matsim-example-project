/* *********************************************************************** *
 * project: org.matsim.*												   *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2008 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */
package org.matsim.example;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.api.experimental.events.EventsManager;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy.OverwriteFileSetting;
import org.matsim.core.events.EventsUtils;
import org.matsim.core.events.MatsimEventsReader;
import org.matsim.core.scenario.ScenarioUtils;

/**
 * @author nagel
 *
 */
public class HelloWorld {
// a comment

	public static void main(String[] args) {
//
//		// This creates a default matsim config:
//		Config config = ConfigUtils.loadConfig( "C:\\Users\\I309939\\Documents\\matsim-example-project\\src\\main\\java\\org\\matsim\\example\\example-config.xml" ) ;
//
//		config.controler().setLastIteration(1);
//		config.controler().setOverwriteFileSetting( OverwriteFileSetting.deleteDirectoryIfExists );
//
//		// This creates a default matsim scenario (which is empty):
//		Scenario scenario = ScenarioUtils.createScenario(config) ;
//
//		Controler controler = new Controler( scenario ) ;
//
//		// This indeed runs iterations, but based on an empty scenario:
//		controler.run();


		//path to events file
		String inputFile = "output\\0.events.txt.gz";
		//create an event object
		EventsManager events = EventsUtils.createEventsManager();

		//create the reader and read the file
		MatsimEventsReader reader = new MatsimEventsReader(events);
		reader.readFile(inputFile);


	}

}
