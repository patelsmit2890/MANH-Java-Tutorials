function sum() {
		var txtFirstNumberValue = document.getElementById('txt1').value;
		var txtSecondNumberValue = document.getElementById('txt2').value;
		var result = parseInt(txtFirstNumberValue)
				+ parseInt(txtSecondNumberValue);
		if (!isNaN(result)) {
			document.getElementById('txt3').value = result;
		}
	}
	function f1()
	{
		var txtFirstNumberValue = document.getElementById('txt1').value;
		var txtSecondNumberValue = document.getElementById('txt2').value;
		var result = parseInt(txtFirstNumberValue)
		+ parseInt(txtSecondNumberValue);	
		document.getElementById("msg").innerHTML='Hi.. Total of '+txtFirstNumberValue+" and "+txtSecondNumberValue+" is : "+result;
		
	}
	function f2(){
		
		var d=new Date();
		document.getElementById("time").innerHTML=d;
	}
	setInterval(function call(){f2()}, 1000)