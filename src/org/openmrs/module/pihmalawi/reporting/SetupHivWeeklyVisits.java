package org.openmrs.module.pihmalawi.reporting;

import java.util.Arrays;
import java.util.Date;

import org.openmrs.Location;
import org.openmrs.api.context.Context;
import org.openmrs.module.pihmalawi.reporting.repository.ArtReportElements;
import org.openmrs.module.reporting.cohort.definition.EncounterCohortDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.definition.PeriodIndicatorReportDefinition;
import org.openmrs.module.reporting.report.util.PeriodIndicatorReportUtil;

public class SetupHivWeeklyVisits {

	Helper h = new Helper();

	public SetupHivWeeklyVisits(Helper helper) {
		h = helper;
	}

	public void newCountIndicatorForVisits(String namePrefix, String cohort) {
		for (Location loc : ArtReportElements.hivLocations()) {
			h.newCountIndicator(namePrefix + " (" + loc.getName() + ")_",
					cohort, h.parameterMap("onOrAfter", "${endDate-1w}",
							"locationList", Arrays.asList(loc), "onOrBefore",
							"${endDate}"));
			h.newCountIndicator(namePrefix + " 1 week ago (" + loc.getName()
					+ ")_", cohort, h.parameterMap("onOrAfter",
					"${endDate-2w}", "locationList", Arrays.asList(loc),
					"onOrBefore", "${endDate-1w}"));
			h.newCountIndicator(namePrefix + " 2 weeks ago (" + loc.getName()
					+ ")_", cohort, h.parameterMap("onOrAfter",
					"${endDate-3w}", "locationList", Arrays.asList(loc),
					"onOrBefore", "${endDate-2w}"));
		}
	}

	public void createCohortDefinitions() {
		// ART
		EncounterCohortDefinition ecd = new EncounterCohortDefinition();
		ecd.setName("hiv: ART Patient visits_");
		ecd.setEncounterTypeList(Arrays.asList(Context.getEncounterService()
				.getEncounterType("ART_INITIAL"), Context.getEncounterService()
				.getEncounterType("ART_FOLLOWUP")));
		ecd.addParameter(new Parameter("onOrAfter", "onOrAfter", Date.class));
		ecd.addParameter(new Parameter("onOrBefore", "onOrBefore", Date.class));
		ecd.addParameter(new Parameter("locationList", "locationList",
				Location.class));
		h.replaceCohortDefinition(ecd);

		// Pre-ART
		ecd = new EncounterCohortDefinition();
		ecd.setName("hiv: Pre-ART Patient visits_");
		ecd.setEncounterTypeList(Arrays.asList(Context.getEncounterService()
				.getEncounterType("PART_INITIAL"), Context
				.getEncounterService().getEncounterType("PART_FOLLOWUP")));
		ecd.addParameter(new Parameter("onOrAfter", "onOrAfter", Date.class));
		ecd.addParameter(new Parameter("onOrBefore", "onOrBefore", Date.class));
		ecd.addParameter(new Parameter("locationList", "locationList",
				Location.class));
		h.replaceCohortDefinition(ecd);

		// EID
		ecd = new EncounterCohortDefinition();
		ecd.setName("hiv: EID Patient visits_");
		ecd.setEncounterTypeList(Arrays.asList(Context.getEncounterService()
				.getEncounterType("EID_INITIAL"), Context.getEncounterService()
				.getEncounterType("EID_FOLLOWUP")));
		ecd.addParameter(new Parameter("onOrAfter", "onOrAfter", Date.class));
		ecd.addParameter(new Parameter("onOrBefore", "onOrBefore", Date.class));
		ecd.addParameter(new Parameter("locationList", "locationList",
				Location.class));
		h.replaceCohortDefinition(ecd);
	}

	public void addColumnForLocationsForVisits(
			PeriodIndicatorReportDefinition rd, String displayNamePrefix,
			String indicatorFragment, String indicatorKey) {
		for (Location loc : ArtReportElements.hivLocations()) {
			PeriodIndicatorReportUtil.addColumn(
					rd,
					indicatorKey + ArtReportElements.hivSiteCode(loc),
					displayNamePrefix + " (" + loc.getName() + ")",
					h.cohortIndicator("hiv: " + indicatorFragment + " ("
							+ loc.getName() + ")_"), null);
		}
	}
}
