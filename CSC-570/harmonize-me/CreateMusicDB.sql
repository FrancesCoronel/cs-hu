CREATE TABLE IF NOT EXISTS `music` (
 `id` int(10) NOT NULL AUTO_INCREMENT,
 `song` varchar(50) NOT NULL,
 `artist` varchar(50) NOT NULL,
 `album` varchar(100) NOT NULL,
 `genre` varchar(50) NOT NULL,
 `artwork` varchar(255) NOT NULL,
 `source` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=52 ;

INSERT INTO `music`
(`id`, `song`, `artist`, `album`, `genre`, `artwork`, `source`) VALUES
(1,    '50 Shades of Pop',    'DJ Earworm',   'Poppin Sounds',  'Pop',    'https://i1.sndcdn.com/artworks-000138397627-vej5ik-t500x500.jpg',  'http://puu.sh/lYhyJ/82683bb254.mp3'),
(2,    'Rustic Vinyl',        'Jukedeck',     'Techno Tunes',   'Techno', 'https://index.tnwcdn.com/images/10187d8c89fad233d81d4fe5655ed9af2f194005.png',   'http://puu.sh/lY9L6/a37c40867f.mp3'),
(3,    'Hey Senorita',        'Starchild',    'World Wonders',  'World',  'https://i1.sndcdn.com/artworks-000009510124-98eee7-t500x500.jpg',  'http://puu.sh/lYhwA/01b4f293d1.mp3'),
(4,    'Miniature Vortex',    'Jukedeck',     'Techno Tunes',   'Techno', 'https://index.tnwcdn.com/images/10187d8c89fad233d81d4fe5655ed9af2f194005.png',   'https://puu.sh/lY9L6/a37c40867f.mp3'),
(5,    'Miniscule Brew',      'Jukedeck',     'Techno Tunes',   'Techno', 'https://index.tnwcdn.com/images/10187d8c89fad233d81d4fe5655ed9af2f194005.png',   'https://puu.sh/lY9KA/ae53f567e4.mp3');