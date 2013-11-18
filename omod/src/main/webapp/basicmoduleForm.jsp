<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<h2>PIH Malawi Customizations</h2>

<h3>HIV Reports</h3>
<!-- 
HIV Weekly Outcome Report: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hivweeklyoutcome.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hivweeklyoutcome.form">Remove</a>
<br/>

Pre-ART Weekly Report: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_preartweekly.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_preartweekly.form">Remove</a>
<br/>

HIV Program Changes Report: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hivprogramchanges.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hivprogramchanges.form">Remove</a>
<br/>
-->

HIV Visits Report: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hiv_visits.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hiv_visits.form">Remove</a>
<br/>

ARV Quarterly: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_arvquarterly.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_arvquarterly.form">Remove</a>
<br/>

ARV Regimen summary: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_arvregimen.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_arvregimen.form">Remove</a>
<br/>

ART Appointment Adherence: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_artappadherence.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_artappadherence.form">Remove</a>
<br/>

ART Register: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_artregister.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_artregister.form">Remove</a>
<br/>

HCC Register: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hccregister.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hccregister.form">Remove</a>
<br/>

Pre-ART Register (incl. old Pre-ART patients): <a href="${pageContext.request.contextPath}/module/pihmalawi/register_partregister.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_partregister.form">Remove</a>
<br/>

HCC Quarterly: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hccquarterly.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hccquarterly.form">Remove</a>
<br/>

APZU HIV Indicators: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_apzu_hiv.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_apzu_hiv.form">Remove</a>
<br/>

Exposed Child DNA-PCR results: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_exposed_dna.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_exposed_dna.form">Remove</a>
<br/>

<h4>Upper Neno</h4>
ART Missed Appointments: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_artmissedappointment.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_artmissedappointment.form">Remove</a>
<br/>

Pre-ART Missed Appointments: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_partmissedappointment.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_partmissedappointment.form">Remove</a>
<br/>

HCC Missed Appointments: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hccmissedappointment.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hccmissedappointment.form">Remove</a>
<br/>

<h4>Lower Neno</h4>
ART Missed Appointments Lower Neno: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_artmissedappointment_lowerneno.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_artmissedappointment_lowerneno.form">Remove</a>
<br/>

Pre-ART Missed Appointments Lower Neno: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_partmissedappointment_lowerneno.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_partmissedappointment_lowerneno.form">Remove</a>
<br/>

HCC Missed Appointments: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hccmissedappointment_lowerneno.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hccmissedappointment_lowerneno.form">Remove</a>
<br/>

<h3>HIV Data cleanup</h3>
HIV Data Quality: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_hivdataquality.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_hivdataquality.form">Remove</a>
<br/>

Find HIV Patients to merge: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_findpatientstomerge.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_findpatientstomerge.form">Remove</a>
<br/>

<h3>EMR Summary</h3>
Weekly Encounter Report: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_weeklyencounter.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_weeklyencounter.form">Remove</a>
<br/>

<h3>Chronic Care</h3>
Chronic Care Missed Appointments: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_chroniccaremissedappointment.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_chroniccaremissedappointment.form">Remove</a>
<br/>

Chronic Care Register: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_chroniccareregister.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_chroniccareregister.form">Remove</a>
<br/>

Chronic Care Appointment Adherence: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_chroniccareappadherence.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_chroniccareappadherence.form">Remove</a>
<br/>

Chronic Care Visits Report: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_cc_visits.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_cc_visits.form">Remove</a>
<br/>

<h3>TB</h3>
Tuberculosis Register: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_tb_register.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_tb_register.form">Remove</a>
<br/>

<h3>General</h3>
Appointments for Location and Date: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_appointments.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_appointments.form">Remove</a>
<br/>

PIH Quarterly Cross Site Indicators: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_pih_xsite.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_pih_xsite.form">Remove</a>
<br/>

KS Register Export: <a href="${pageContext.request.contextPath}/module/pihmalawi/register_ksregister.form">(Re) register</a>
<a href="${pageContext.request.contextPath}/module/pihmalawi/remove_ksregister.form">Remove</a>
<br/>

<%@ include file="/WEB-INF/template/footer.jsp"%>