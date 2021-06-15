<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload | image | analysis</title>
</head>
<body>

	<h2>Upload Image that is relevant to the system</h2>
	<hr>
	<form action="upload-image-page" method="post"
		enctype="multipart/form-data">

		File <input type="file" name="file" id="file"><br>
		<br> <input type="submit" value="submit">


	</form>

</body>
</html>