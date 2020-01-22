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
				<SCRIPT src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"/>
				<SCRIPT src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"/>
				<SCRIPT async="" defer="" src="https://www.google.com/recaptcha/api.js?onload=onloadCallback&#38;render=explicit"/>
				
				<SCRIPT>
					const tokenDOM = document.getElementById('token');
					var onloadCallback = function () {
					widgetId = grecaptcha.render(
					'wtf', {'sitekey': '6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ'});};
				</SCRIPT>
				
				<TITLE>會員登入</TITLE>
			</HEAD>
			<BODY>
				<xsl:apply-templates select="document"/>
				<SCRIPT src="/login.js"/>
			</BODY>
		</HTML>
	</xsl:template>

	<xsl:template match="document">
		<FORM class="form" action="" method="POST">
			<DIV class="form-group">
				<LABEL for="username">帳號：</LABEL>
				<INPUT type="text" class="form-control" name="username" id="username"/>
			</DIV>
			<DIV class="form-group">
				<LABEL for="password">密碼：</LABEL>
				<INPUT type="password" class="form-control" name="password" id="password"/>
			</DIV>
			<DIV class="form-group">
				<INPUT type="checkbox" name="remember" id="remember"/>
				<LABEL for="remember">記住我</LABEL>
			</DIV>
			<BUTTON id="submit" type="submit" class="btn btn-primary">送出</BUTTON>
			<DIV id="wtf" data-sitekey="6LeC6tAUAAAAALe40E10eHU5Yo72LU_BvZ3QnslZ"></DIV>
			<span id="captcha" style="margin-left:100px;color:red" />
		</FORM>
	</xsl:template>
</xsl:stylesheet>