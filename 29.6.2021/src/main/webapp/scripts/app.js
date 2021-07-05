/**
 * 
 */
document.getElementById("update").disabled=true;
function update(sno,name,city){
	document.getElementById("update").disabled=false;
	document.getElementById("save").disabled=true;
	console.log(sno,name,city)
	document.forms[0].sno.value=sno;
	document.forms[0].name.value=name;
	document.forms[0].city.value=city;
}

function deletedata(sno){
	location.href="simpleform.do?id="+sno+"&method=delete";
}