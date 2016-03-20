<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head lang="en">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HarmonizeMe</title>
    <link rel="stylesheet" href="https://cdn.rawgit.com/twbs/bootstrap/v4-dev/dist/css/bootstrap.css">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/font-awesome-4.3.0/css/font-awesome.min.css">
	<link rel="shortcut icon" href="media/favicon.ico" type="image/x-icon" />
</head>

<body>
    <main role="main">
      <h1>HarmonizeMe</h1>

      <h2>
        Welcome to HarmonizeMe!
        <small>This is your home base for a musical adventure.</small>
      </h2>
      <br>
      <a href="music.jsp"><button type="button" class="btn btn-danger-outline btn-lg">Let's go!</button></a>
      <br>
      <br>
      <p>Copyright © HarmonizeTeam 2015</p>
    </main>

    <video autoplay loop muted poster="media/background-video-poster.jpg">
      <source src="media/background-video.webm" type="video/webm">
      <source src="media/background-video.mp4"  type="video/mp4">
    </video>

    <div class="video-overlay"></div>
</body>
</html>
