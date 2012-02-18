package org.openmrs.module.pihmalawi.reports.setup;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openmrs.api.context.Context;
import org.openmrs.module.pihmalawi.reports.ApzuReportElementsArt;
import org.openmrs.module.pihmalawi.reports.Helper;
import org.openmrs.module.pihmalawi.reports.dataset.AppointmentAdherencePatientDataSetDefinition;
import org.openmrs.module.pihmalawi.reports.dataset.HtmlBreakdownDataSetDefinition;
import org.openmrs.module.pihmalawi.reports.renderer.ArtRegisterBreakdownRenderer;
import org.openmrs.module.reporting.ReportingConstants;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.openmrs.module.reporting.report.ReportDesign;
import org.openmrs.module.reporting.report.definition.PeriodIndicatorReportDefinition;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.openmrs.module.reporting.report.service.ReportService;
import org.openmrs.module.reporting.report.util.PeriodIndicatorReportUtil;
import org.openmrs.serialization.SerializationException;

public class SetupArtRegister {

	Helper h = new Helper();

	public SetupArtRegister(Helper helper) {
		h = helper;
	}

	public ReportDefinition[] setup() throws Exception {
		delete();

		ReportDefinition rd = createReportDefinition("artreg");
		h.replaceReportDefinition(rd);
		createHtmlBreakdown(rd);
		createAppointmentAdherenceBreakdown(rd);

		return new ReportDefinition[] { rd };
	}

	private ReportDesign createAppointmentAdherenceBreakdown(ReportDefinition rd) throws IOException, SerializationException {
		Map<String, Mapped<? extends DataSetDefinition>> m = new LinkedHashMap<String, Mapped<? extends DataSetDefinition>>();

		AppointmentAdherencePatientDataSetDefinition dsd = new AppointmentAdherencePatientDataSetDefinition();
		dsd.setEncounterTypes(Arrays.asList(h.encounterType("ART_FOLLOWUP")));
		dsd.setPatientIdentifierType(Context.getPatientService()
				.getPatientIdentifierTypeByName("ARV Number"));

		m.put("breakdown", new Mapped<DataSetDefinition>(dsd, null));

		return h.createHtmlBreakdown(rd, "ART Register Appointment Adherence_", m);

		
		
	}

	protected ReportDesign createHtmlBreakdown(ReportDefinition rd)
			throws IOException, SerializationException {
		Map<String, Mapped<? extends DataSetDefinition>> m = new LinkedHashMap<String, Mapped<? extends DataSetDefinition>>();

		HtmlBreakdownDataSetDefinition dsd = new HtmlBreakdownDataSetDefinition();
		dsd.setPatientIdentifierType(Context.getPatientService()
				.getPatientIdentifierTypeByName("ARV Number"));
		dsd.setHtmlBreakdownPatientRowClassname(ArtRegisterBreakdownRenderer.class
				.getName());

		m.put("breakdown", new Mapped<DataSetDefinition>(dsd, null));

		return h.createHtmlBreakdown(rd, "ART Register_", m);
	}

	public void delete() {
		ReportService rs = Context.getService(ReportService.class);
		for (ReportDesign rd : rs.getAllReportDesigns(false)) {
			if (rd.getName().startsWith("ART Register")) {
				rs.purgeReportDesign(rd);
			}
		}
		h.purgeDefinition(DataSetDefinition.class, "ART Register_ Data Set");
		h.purgeDefinition(ReportDefinition.class, "ART Register_");
		h.purgeAll("artreg");
	}

	private ReportDefinition createReportDefinition(String prefix) {
		PeriodIndicatorReportDefinition rd = new PeriodIndicatorReportDefinition();
		rd.removeParameter(ReportingConstants.START_DATE_PARAMETER);
		rd.removeParameter(ReportingConstants.END_DATE_PARAMETER);
		rd.addParameter(new Parameter("endDate", "End date (today)", Date.class));
		rd.setName("ART Register_");
		rd.setupDataSetDefinition();

		CohortDefinition cd = ApzuReportElementsArt
				.everOnArtAtLocationStartedOnOrBefore(prefix);
		CohortIndicator i = h.newCountIndicator(prefix + "Register_", cd
				.getName(), h.parameterMap("location", "${location}",
				"startedOnOrBefore", "${endDate}"));
		PeriodIndicatorReportUtil
				.addColumn(rd, "breakdown", "Breakdown", i, null);

		return rd;
	}
}
