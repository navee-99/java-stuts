/**
 * 
 */
document.getElementById("update").disabled=true;
function update(ticketid,byuser,status,toadmin,subject,description,comands,dateraised)
{
	document.getElementById("update").disabled=false;
	
	console.log(ticketid,byuser,status,toadmin,subject,description,comands,dateraised)
	document.forms[0].ticketid.value=ticketid;
	document.forms[0].byuser.value=byuser;
	document.forms[0].status.value=status;
	document.forms[0].toadmin.value=toadmin;
	document.forms[0].subject.value=subject;
	document.forms[0].description.value=description;
	document.forms[0].comands.value=comands;
	document.forms[0].dateraised.value=dateraised;
}