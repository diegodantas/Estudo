<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Teste</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
	<div id="container"></div>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$
									.getJSON(
											"${pageContext.request.contextPath}/preenchimento/json",
											function(data) {
												$('#container')
														.highcharts(
																{
																	title : {
																		text : 'Preenchimento',
																		x : -20
																	//center
																	},
																	xAxis : {
																		categories : [
																				'Jan',
																				'Feb',
																				'Mar',
																				'Apr',
																				'May',
																				'Jun',
																				'Jul',
																				'Aug',
																				'Sep',
																				'Oct',
																				'Nov',
																				'Dec' ]
																	},
																	yAxis : {
																		title : {
																			text : 'Escala de Preenchimento %'
																		},
																		plotLines : [ {
																			value : 0,
																			width : 1,
																			color : '#808080'
																		} ]
																	},
																	tooltip : {
																		valueSuffix : '%'
																	},
																	legend : {
																		layout : 'vertical',
																		align : 'right',
																		verticalAlign : 'middle',
																		borderWidth : 0
																	},
																	series : data
																});
											});
						});
	</script>

</body>
</html>