/**
 *
  StudentID     int             NOT NULL,
  Title         varchar(5)      NOT NULL DEFAULT 'M.',
  FirstName     varchar(50)     NOT NULL,
  MiddleName    varchar(50)     NOT NULL,
  LastName      varchar(50)     NOT NULL,
  Address       varchar(50)     NULL,
  Zip           char(5)         NOT NULL,
  PhoneNumber   varchar(15)     NULL,
  Major         varchar(50)     NULL,
 */

INSERT INTO Student
    (StudentID, Title, FirstName, MiddleName, LastName, Address, Zip, PhoneNumber, Major)
VALUES
    (00319124,    'Miss.',    'Violet',   'F',    'Siegius',     '7304 Blueberry Lane',       '23506',      '7573457839',     'Computer Science'),
    (50150740,    'Mr.',      'Huey',     'P',    'Freeman',     '1204 Gold Road',            '33510',      '8456949022',     'Political Science'),
    (02345434,    'Mr.',      'Riley',    'J',    'Freeman',     '1204 Gold Road',            '33510',      '8456459012',     'Agriculture'),
    (83521976,    'Mr.',      'Jeffrey',  'M',    'Dowden',      '625  Hinkle Lake Road',     '43015',      '6174558857',     'PreMed'),
    (76045040,    'Mr.',      'Scott',    'R',    'Yates',       '3292 Elliott Street',       '03449',      '6035251968',     'Biology'),
    (04625529,    'Mr.',      'David',    'S',    'Yates',       '3481 Raintree Boulevard',   '55402',      '7639768610',     'Finance'),
    (49746228,    'Mrs.',     'Margaret', 'T',    'Santangelo',  '1234 Hoffman Avenue',       '10007',      '9179412870',     'Mathematics'),
    (87130888,    'Mrs.',     'Eva',      'L',    'Callahan',    '1341 Howard Street',        '01545',      '6164566498',     'Psychology'),
    (07829928,    'Mrs.',     'Maria',    'L',    'Totten',      '1001 Elk Creed Road',       '30501',      '7705354144',     'Philosophy'),
    (80317576,    'Mrs.',     'Wendy',    'J',    'Leone',       '2603 Patterson Fork Road',  '53154',      '3126183137',     'Law')

/**
  Zip           char(5)         NOT NULL,
  City          char(20)        NOT NULL,
  State         char(2)         NOT NULL,
 */

INSERT INTO ZipCode
    (ZipCode, City, State)
VALUES
    ('23506',     'Norfolk',      'VA'),
    ('33510',     'Brandon',      'FL'),
    ('53154',     'Oak Creek',    'WI'),
    ('44052',     'Lorain',       'OH'),
    ('01545',     'Shrewsbury',   'MA'),
    ('33125',     'Miami',        'FL'),
    ('28655',     'Morganton',    'NC'),
    ('30680',     'Winder',       'GA'),
    ('48185',     'Westland',     'MI'),
    ('43015',     'Delaware',     'OH'),
    ('30223',     'Griffin',      'GA');

/**
  Term          Number(6)       NOT NULL,
  CRN           varchar(10)     NOT NULL,
  Code          int(10)         NULL,
  Number        int(10)         NULL,
  Section       int(5)          NULL,
  Level         char(1)         NULL,
  Hours         int             NULL,
  Days          char(6)         NULL,
  Room          char(5)         NULL,
  Time          time            NULL,
 */

INSERT INTO Course
    (Term, CRN, Code, Num, Section, LVL, Hrs, Days, Room, Time)
VALUES
    (201510,    23769   ARC 102 01  M   5.000   Grph Comm Bsc Dsgn II   BE 106  MWF 09:00 am-11:50 am),
    (201510,    24666   ART 200 01  M   3.000   Understanding the Arts  AS 205  MWF 10:00 am-10:50 am),
    (201510,    25590   AVN 162 01  M   3.000   Private Skills Enhancement  ST 254  MWF 11:00 am-11:50 am),
    (201510,    24389   BIO 105 02  M   4.000   Intro to Biology I     TU 129    TR  12:30 pm-01:45 pm)
    (201510,    25406   CHE 202 05  M   4.000   Gen Chem/Qual Analys II TR  AR 115  09:30 am-10:45 am),
    (201510,    24500   CDS 606 01  M   3.000   Voice Disorders W   06:00 pm-08:45 pm   35  0   35  0   0   0   0   0   0   Alva Cook (P), Dorian Lee-Wilkerson 01/07-05/08 ST 214
    (201510,    24340   COM 103 23  M   3.000   Oral Communication  TR  02:00 pm-03:15 pm   25  9   16  0   0   0   0   0   0   TBA 01/07-05/08 AR 236
    (201510,    25467   CSC 152 01  M   3.000   Computer Progrmng II    TR  02:00 pm-03:15 pm   25  6   19  0   0   0   0   0   0   Chutima Boonthum-Denecke (P)    01/07-05/08 ST 126
    (201510,    24825   ECO 200 01  M   3.000   Intro to Econ   TR  05:00 pm-06:15 pm   45  3   42  0   0   0   0   0   0   Larry A. Gillus (P) 01/07-05/08 BU 122
    (201510,    24685   ENG 207 01  M   3.000   Intro to Fiction    MW  02:00 pm-03:15 pm   20  11  9   0   0   0   0   0   0   Randolph Walker (P) 01/07-05/08 AR 236

INSERT INTO Form
    (StudentID, Term, CRN, Date, GradeType, Status, PreReg, TotalCredits)
VALUES
    ('00319124', 5.0, 003242, 10/22/15, Undergraduate, ),
    ('50150740', ),
    ('02345434', ),
    ('83521976', ),
    ('76045040', ),
    ('04625529', ),
    ('49746228', ),
    ('87130888', ),
    ('07829928', ),
    ('80317576', );