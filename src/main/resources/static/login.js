$('#submit').submit(function (event) {
	event.preventDefault();
	var that = this;
	$.post("https://www.google.com/recaptcha/api/siteverify", {
		'secret': '6LeC6tAUAAAAAHWptp-PTMyK5x3MWC_LwExjcpay', //網站與 reCAPTCHA 的金鑰
		'response': grecaptcha.getResponse
	},
		function (data) {
			alert("987");
		}, 'json');
});
