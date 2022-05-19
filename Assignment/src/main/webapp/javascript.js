	function printvalue() {
		var x = document.getElementById('val').value;
		/* alert(x); */
		document.getElementById('id1').innerHTML = "value of number is" + x;
	}

	function positiveornot() {

		var x = document.getElementById('val').value;

		if (x >= 0) {
			document.getElementById('id2').innerHTML = "number is positive "
					+ x;
		} else {
			document.getElementById('id2').innerHTML = "number is negative "
					+ x;

		}
	}

	function printtable() {

		var x = document.getElementById('val').value;

		var result = "";

		for (var i = 1; i <= 10; i++) {
			var table = x * i;
			result = result + "<br>" + table;
		}
		document.getElementById('table').innerHTML = "Table of" + x + "is"
				+ "<br>" + result;
	}

	function checkVowel() {
		ch = document.getElementById("char").value;
		if (ch) {
			temp = document.getElementById("resPara");
			temp.style.display = "block";
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
						|| ch == 'u')
					document.getElementById("res").innerHTML = "a Vowel";
				else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
						|| ch == 'U')
					document.getElementById("res").innerHTML = "a Vowel";
				else
					document.getElementById("res").innerHTML = "a Consonant";
			} else
				document.getElementById("res").innerHTML = "neither Vowel nor Consonant";
		}
	}
	function evenornot() {
		even = document.getElementById('even').value;

		if (even % 2 == 0) {
			alert(even % 2);
			document.getElementById("evenPara").innerHTML = "Even Number";
		} else {
			document.getElementById("evenPara").innerHTML = "Odd Number";

		}

	}

	function factorial() {
		factorial = document.getElementById('fact').value;
		var answer = 1;

		for (var i = factorial; i >= 1; i--) {
			answer = answer * i

		}
		document.getElementById("factPara").innerHTML = "Factorial of "
				+ factorial + " is " + answer;
	}