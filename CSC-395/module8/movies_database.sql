CREATE TABLE IF NOT EXISTS `movies` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `title` varchar(32) NOT NULL,
 `year` int(4) NOT NULL,
 `poster` varchar(255) NOT NULL,
 `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=52 ;
 
INSERT INTO `movies` (`id`, `title`, `year`, `poster`, `modified`) VALUES
(28, 'John Carter', '2012', 'http://image.tmdb.org/t/p/w185/p4v7ke01C3TVkyIVsQLb7u5jbYV.jpg', '2012-01-11 11:11:11'),
(51, 'Avatar', '2009', 'http://image.tmdb.org/t/p/w185/tcqb9NHdw9SWs2a88KCDD4V8sVR.jpg', '2009-01-01 18:44:19');
