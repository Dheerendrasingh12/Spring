function validate(frm){
	document.getElementById("pnameErr").innerHTML = "";
	document.getElementById("pageErr").innerHTML = "";

	var name = frm.pname.value;
	var page = frm.page.value;
	
	
	frm.vflag.value = "yes";
	
	if(pname==""{
		document.getElementById("pnameErr").outerHTML ="Person name is Required";
		frm.pname.focus();
		return false;
	
	
	}
	else if (page ==""){
	document.getElementById("pageErr").innerHTML = "Person age is required";
	frm.page.focus();
	return false;
}
else if (isNaN(page)){
	document.getElementById("pageErr").innerHTML ="Persong age must be numeric";
	frm.page.focus();
	frm.page.value="";
	return false;

}
else if(page<=0 || page>=126){
	document.getElementById("pageErr").innerHTML = "Person age must be there greater than 0 and smaller than 126";
	frm.page.focus();
	frm.page.value="";
	return false;

}

return true;











}
