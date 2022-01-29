/**
 * 
 */

	function validar() {
	var txtId = form1.txtId.value;
	var txtMatricula = form1.txtMatricula.value;
	var txtNome = form1.txtNome.value;
	var txtTeste = form1.txtTeste.value;
	var txtProva = form1.txtProva.value;


	if (txtId == "") {
		alert('2Preencha o campo Id');
		form1.txtId.focus();
		return false;
	}
	if (txtMatricula == "") {
		alert('Preencha o campo com a sua matricula');
		form1.txtMatricula.focus();
		return false;
	}
	if (txtNome == "") {
		alert('Preencha o campo com seu nome');
		form1.txtNome.focus();
		return false;
	}
	
	if (txtNome.length < 3) {
		alert('Digite seu nome completo');
		form1.txtNome.focus();
		return false;
	}
	
	if (txtTeste == "") {
		alert('Preencha o campo com a nota do seu teste');
		form1.txtTeste.focus();
		return false;
	}
	if (txtProva == "") {
		alert('Preencha o campo com a nota da sua prova');
		form1.txtProva.focus();
		return false;
	}

}
