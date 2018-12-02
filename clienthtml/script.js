$(function (){
	var url = "ws://localhost:8080/websocketserver/WebSocketServer";
	
	$('#submitMessage').on('click', function() {
		var str = $('input:text[name="main_box"]').val();
		console.log(str);
		
		if(!(str == "")){
			var ws = new WebSocket(url);
			ws.onmessage = function(receive) {
			$("#message").text(receive.data);
			};
			ws.onopen = function () {
			ws.send(str);
			console.log("sended message");
			};
		}else console.log("aa");
	});
});