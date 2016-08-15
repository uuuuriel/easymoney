$(document).ready(function(){
	CL.cadastrar = function(){
		CL.ajax.post({
			url:"cliente/cadastrar",
			data: $("#form").serialize(),
			success:function(succ){
				console.log(succ);
			},
			error:function(err){
				console.log(err.responseText);
			}
		})
	}
})