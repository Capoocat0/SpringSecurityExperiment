<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output
		encoding="UTF-8"
		media-type="text/html"
		method="html"
		indent="no"
		omit-xml-declaration="yes"
	/>

	<xsl:template match="/">
		<xsl:text disable-output-escaping="yes">&#60;!DOCTYPE HTML&#62;</xsl:text>
		<HTML lang="zh-TW">
			<HEAD>
				<TITLE>會員登入</TITLE>
				<script type="text/javascript">
					var verifyCallback = function(response) {
					alert(response);
					};
					var widgetId1;
					var widgetId2;
					var onloadCallback = function() {
					// Renders the HTML element with id 'example1' as a reCAPTCHA widget.
					// The id of the reCAPTCHA widget is assigned to 'widgetId1'.
					widgetId1 = grecaptcha.render('example1', {
					'sitekey' : '6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ',
					'theme' : 'light'
					});
					widgetId2 = grecaptcha.render(document.getElementById('example2'), {
					'sitekey' : '6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ'
					});
					grecaptcha.render('example3', {
					'sitekey' : '6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ',
					'callback' : verifyCallback,
					'theme' : 'dark'
					});
					};
				</script>
				<SCRIPT src="https://www.google.com/recaptcha/api.js"/>
			</HEAD>
			<BODY>
				<xsl:apply-templates select="document"/>
			</BODY>
		</HTML>
	</xsl:template>

	<xsl:template match="document">
		<FORM class="from" action="" method="POST">
			<DIV id="example1"></DIV>
			<DIV class="form-group">
				<LABEL for="username">帳號：</LABEL>
				<INPUT type="text" class="form-control" name="username" id="username" />
			</DIV>
			<DIV class="form-group">
				<LABEL for="password">密碼：</LABEL>
				<INPUT type="password" class="form-control" name="password" id="password" />
			</DIV>
			<DIV class="form-group">
				<INPUT type="checkbox" name="remember" id="remember"/>
				<LABEL for="remember">記住我</LABEL>
			</DIV>
			
			<BUTTON type="submit" class="btn btn-primary">送出</BUTTON>
			<DIV class="g-recaptcha" data-sitekey="6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ"></DIV>
		</FORM>
		<FORM class="from" action="" method="POST">
			<DIV id="example2"></DIV>
			<DIV class="form-group">
				<LABEL for="username">帳號：</LABEL>
				<INPUT type="text" class="form-control" name="username" id="username" />
			</DIV>
			<DIV class="form-group">
				<LABEL for="password">密碼：</LABEL>
				<INPUT type="password" class="form-control" name="password" id="password" />
			</DIV>
			<DIV class="form-group">
				<INPUT type="checkbox" name="remember" id="remember"/>
				<LABEL for="remember">記住我</LABEL>
			</DIV>
			
			<BUTTON type="submit" class="btn btn-primary">送出</BUTTON>
			<DIV class="g-recaptcha" data-sitekey="6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ"></DIV>
		</FORM>
		<FORM class="from" action="" method="POST">
			<DIV id="example3"></DIV>
			<DIV class="form-group">
				<LABEL for="username">帳號：</LABEL>
				<INPUT type="text" class="form-control" name="username" id="username" />
			</DIV>
			<DIV class="form-group">
				<LABEL for="password">密碼：</LABEL>
				<INPUT type="password" class="form-control" name="password" id="password" />
			</DIV>
			<DIV class="form-group">
				<INPUT type="checkbox" name="remember" id="remember"/>
				<LABEL for="remember">記住我</LABEL>
			</DIV>
			
			<BUTTON type="submit" class="btn btn-primary">送出</BUTTON>
			<DIV class="g-recaptcha" data-sitekey="6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ"></DIV>
		</FORM>
		<SCRIPT src="static1/SCRIPT/loggin.js"/>
	</xsl:template>
</xsl:stylesheet>